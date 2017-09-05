package com.example.oliverrodriguez.a14menuderestaurant;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView listaTb;
    ArrayList<Platillo> arrayListPlatillo;
    ListViewAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaTb = (ListView) findViewById(R.id.lis_tab);
        arrayListPlatillo = new ArrayList<>();
        arrayListPlatillo.add(new Platillo(R.drawable.thumb,"Tacos de pescado",0));
        arrayListPlatillo.add(new Platillo());
        arrayListPlatillo.add(new Platillo());
        arrayListPlatillo.add(new Platillo());


        adapter = new ListViewAdapter(arrayListPlatillo,this);
        listaTb.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
