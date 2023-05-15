/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_LibUdev */

#ifndef _Included_org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_LibUdev
#define _Included_org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_LibUdev
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_LibUdev
 * Method:    udev_new
 * Signature: ()Lcom/sun/jna/Pointer;
 */
JNIEXPORT jobject JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_00024LibUdev_udev_1new
  (JNIEnv *, jobject);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_LibUdev
 * Method:    udev_unref
 * Signature: (Lcom/sun/jna/Pointer;)Lcom/sun/jna/Pointer;
 */
JNIEXPORT jobject JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_00024LibUdev_udev_1unref
  (JNIEnv *, jobject, jobject);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_LibUdev
 * Method:    udev_device_new_from_devnum
 * Signature: (Lcom/sun/jna/Pointer;BI)Lcom/sun/jna/Pointer;
 */
JNIEXPORT jobject JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_00024LibUdev_udev_1device_1new_1from_1devnum
  (JNIEnv *, jobject, jobject, jbyte, jint);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_LibUdev
 * Method:    udev_device_get_syspath
 * Signature: (Lcom/sun/jna/Pointer;)Lcom/sun/jna/Pointer;
 */
JNIEXPORT jobject JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_00024LibUdev_udev_1device_1get_1syspath
  (JNIEnv *, jobject, jobject);

/*
 * Class:     org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_LibUdev
 * Method:    udev_device_unref
 * Signature: (Lcom/sun/jna/Pointer;)Lcom/sun/jna/Pointer;
 */
JNIEXPORT jobject JNICALL Java_org_apache_hadoop_yarn_server_nodemanager_containermanager_resourceplugin_com_nec_UdevUtil_00024LibUdev_udev_1device_1unref
  (JNIEnv *, jobject, jobject);

#ifdef __cplusplus
}
#endif
#endif