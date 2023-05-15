/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_apache_hadoop_net_unix_DomainSocket */

#ifndef _Included_org_apache_hadoop_net_unix_DomainSocket
#define _Included_org_apache_hadoop_net_unix_DomainSocket
#ifdef __cplusplus
extern "C" {
#endif
#undef org_apache_hadoop_net_unix_DomainSocket_SEND_BUFFER_SIZE
#define org_apache_hadoop_net_unix_DomainSocket_SEND_BUFFER_SIZE 1L
#undef org_apache_hadoop_net_unix_DomainSocket_RECEIVE_BUFFER_SIZE
#define org_apache_hadoop_net_unix_DomainSocket_RECEIVE_BUFFER_SIZE 2L
#undef org_apache_hadoop_net_unix_DomainSocket_SEND_TIMEOUT
#define org_apache_hadoop_net_unix_DomainSocket_SEND_TIMEOUT 3L
#undef org_apache_hadoop_net_unix_DomainSocket_RECEIVE_TIMEOUT
#define org_apache_hadoop_net_unix_DomainSocket_RECEIVE_TIMEOUT 4L
/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    anchorNative
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_anchorNative
  (JNIEnv *, jclass);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    validateSocketPathSecurity0
 * Signature: (Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_validateSocketPathSecurity0
  (JNIEnv *, jclass, jstring, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    bind0
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_bind0
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    socketpair0
 * Signature: ()[I
 */
JNIEXPORT jintArray JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_socketpair0
  (JNIEnv *, jclass);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    accept0
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_accept0
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    connect0
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_connect0
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    setAttribute0
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_setAttribute0
  (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    getAttribute0
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_getAttribute0
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    close0
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_close0
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    closeFileDescriptor0
 * Signature: (Ljava/io/FileDescriptor;)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_closeFileDescriptor0
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    shutdown0
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_shutdown0
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    sendFileDescriptors0
 * Signature: (I[Ljava/io/FileDescriptor;[BII)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_sendFileDescriptors0
  (JNIEnv *, jclass, jint, jobjectArray, jbyteArray, jint, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    receiveFileDescriptors0
 * Signature: (I[Ljava/io/FileDescriptor;[BII)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_receiveFileDescriptors0
  (JNIEnv *, jclass, jint, jobjectArray, jbyteArray, jint, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    readArray0
 * Signature: (I[BII)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_readArray0
  (JNIEnv *, jclass, jint, jbyteArray, jint, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    available0
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_available0
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    write0
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_write0
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    writeArray0
 * Signature: (I[BII)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_writeArray0
  (JNIEnv *, jclass, jint, jbyteArray, jint, jint);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocket
 * Method:    readByteBufferDirect0
 * Signature: (ILjava/nio/ByteBuffer;II)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocket_readByteBufferDirect0
  (JNIEnv *, jclass, jint, jobject, jint, jint);

#ifdef __cplusplus
}
#endif
#endif
