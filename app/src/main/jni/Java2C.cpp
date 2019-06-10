//
// Created by Apple on 2019/6/10.
//

//引入刚才生成的头文件
#include "ndkold_study_com_ndkolddemo_Java2CJNI.h"

//复制头文件里的要实现的方法名及其参数
JNIEXPORT jstring JNICALL
Java_ndkold_study_com_ndkolddemo_Java2CJNI_java2C(JNIEnv *env, jobject instance) {
//    实现这个方法，返回一个字符串
    return env->NewStringUTF("Hello from C++");
}

