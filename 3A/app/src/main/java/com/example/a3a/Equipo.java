package com.example.a3a;

public class Equipo {
    String nombre ,ciudad ,anho, pais;
    int escudo;

    public Equipo(String pais, String nombre, String ciudad, String anho, int escudo) {
        this.pais = pais;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.anho = anho;
        this.escudo = escudo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ",nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", año='" + anho + '\'' +
                ", escudo=" + escudo +
                '}';
    }
}
