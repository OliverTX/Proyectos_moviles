package com.example.oliverrodriguez.a222agenda;

/**
 * Created by oliverrodriguez on 20/09/17.
 */

public class Contacto {
    private int id;
    private String nombre;
    private String mail;
    private String cel;

    public Contacto(String nombre, String mail, String cel) {
        this.nombre = nombre;
        this.mail = mail;
        this.cel = cel;
    }

    public Contacto(int id, String nombre, String mail, String cel) {

        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
        this.cel = cel;
    }
    public Contacto(){}

    public int getId(){return this.id;}
    public String getCel(){return this.cel;}
    public String getNombre(){return this.nombre;}
    public String getMail(){return this.mail;}
    public void setId(int id){this.id=id;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setMail(String mail){this.mail=mail;}
    public void setCel(String cel){this.cel=cel;}
}
