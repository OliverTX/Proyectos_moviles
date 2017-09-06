package com.example.oliverrodriguez.tablamultiplicar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    TextView txtTitulo;
    SeekBar seekNum;
    ListView tabLista;
    String tabla[]= new String[11];
    ArrayAdapter <String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTitulo = (TextView) findViewById(R.id.txt_titulo);
        seekNum = (SeekBar) findViewById(R.id.seek_num);
        seekNum.setMax(10);
        tabLista = (ListView) findViewById(R.id.tab_lista);
        ((SeekBar) findViewById(R.id.seek_num)).setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        for(int e=0;e<11;e++){
            tabla[e]=i+"x"+e+"="+e*i;
        }
            adapter = new ArrayAdapter<String>(tabLista.getContext(), android.R.layout.simple_list_item_1,tabla);
        tabLista.setAdapter(adapter);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
