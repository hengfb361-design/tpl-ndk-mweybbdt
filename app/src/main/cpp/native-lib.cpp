#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_tndk_MainActivity_stringFromJNI(JNIEnv *env, jobject /* this */) {
    std::string hello = "សួស្តីពី C++ (JNI) ដំណើរការ ✓";
    return env->NewStringUTF(hello.c_str());
}
