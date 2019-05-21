#include <jni.h>
#include <string>
#include<EGL/egl.h>
#include<GLES2/gl2.h>

extern "C"{
    void InitializeOpenGL();
    void resizeViewport(int newWidth, int newHeight);
    void renderFrame();
}


void InitializeOpenGL()
{
    glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
}
void resizeViewport(int newWidth, int newHeight)
{
    glViewport(0, 0, newWidth, newHeight);
}
void renderFrame()
{
    glClear(GL_COLOR_BUFFER_BIT);
}
extern "C" {
    JNIEXPORT jstring JNICALL
    Java_com_example_beta_Bloom_Prueba(
            JNIEnv *env,
            jobject /* this */) {
        std::string hello = "Hello GAME BLOOM C++";
        return env->NewStringUTF(hello.c_str());
    }


    JNIEXPORT void  JNICALL
    Java_com_example_beta_Bloom_Init(
            JNIEnv *env,
            jobject /* this */) {
        InitializeOpenGL();
    }
    JNIEXPORT void  JNICALL
    Java_com_example_beta_Bloom_Resize(
            JNIEnv *env,
            jobject /* this */, jint width, jint height) {
        resizeViewport(width, height);
    }
    JNIEXPORT void  JNICALL
    Java_com_example_beta_Bloom_Render(
            JNIEnv *env,
            jobject /* this */) {
        renderFrame();
    }

}