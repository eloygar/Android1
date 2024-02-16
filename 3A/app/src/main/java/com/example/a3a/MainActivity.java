package com.example.a3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.listView);
        ArrayList<Equipo> load = teamList();
        lv.setAdapter(new ListViewAdapter(this, 0, load));

        lv.setOnItemClickListener(this);
    }

    public ArrayList<Equipo> teamList() {

        Equipo e1 = new Equipo("Serbia", "Košarkaški Klub Crvena Zvezda", "Belgrado", "1945", R.drawable.kk_cvrena_zvezda);
        Equipo e2 = new Equipo("Israel", "Maccabi Basketball Club", "Tel Aviv", "1932", R.drawable.maccabi_tel_aviv);
        Equipo e3 = new Equipo("Lituania", "Basketball Club Žalgiris", "Kaunas", "1944", R.drawable.bc_zalgiris);
        Equipo e4 = new Equipo("España", "Club Deportivo Baskonia", "Vitoria", "1959", R.drawable.saski_baskonia);
        Equipo e5 = new Equipo("Grecia", "PanathinaikosBasketball Club", "Atenas", "1919", R.drawable.panathinaikos_bc);


        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(e1);
        equipos.add(e2);
        equipos.add(e3);
        equipos.add(e4);
        equipos.add(e5);

        return equipos;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);

        Equipo equipo = (Equipo) adapterView.getItemAtPosition(i);

        textView.setText(equipo.getNombre().toString());
        imageView.setImageResource(equipo.getEscudo());


    }
}