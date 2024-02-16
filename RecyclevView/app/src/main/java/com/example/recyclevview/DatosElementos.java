package com.example.recyclevview;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

public class DatosElementos {

    private String ciudad, pais;

    public DatosElementos(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public static List<DatosElementos>poblarLista(){

        List<DatosElementos> list = new ArrayList<>();
        DatosElementos elementos = new DatosElementos("China1","Asia");
        list.add(elementos);
        elementos = new DatosElementos("China","Asia");
        list.add(elementos);
        elementos = new DatosElementos("China","Asia");
        list.add(elementos);
        elementos = new DatosElementos("China","Asia");
        list.add(elementos);
        elementos = new DatosElementos("China","Asia");
        list.add(elementos);
        elementos = new DatosElementos("China","Asia");
        list.add(elementos);
        elementos = new DatosElementos("China","Asia");
        list.add(elementos);
        elementos = new DatosElementos("China5","Asia");
        list.add(elementos);
        return list;
    }
}
