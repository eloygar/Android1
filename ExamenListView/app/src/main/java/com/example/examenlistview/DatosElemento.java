package com.example.examenlistview;

import java.util.ArrayList;
import java.util.List;

public class DatosElemento {

    public String getClub() { return club;}
    public String getPais() {return pais;}
    public String getCiudad() {return ciudad;}
    public int getAño() {return año;}
    public int getImagenId() {return imagenId;}

    private String club;
    private String pais;
    private String ciudad;
    private int año;
    private int imagenId;

    public DatosElemento(String nombreClub, String country, String city, int year, int imageID) {
        this.club = nombreClub;
        this.pais = country;
        this.ciudad = city;
        this.año = year;
        this.imagenId = imageID;
    }

    public static List<DatosElemento> poblarLista(){
        List<DatosElemento> list = new ArrayList<>();
        DatosElemento elemento = new DatosElemento("Košarkaški Klub Crvena Zvezda", "Serbia","Belgrado",1945, 0);
        list.add(elemento);
        elemento = new DatosElemento("Maccabi Basketball Club", "Israel","Tel Aviv",1932, 1);
        list.add(elemento);
        elemento = new DatosElemento("Basketball Club Žalgiris", "Lituania","Kaunas",1944, 2);
        list.add(elemento);
        elemento = new DatosElemento("Club Deportivo Baskonia", "España","Vitoria",1959, 3);
        list.add(elemento);
        elemento = new DatosElemento("PanathinaikosBasketball Club", "Grecia","Atenas",1919, 4);
        list.add(elemento);
        return list;
    }
    public static int drawableResourceFromId(int id){
        switch (id){
            case 0:
                return R.drawable.club1;
            case 1:
                return  R.drawable.club2;
            case 2:
                return  R.drawable.club3;
            case 3:
                return  R.drawable.club4;
            case 4:
                return  R.drawable.club5;
            default:
                return R.drawable.ic_launcher_background;
        }
    }
}
