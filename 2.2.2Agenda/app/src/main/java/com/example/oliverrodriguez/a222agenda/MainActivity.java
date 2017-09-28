package com.example.oliverrodriguez.a222agenda;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listaContactos;
    Button btnAdd;
    ArrayList<Contacto>  contactos;
    ContactoAdapter adapter;
    DBAdapter db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaContactos = (ListView)findViewById(R.id.list_cont);
        btnAdd = (Button)findViewById(R.id.btn_add);
        db = new DBAdapter(getApplicationContext());
        contactos = new ArrayList<>();
        //contactos.add(new Contacto(12,"oliver","oli@",123));
        ((ListView) findViewById(R.id.list_cont)).setOnItemClickListener(this);
        // Explorar el cursos
        db.open();
        Cursor c = db.getAllContacts();
        if (c.moveToFirst()) {
            do { DisplayContact(c);
            } while (c.moveToNext()); }
        db.close();
        adapter = new ContactoAdapter(this,contactos);
        listaContactos.setAdapter(adapter);

    }

    private void DisplayContact(Cursor c) {
        contactos.add(new Contacto(c.getInt(0),c.getString(1),c.getString(2), c.getString(3)));
    }

    public void agregar(View view){
        Intent actividad = new Intent(this,DetalleContacto.class);
        startActivity(actividad);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //ver contacto
        Intent actividad = new Intent(this,DetalleContacto.class);
        actividad.putExtra("Id",contactos.get(i).getId());
        actividad.putExtra("Nombre",contactos.get(i).getNombre());
        actividad.putExtra("Mail",contactos.get(i).getMail());
        actividad.putExtra("Cel",contactos.get(i).getCel());
        startActivity(actividad);
    }
}
