#include <jni.h>
#include <string>


extern "C"
JNIEXPORT jint JNICALL
Java_com_example_test_MainActivity_calcFormCPP(JNIEnv *env, jobject thiz,jint a,jint b) {
    return a+b;
}