package com.example.oliverrodriguez.a222agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DetalleContacto extends AppCompatActivity {
    EditText txtNombre;
    EditText txtMail;
    EditText txtCel;
    Button btnSave;
    Bundle bundle;
    Intent intent;
    // Instanciar clase DBAdapter
    DBAdapter db ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);
        txtNombre = (EditText)findViewById(R.id.txt_nombre);
        txtMail = (EditText)findViewById(R.id.txt_mail);
        txtCel = (EditText)findViewById(R.id.txt_cel);
        btnSave = (Button)findViewById(R.id.btn_save);
        intent = getIntent();
        bundle = intent.getExtras();
        db = new DBAdapter(this);
        if(bundle!=null) {
            txtNombre.setText(bundle.getString("Nombre"));
            txtMail.setText(bundle.getString("Mail"));
            txtCel.setText("" + bundle.getString("Cel"));
        }

    }

    public void guardar(View view){
        if (bundle!=null){

            if(txtCel.getText().length() >0 && txtNombre.getText().length() >0  && txtMail.getText().length()>0) {
                //actualizar datos
                db.open();
                db.updateContact(bundle.getInt("Id"),txtNombre.getText().toString(),txtMail.getText().toString(),txtCel.getText().toString());
                db.close();
            }else {
                Toast toast = Toast.makeText(this, "Campos nulos", Toast.LENGTH_LONG);
                toast.show();
            }


        }else {
            //---Añadir datos
            if(txtCel.getText().length() >0 && txtNombre.getText().length() >0  && txtMail.getText().length()>0) {
                db.open();
                long id = db.insertContact(txtNombre.getText().toString(), txtMail.getText().toString(), txtCel.getText().toString());
                db.close();
            }else {
                Toast toast = Toast.makeText(this, "Campos nulos", Toast.LENGTH_LONG);
                toast.show();
            }

        }


    }
    public void eliminar(View view){
        if(bundle != null){
            db.open();
            db.deleteContact(bundle.getInt("Id"));
            db.close();
            Toast toast = Toast.makeText(this, "Contacto eliminado", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Toast toast = Toast.makeText(this, "Selecciono agregar no eliminar", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
