#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_bpj_com_opengl_1ray_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
