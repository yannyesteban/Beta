package com.example.beta;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private GLSurfaceView view;

    static {
        System.loadLibrary("man2000");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view = new GLSurfaceView(this);
        view.setEGLContextClientVersion(2);//.setupEGLContextClientVersion(2);


       // setContentView(R.layout.activity_main);
        view.setRenderer(new BRenderer());
        setContentView(view);

        if(4==3){
            TextView tv = findViewById(R.id.xxx);
            //tv.setText("xxxxxxxxxxxx");
            //tv.setText(stringFromJNI()+Prueba());
            tv.setText(Bloom.Prueba());
        }



        Log.i("J ", "onCreate: Hello World!");
        System.out.println("Your string here");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        view.onPause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        view.onResume();
    }
    public native String stringFromJNI();
    public native String Prueba();
}
