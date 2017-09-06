package com.example.oliverrodriguez.alumnoinfor13;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView tapLista;
    String [] nombred = {"ABREGO DELGADO ALEXIA ARIANA",
            "CARO LOPEZ LUIS RICARDO",
            "CARVAJAL GUTIERREZ RAUL RAFAEL",
            "CASILLAS UREÑA FERMIN MICHET",
            "CRESPO DURAN PABLO ARTURO",
            "ESPINO SERRANO CESAR RAMSES"};
    String [] ncd = {
            "13400378",
            "13400395",
            "13400396",
            "12400256",
            "13400397",
            "13400402"
    };
    String [] carrerad= {
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC"
    };
     ArrayList <Alumno> listapersonas;
    ListViewAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tapLista = (ListView) findViewById(R.id.tap_lista);
        listapersonas = new ArrayList<>();

        for(int e=0;e<6;e++){
            listapersonas.add(new Alumno(R.drawable.if_mailru_1147413,nombred[e],ncd[e],carrerad[e]));
        }
        adapter = new ListViewAdapter(listapersonas, this);
        tapLista.setAdapter(adapter);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
    }
}
