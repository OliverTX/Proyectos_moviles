package com.example.oliverrodriguez.a212laboratorio1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    /*
    * Nombre del cliente

Celular del Cliente

Dirección del Evento

Fecha del evento

Hora (De inicio y final - aproximada)

Numero de platillos

Numero de postres

Manteleria (Básica / Lujo) - Implementar CheckBox

Meseros (1-10) - Implementar Seekbar */

    TextView txtClien;
    TextView txtCel;
    TextView txtDirec;
    TextView txtFech;
    TextView txtHora;
    TextView txtPlatillo;
    TextView txtPostre;
    CheckBox checOpti;
    SeekBar seekMeser;
    SharedPreferences datosEvento;
    int valorseek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtClien = (TextView)findViewById(R.id.txt_name);
        txtCel = (TextView)findViewById(R.id.txt_tel);
        txtDirec = (TextView)findViewById(R.id.txt_direccion);
        txtFech = (TextView)findViewById(R.id.txt_fecha);
        txtHora = (TextView)findViewById(R.id.txt_hora);
        txtPlatillo = (TextView)findViewById(R.id.txt_platillo);
        txtPostre = (TextView)findViewById(R.id.txt_postre);
        checOpti = (CheckBox) findViewById(R.id.che_opti);
        seekMeser = (SeekBar)findViewById(R.id.seek_mese);
        datosEvento = getSharedPreferences("Archivo",0);
        seekMeser.setMax(10);
        seekMeser.setProgress(1);

    }

    public void guardar(View view){
        SharedPreferences.Editor editar = datosEvento.edit();
        editar.putString("NombreCliente",txtClien.getText().toString());
        editar.putString("Cel",txtCel.getText().toString());
        editar.putString("Direcc",txtDirec.getText().toString());
        editar.putString("Fecha",txtFech.getText().toString());
        editar.putString("Hora",txtHora.getText().toString());
        editar.putInt("Platillos",Integer.parseInt(txtPlatillo.getText().toString()));
        editar.putInt("Postres",Integer.parseInt(txtPostre.getText().toString()));
        /*if(checOpti.isChecked()){
            editar.putInt("Valor",1);
        }else {editar.putInt("Valor",0);}*/
        editar.putBoolean("Valor",checOpti.isChecked());
        editar.putInt("Meseros",valorseek);
        editar.commit();
        txtClien.setText("");
        txtCel.setText("");
        txtDirec.setText("");
        txtFech.setText("");
        txtHora.setText("");
        txtPlatillo.setText("");
        txtPostre.setText("");
        checOpti.setChecked(false);
        seekMeser.setProgress(1);


    }
    public void leer(View view){
        txtClien.setText(datosEvento.getString("NombreCliente","null"));
        txtCel.setText(datosEvento.getString("Cel","null"));
        txtDirec.setText(datosEvento.getString("Direcc","null"));
        txtFech.setText(datosEvento.getString("Fecha","null"));
        txtHora.setText(datosEvento.getString("Hora","null"));
        txtPlatillo.setText(""+datosEvento.getInt("Platillos",0));
        txtPostre.setText(""+datosEvento.getInt("Postres",0));
        checOpti.setChecked(datosEvento.getBoolean("Valor",false));
        seekMeser.setProgress(datosEvento.getInt("Meseros",1));

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        valorseek=i;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
