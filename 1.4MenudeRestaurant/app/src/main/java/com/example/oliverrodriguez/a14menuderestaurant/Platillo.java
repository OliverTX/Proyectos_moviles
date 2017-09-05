package com.example.oliverrodriguez.a14menuderestaurant;

/**
 * Created by oliverrodriguez on 05/09/17.
 */

public class Platillo {
    private int imagen;
    private String nombre;
    private int cantidad;

    public Platillo(int imagen, String nombre,int cantidad) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.cantidad=cantidad;
    }
    public Platillo(){}
    public int getImagen(){
        return this.imagen;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setImagen(int imagen){
        this.imagen=imagen;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
