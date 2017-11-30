package com.example.oliverrodriguez.a43pidrapapeltijeraanimado;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button btnstart;
    private AnimationDrawable robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstart = (Button)findViewById(R.id.btn_start);
        imageView = (ImageView) findViewById(R.id.img_anim);
        if (imageView == null) throw new AssertionError();

        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.random);

        robot = (AnimationDrawable) imageView.getBackground();
        robot.setOneShot(true);
    }
    void animacion() throws InterruptedException {
        imageView.setBackgroundResource(R.drawable.random);

        robot = (AnimationDrawable) imageView.getBackground();
        robot.setOneShot(true);
        robot.start();
        int e =(new Random().nextInt(3));
        switch (e){
            case 1:
                imageView.setBackgroundResource(R.drawable.piedra);
                break;
            case 2:
                imageView.setBackgroundResource(R.drawable.papel);
                break;
            case 3:
                imageView.setBackgroundResource(R.drawable.tijera);
                break;
            default:
                break;
        }
        robot = (AnimationDrawable) imageView.getBackground();
        robot.setOneShot(true);
    }
    private void delay(int i) throws InterruptedException {
        Thread.sleep(i);
    }

    public void onStartBtnClick(View v) {
        imageView.setVisibility(View.VISIBLE);
        if (robot.isRunning()) {
            robot.stop();
        }
        //robot.start();
        //robot.stop();
        try {
            animacion();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        robot.start();
    }

    public void onStopBtnClick(View v) {
        robot.stop();
    }

}
