package com.example.oliverrodriguez.a47animacionobjectanimator;

import android.animation.ObjectAnimator;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{
    Button btnboun;
    Button btnaccel;
    Button btnDec;
    Button btnCycle;
    ImageView imagen;
    private ConstraintLayout canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnboun = (Button) findViewById(R.id.btn_boun);
        imagen = (ImageView) findViewById(R.id.img_sol);
        btnaccel = (Button) findViewById(R.id.btn_accel);
        btnDec = (Button) findViewById(R.id.btn_dec);
        btnCycle = (Button) findViewById(R.id.btn_cycle);
        btnboun.setOnClickListener(this);
        btnaccel.setOnClickListener(this);
        btnDec.setOnClickListener(this);
        btnCycle.setOnClickListener(this);
        canvas = (ConstraintLayout)findViewById(R.id.canvas);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_boun:
                animarBoun(v);
                break;
            case R.id.btn_accel:
                animarAccel(v);
                break;
            case R.id.btn_dec:
                animarDec(v);
                break;
            case R.id.btn_cycle:
                animarCyc(v);
                break;
            default:
                break;
        }
    }

    private void animarCyc(View v) {
        int screenHeight = canvas.getHeight();
        int targetY=screenHeight -imagen.getHeight();

        ObjectAnimator animator = ObjectAnimator.ofFloat(imagen,"y",targetY,0).setDuration(1000);
        animator.setInterpolator(new CycleInterpolator(1));
        animator.start();
    }

    private void animarDec(View v) {
        int screenHeight = canvas.getHeight();
        int targetY=screenHeight -imagen.getHeight();

        ObjectAnimator animator = ObjectAnimator.ofFloat(imagen,"y",targetY,0).setDuration(1000);
        animator.setInterpolator(new DecelerateInterpolator(3));
        animator.start();
    }

    private void animarBoun(View v) {
        int screenHeight = canvas.getHeight();
        int targetY=screenHeight -imagen.getHeight();

        ObjectAnimator animator = ObjectAnimator.ofFloat(imagen,"y",targetY,0).setDuration(1000);
        animator.setInterpolator(new BounceInterpolator());
        animator.start();
    }
    public void animarAccel(View view){
        int screenHeight = canvas.getHeight();
        int targetY=screenHeight -imagen.getWidth();

        ObjectAnimator animator = ObjectAnimator.ofFloat(imagen,"x",targetY,0).setDuration(1000);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.start();

    }

}
