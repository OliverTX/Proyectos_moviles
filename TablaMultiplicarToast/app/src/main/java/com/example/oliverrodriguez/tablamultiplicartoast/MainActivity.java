package com.example.oliverrodriguez.tablamultiplicartoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener,ListView.OnItemClickListener{

    TextView txtTitulo;
    SeekBar seekNum;
    ListView listTab;
    String [] datos = new String[11];
    ArrayAdapter <String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTitulo = (TextView) findViewById(R.id.txt_titulo);
        seekNum = (SeekBar) findViewById(R.id.seek_num);
        seekNum.setMax(10);
        listTab = (ListView) findViewById(R.id.list_tab);
        ((SeekBar)findViewById(R.id.seek_num)).setOnSeekBarChangeListener(this);
        ((ListView)findViewById(R.id.list_tab)).setOnItemClickListener(this);


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        for(int e=0;e<11;e++){
            datos[e]=i+"x"+e+"="+e*i;
        }
        adapter = new ArrayAdapter<String>(listTab.getContext(), android.R.layout.simple_list_item_1,datos);
        listTab.setAdapter(adapter);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
    }
}
