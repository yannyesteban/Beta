package com.example.beta;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class BRenderer implements GLSurfaceView.Renderer
{

    public void onDrawFrame(GL10 gl)
    {
        //gl.glClear(gl.GL_COLOR_BUFFER_BIT);
        Bloom.Render();
    }

    public void onSurfaceChanged(GL10 gl, int width, int height)
    {
        //gl.glViewport(0, 0, width, height);
        Bloom.Resize(width, height);
    }

    public void onSurfaceCreated(GL10 gl, EGLConfig config)
    {
        //gl.glClearColor(0.45f, 0.2f, 0.1f, 1.0f);
        Bloom.Init();
    }
}