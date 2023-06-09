/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated */

#ifndef _Included_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
#define _Included_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
#ifdef __cplusplus
extern "C" {
#endif
#undef org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated_MOVE_FILE
#define org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated_MOVE_FILE 1L
#undef org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated_COPY_FILE
#define org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated_COPY_FILE 2L
/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
 * Method:    elevatedMkDirImpl
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_00024Native_00024Elevated_elevatedMkDirImpl
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
 * Method:    elevatedChownImpl
 * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_00024Native_00024Elevated_elevatedChownImpl
  (JNIEnv *, jclass, jstring, jstring, jstring);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
 * Method:    elevatedCopyImpl
 * Signature: (ILjava/lang/String;Ljava/lang/String;Z)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_00024Native_00024Elevated_elevatedCopyImpl
  (JNIEnv *, jclass, jint, jstring, jstring, jboolean);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
 * Method:    elevatedChmodImpl
 * Signature: (Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_00024Native_00024Elevated_elevatedChmodImpl
  (JNIEnv *, jclass, jstring, jint);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
 * Method:    elevatedKillTaskImpl
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_00024Native_00024Elevated_elevatedKillTaskImpl
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
 * Method:    elevatedCreateImpl
 * Signature: (Ljava/lang/String;JJJJ)J
 */
JNIEXPORT jlong JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_00024Native_00024Elevated_elevatedCreateImpl
  (JNIEnv *, jclass, jstring, jlong, jlong, jlong, jlong);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_Native_Elevated
 * Method:    elevatedDeletePathImpl
 * Signature: (Ljava/lang/String;Z)Z
 */
JNIEXPORT jboolean JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_WindowsSecureContainerExecutor_00024Native_00024Elevated_elevatedDeletePathImpl
  (JNIEnv *, jclass, jstring, jboolean);

#ifdef __cplusplus
}
#endif
#endif
