/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.crypto;

import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_BUFFER_SIZE_DEFAULT;
import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_BUFFER_SIZE_KEY;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Seekable;
import org.apache.hadoop.util.CleanerUtil;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InterfaceAudience.Private
public class CryptoStreamUtils {
  private static final int MIN_BUFFER_SIZE = 512;
  private static final Logger LOG =
      LoggerFactory.getLogger(CryptoStreamUtils.class);

  /**
   * Forcibly free the direct buffer.
   * @param buffer input buffer.
   */
  public static void freeDB(ByteBuffer buffer) {
    if (CleanerUtil.UNMAP_SUPPORTED) {
      try {
        CleanerUtil.getCleaner().freeBuffer(buffer);
      } catch (IOException e) {
        LOG.info("Failed to free the buffer", e);
      }
    } else {
      LOG.trace(CleanerUtil.UNMAP_NOT_SUPPORTED_REASON);
    }
  }

  /**
   * @return Read crypto buffer size.
   * @param conf input Configuration.
   */
  public static int getBufferSize(Configuration conf) {
    return conf.getInt(HADOOP_SECURITY_CRYPTO_BUFFER_SIZE_KEY, 
        HADOOP_SECURITY_CRYPTO_BUFFER_SIZE_DEFAULT);
  }
  
  /**
   * AES/CTR/NoPadding is required.
   * @param codec input code.
   */
  public static void checkCodec(CryptoCodec codec) {
    if (codec.getCipherSuite() != CipherSuite.AES_CTR_NOPADDING) {
      throw new UnsupportedCodecException("AES/CTR/NoPadding is required");
    }
  }

  /**
   * @return Check and floor buffer size.
   *
   * @param codec input code.
   * @param bufferSize input bufferSize.
   */
  public static int checkBufferSize(CryptoCodec codec, int bufferSize) {
    Preconditions.checkArgument(bufferSize >= MIN_BUFFER_SIZE, 
        "Minimum value of buffer size is " + MIN_BUFFER_SIZE + ".");
    return bufferSize - bufferSize % codec.getCipherSuite()
        .getAlgorithmBlockSize();
  }
  
  /**
   * @return If input stream is {@link org.apache.hadoop.fs.Seekable}, return it's
   * current position, otherwise return 0.
   * @param in input in.
   * @throws IOException raised on errors performing I/O.
   */
  public static long getInputStreamOffset(InputStream in) throws IOException {
    if (in instanceof Seekable) {
      return ((Seekable) in).getPos();
    }
    return 0;
  }
}
