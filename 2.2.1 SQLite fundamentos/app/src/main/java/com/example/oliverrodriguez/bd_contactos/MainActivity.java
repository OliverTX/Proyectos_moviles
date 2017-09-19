package com.example.oliverrodriguez.bd_contactos;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listaContactos;
    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        // Instanciar clase DBAdapter
        DBAdapter db = new DBAdapter(this);
//---Añadir datos
        db.open();
        long id = db.insertContact("Naty", "naty@ejemplo.com");
        id = db.insertContact("Oscar Lopez", "olopez@mail.com");
        id= db.insertContact("oliver","oliver@mail.com");
        db.close();
        db.open();
        // Explorar el cursos
        Cursor c = db.getAllContacts(); if (c.moveToFirst()) {
            do { DisplayContact(c);
            } while (c.moveToNext()); }
        db.close();
        listaContactos=(ListView)findViewById(R.id.lista_contactos);
        ContactosAdapter adapter = new ContactosAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listaContactos.setAdapter(adapter);
    }
    // Desplegar el contenido vía Toast
    public void DisplayContact(Cursor c) {
        arrayList.add("id: " + c.getString(0) + "\n" +
                "Name: " + c.getString(1) + "\n" + "Email: " + c.getString(2));

    }
}
