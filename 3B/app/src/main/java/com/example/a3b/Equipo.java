package com.example.a3b;

public class Equipo {
    //atributos a cargar en elemento
    private int escudo;
    private String nombre;
    private String ciudad;
    private String pais;
    private String anho;

    //constructor
    public Equipo(int escudo, String nombre , String ciudad, String pais , String anho){
        this.escudo = escudo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.anho = anho;

    }

    public int getEscudo() {
        return escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getAnho() {
        return anho;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "escudo=" + escudo +
                ", nombre ='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", año='" + anho + '\'' +
                '}';
    }
}
