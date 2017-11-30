package com.example.oliverrodriguez.a46animacionframeanimations;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.img_frames);
        if (imageView == null) throw new AssertionError();

        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.robotanim);

        robot = (AnimationDrawable) imageView.getBackground();
        robot.setOneShot(true);
    }

    public void onStartBtnClick(View v) {
        imageView.setVisibility(View.VISIBLE);
        if (robot.isRunning()) {
            robot.stop();
        }
        robot.start();
    }

    public void onStopBtnClick(View v) {
        robot.stop();
    }

}
