package com.example.oliverrodriguez.a53sensoresgiroscopio;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private Sensor sensor;
    private SensorManager sensorManager;
    TextView ejex;
    TextView ejey;
    TextView ejez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ejex= (TextView)findViewById(R.id.txt_x);
        ejey = (TextView)findViewById(R.id.txt_y);
        ejez = (TextView)findViewById(R.id.txt_z);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        sensorManager.registerListener(this,sensor,SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType()== Sensor.TYPE_GYROSCOPE) {
            ejex.setText("X:" + event.values[0]);
            ejey.setText("Y:" + event.values[1]);
            ejez.setText("Z:" + event.values[2]);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}

