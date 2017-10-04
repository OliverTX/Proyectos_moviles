package com.example.oliverrodriguez.a231persistencia;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button btnLoad;
    Button btnSave;
    String estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto= (TextView)findViewById(R.id.edt_texto);
        btnLoad = (Button)findViewById(R.id.btn_load);
        btnSave = (Button)findViewById(R.id.btn_save);
        estado= Environment.getExternalStorageState();
        Toast toast = Toast.makeText(this,estado,Toast.LENGTH_SHORT);
        toast.show();


    }

    public void escribir(View view){
        File root = Environment.getExternalStorageDirectory();
        File dir = new File(root.getAbsolutePath()+"/Datos");
        dir.mkdir();
        String[]fichero = root.list();
        File file = new File(dir,"datos1.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos);
            pw.println(""+texto.getText());
            pw.flush();
            pw.close();
            Toast toast1 = Toast.makeText(this,"Archivo Guardado",Toast.LENGTH_LONG);
            toast1.show();
            texto.setText("");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            Toast toast2 = Toast.makeText(this,"ERROR"+e,Toast.LENGTH_SHORT);
            toast2.show();
        }
    }

    public void leer(View view){
        File tarjeta = Environment.getExternalStorageDirectory();
        File file2 = new File(tarjeta.getAbsolutePath()+"/Datos");
        file2.mkdir();
        File file3 = new File(file2,"datos1.txt");
        try {
            FileInputStream fIn = new FileInputStream(file3);
            InputStreamReader archivo = new InputStreamReader(fIn);
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String todo = "";
            while (linea != null) {
                todo = todo + linea + " ";
                linea = br.readLine();
            }
            br.close();
            archivo.close();
           texto.setText(todo);
            Toast.makeText(this, "Archivo Cargado",
                    Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            Toast.makeText(this, "No se pudo leer",
                    Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
