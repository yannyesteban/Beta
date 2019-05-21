#include <jni.h>
#include <string>

extern "C" {
    JNIEXPORT jstring JNICALL

    Java_com_example_beta_MainActivity_stringFromJNI(
            JNIEnv *env,
            jobject /* this */) {
        std::string hello = "Hello GAME  C++";
        return env->NewStringUTF(hello.c_str());
    }

    JNIEXPORT jstring JNICALL
    Java_com_example_beta_MainActivity_Prueba(JNIEnv *env,
                                              jobject /* this */){

std::string x="queee!!!";
        return env->NewStringUTF( x.c_str());

    }

}