package com.example.oliverrodriguez.a41hilos;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    static EditText numero1;
    static TextView conteo1;
    static EditText numero2;
    static TextView conteo2;


    ProgressBar progressBar1;
    ProgressBar progressBar2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn_contador1);
        numero1 = (EditText)findViewById(R.id.edt_num1);
        conteo1 = (TextView)findViewById(R.id.txt_conteo1);
        button2 = (Button) findViewById(R.id.btn_contador2);
        numero2 = (EditText)findViewById(R.id.edt_num2);
        conteo2 = (TextView)findViewById(R.id.txt_conteo2);
        progressBar1 = (ProgressBar) findViewById(R.id.progressBar_1);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2) ;



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    private void UnSegundo() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        int i;
        switch (v.getId()) {

            case R.id.btn_contador1:
                AsyncTarea asyncTarea = new AsyncTarea();
                asyncTarea.execute();
                break;
            case R.id.btn_contador2:
                AsyncTarea2 asyncTarea2 = new AsyncTarea2();
                asyncTarea2.execute();
                Toast.makeText(getBaseContext(),"Ejecucion button",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }

    }

    public void hilos() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 15; i++) {
                    UnSegundo();
                }
                // Para generar un error con la UI Thread
                Toast.makeText(getBaseContext(), "Segundos:5", Toast.LENGTH_LONG).show();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getBaseContext(), "Segundos:5", Toast.LENGTH_LONG).show();
                    }

                });
            }
        }).start();
    }

    private class  AsyncTarea extends AsyncTask<Void, Integer,Boolean> {
       private int numero;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar1.setMax(Integer.parseInt(numero1.getText().toString()));
            this.numero = Integer.parseInt(numero1.getText().toString());
        }

        @Override
        protected Boolean doInBackground(Void... params) {

            for (int i=0; i<=this.numero ; i++){
                UnSegundo();
                publishProgress(i);

                if (isCancelled()){
                    break;
                }
            }
            return true;
        }


        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            //Actualizar la barra de progreso
            progressBar1.setProgress(values[0].intValue());
            conteo1.setText(""+values[0].intValue());
        }

        @Override
        protected void onPostExecute(Boolean aVoid) {
            //super.onPostExecute(aVoid);

            if (aVoid){
                Toast.makeText(getApplicationContext(),"Tarea finaliza AsyncTask",Toast.LENGTH_SHORT).show();
            }
        }


        @Override
        protected void onCancelled() {
            super.onCancelled();

            Toast.makeText(getApplicationContext(),"Tarea NO finaliza AsyncTask",Toast.LENGTH_SHORT).show();

        }


    }
    private class  AsyncTarea2 extends AsyncTask<Void, Integer,Boolean> {
        private int numero;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar2.setMax(Integer.parseInt(numero2.getText().toString()));
            this.numero = Integer.parseInt(numero2.getText().toString());
        }

        @Override
        protected Boolean doInBackground(Void... params) {

            for (int i=0; i<=this.numero ; i++){
                UnSegundo();
                publishProgress(i);

                if (isCancelled()){
                    break;
                }
            }
            return true;
        }


        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            //Actualizar la barra de progreso
            progressBar2.setProgress(values[0].intValue());
            conteo2.setText(""+values[0].intValue());
        }

        @Override
        protected void onPostExecute(Boolean aVoid) {
            //super.onPostExecute(aVoid);

            if (aVoid){
                Toast.makeText(getApplicationContext(),"Tarea finaliza AsyncTask",Toast.LENGTH_SHORT).show();
            }
        }


        @Override
        protected void onCancelled() {
            super.onCancelled();

            Toast.makeText(getApplicationContext(),"Tarea NO finaliza AsyncTask",Toast.LENGTH_SHORT).show();

        }


    }
}
