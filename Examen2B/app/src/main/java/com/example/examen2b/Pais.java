package com.example.examen2b;

public class Pais {
    int bandera;
    String nombre,capital,población ,superficie;

    public Pais(String nombre, String capital, String población, String superficie,int bandera) {
        this.nombre = nombre;
        this.capital = capital;
        this.población = población;
        this.superficie = superficie;
        this.bandera = bandera;
    }

    public int getBandera() {
        return bandera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public String getPoblación() {
        return población;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPoblación(String población) {
        this.población = población;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "bandera=" + bandera +
                ", nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", población='" + población + '\'' +
                ", superficie='" + superficie + '\'' +
                '}';
    }
}
