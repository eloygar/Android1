package com.example.a3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //preparamos objetos a cargar
        ArrayList<Equipo> elementos = crearEquipo();
        SpinnerAdapter adaptador = new com.example.a3b.SpinnerAdapter(this, 0, elementos);

        Spinner sp = findViewById(R.id.spinner);

        //creamos un adaptador, indicando el contexto, tiramos de un elemento prefabricado del sistema y cargamos de nuestro array de elementos
        sp.setAdapter(adaptador);
        sp.setSelection(0, false);

        //preparando un listener
        sp.setOnItemSelectedListener(this);
    }

    public ArrayList<Equipo> crearEquipo() {
        ArrayList<Equipo> equipos = new ArrayList<>();
        Equipo equipo1 = new Equipo(R.drawable.barcelona, "Barcelona Handball", "Barcelona", "España", "1942");
        equipos.add(equipo1);
        Equipo equipo2 = new Equipo(R.drawable.montpellier, "Montpellier Handball", "Montpellier", "Francia", "1982");
        equipos.add(equipo2);
        Equipo equipo3 = new Equipo(R.drawable.telekom, "Telekom Veszprém", "Veszprem", "Hungria", "1977");
        equipos.add(equipo3);
        Equipo equipo4 = new Equipo(R.drawable.thw, "THW Kiel", "Kiel", "Alemania", "1904");
        equipos.add(equipo4);
        Equipo equipo5 = new Equipo(R.drawable.vivekielce, "KS Vive Handball", "Kielce", "Polonia", "1965");
        equipos.add(equipo5);
        return equipos;
    }


    //@Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //su codigo aquí
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.team);
        //pillamos el equipo en la posicion 1
        Equipo club = (Equipo) adapterView.getItemAtPosition(i);

        //con los getters aporpiaos seteamos el nombre y el escudo
        textView.setText(club.getNombre().toString());
        imageView.setImageResource(club.getEscudo());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        TextView textView = findViewById(R.id.team);
        textView.setText("No Seleccionado");
    }


}