package com.example.oliverrodriguez.a211persistenciabasica;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText numeroC;
    EditText correo;
    Button guardar;
    Button leer;
    TextView texto;
    SharedPreferences datosAlumno;
    String nombreTx;
    int numControl;
    String correoTx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.edt_nombre);
        numeroC = (EditText)findViewById(R.id.edt_nc);
        correo = (EditText)findViewById(R.id.edt_correo);
        guardar = (Button)findViewById(R.id.btn_guardar);
        leer = (Button)findViewById(R.id.btn_leer);
        texto = (TextView)findViewById(R.id.txt_res);
        datosAlumno = getSharedPreferences("Preferencias",0);
        nombreTx= datosAlumno.getString("Nombre","null");
        numControl = datosAlumno.getInt("NumControl",0);
        correoTx = datosAlumno.getString("Correo","null");

    }

    public void guardar(View view){
        SharedPreferences.Editor editorDatos = datosAlumno.edit();
        editorDatos.putString("Nombre",""+nombre.getText().toString());
        editorDatos.putString("Correo",""+correo.getText().toString());
        editorDatos.putInt("NumControl", Integer.parseInt(numeroC.getText().toString()));
        editorDatos.commit();

    }

    public void leer(View view){

        nombreTx=datosAlumno.getString("Nombre","null");
        numControl= datosAlumno.getInt("NumControl",0);
        correoTx=datosAlumno.getString("Correo","null");
        texto.setText(nombreTx+"\n"+numControl+"\n"+correoTx);
    }
}
