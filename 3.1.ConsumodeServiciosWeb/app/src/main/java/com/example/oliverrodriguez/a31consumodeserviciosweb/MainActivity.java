package com.example.oliverrodriguez.a31consumodeserviciosweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtCiudad;
    EditText edtPais;
    static TextView txtClima;
    Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCiudad = (EditText) findViewById(R.id.edt_ciudad);
        edtPais = (EditText)findViewById(R.id.edt_pais);
        txtClima = (TextView)findViewById(R.id.txt_clima);
        btnBuscar = (Button)findViewById(R.id.btn_buscar);
    }

    public void buscar(View view){
        Clima clima = new Clima();
        clima.execute("http://api.openweathermap.org/data/2.5/weather?q="+String.valueOf(""+edtCiudad.getText())+","+String.valueOf(""+edtPais.getText())+"&appid=a8d5c010de0728f1c2a642bf9102be76");
        Toast.makeText(getApplicationContext(),"Buscar",Toast.LENGTH_SHORT).show();
    }
}
