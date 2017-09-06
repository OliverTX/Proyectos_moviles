package com.example.oliverrodriguez.alumnoinfor13;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by oliverrodriguez on 31/08/17.
 */

public class Alumno {
    private String nombre;
    private String nc;
    private String carrera;
    private int imagen;


    public Alumno(int imagen,String nombre, String nc,String carrera){
        this.nc=nc;
        this.nombre=nombre;
        this.carrera=carrera;
        this.imagen=imagen;
    }
    public Alumno(){

    }
    public String getNombre(){
        return nombre;
    }
    public int getImagen(){return imagen;}
    public String getNc(){
        return nc;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setNc (String nc){
        this.nc=nc;
    }
    public void setImagen(int imagen){this.imagen=imagen;}
}
