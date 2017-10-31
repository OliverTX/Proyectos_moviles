package com.example.oliverrodriguez.a42laboratorio1;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    TextView titulo;
    TextView resultado;
    EditText numero;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titulo = (TextView)findViewById(R.id.txt_titulo);
        resultado = (TextView)findViewById(R.id.txt_resultado);
        numero = (EditText)findViewById(R.id.edt_numero);
        calcular = (Button)findViewById(R.id.btn_calcular);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_calcular:
                AsyncTablasM asyncTablasM = new AsyncTablasM();
                asyncTablasM.execute();
                break;
            default:
                break;
        }
    }
    private class  AsyncTablasM extends AsyncTask<Void, Integer,Boolean> {
        int num;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            this.num= Integer.parseInt(""+numero.getText());
        }

        @Override
        protected Boolean doInBackground(Void... params) {

            for (int i=0; i<=10; i++){
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

            resultado.setText(resultado.getText()+""+num+"x"+values[0].intValue()+"="+values[0].intValue()*num+"\n");
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
