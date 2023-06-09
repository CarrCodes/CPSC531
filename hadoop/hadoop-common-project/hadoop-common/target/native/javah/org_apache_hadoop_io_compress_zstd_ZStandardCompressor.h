/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_apache_hadoop_io_compress_zstd_ZStandardCompressor */

#ifndef _Included_org_apache_hadoop_io_compress_zstd_ZStandardCompressor
#define _Included_org_apache_hadoop_io_compress_zstd_ZStandardCompressor
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_apache_hadoop_io_compress_zstd_ZStandardCompressor
 * Method:    create
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_apache_hadoop_io_compress_zstd_ZStandardCompressor_create
  (JNIEnv *, jclass);

/*
 * Class:     org_apache_hadoop_io_compress_zstd_ZStandardCompressor
 * Method:    init
 * Signature: (IJ)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_io_compress_zstd_ZStandardCompressor_init
  (JNIEnv *, jclass, jint, jlong);

/*
 * Class:     org_apache_hadoop_io_compress_zstd_ZStandardCompressor
 * Method:    deflateBytesDirect
 * Signature: (Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;I)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_io_compress_zstd_ZStandardCompressor_deflateBytesDirect
  (JNIEnv *, jobject, jobject, jint, jint, jobject, jint);

/*
 * Class:     org_apache_hadoop_io_compress_zstd_ZStandardCompressor
 * Method:    getStreamSize
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_io_compress_zstd_ZStandardCompressor_getStreamSize
  (JNIEnv *, jclass);

/*
 * Class:     org_apache_hadoop_io_compress_zstd_ZStandardCompressor
 * Method:    end
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_io_compress_zstd_ZStandardCompressor_end
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_apache_hadoop_io_compress_zstd_ZStandardCompressor
 * Method:    initIDs
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_io_compress_zstd_ZStandardCompressor_initIDs
  (JNIEnv *, jclass);

/*
 * Class:     org_apache_hadoop_io_compress_zstd_ZStandardCompressor
 * Method:    getLibraryName
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_apache_hadoop_io_compress_zstd_ZStandardCompressor_getLibraryName
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
