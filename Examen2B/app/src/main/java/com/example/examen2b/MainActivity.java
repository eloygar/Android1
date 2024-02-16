    package com.example.examen2b;

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
            ArrayList<Pais> load = Paises();
            lv.setAdapter(new Adapter(this, 0, load));

            lv.setOnItemClickListener(this);
        }

        public ArrayList<Pais> Paises() {

            Pais alemania= new Pais("Alemania", "Berlin", "84270625 hab", "357375 km²", R.drawable.alemania);
            Pais italia = new Pais("Italia", "Roma", "58870764 hab", "301340 km²", R.drawable.italia);
            Pais francia = new Pais("Francia", "Paris", "68042591 hab", "675 417 km²", R.drawable.francia);
            Pais portugal = new Pais("Portugal", "Lisboa", "10352042 hab", "92 212 km² ", R.drawable.portugal);
            Pais grecia = new Pais("Grecia", "Atenas", "10432481 hab", "131 957\n km²", R.drawable.grecia);


            ArrayList<Pais> paises = new ArrayList<>();
            paises.add(alemania);
            paises.add(italia);
            paises.add(francia);
            paises.add(portugal);
            paises.add(grecia);

            return paises;
        }

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            ImageView imageView = findViewById(R.id.imageView);
            TextView textView = findViewById(R.id.textView);

            Pais pais = (Pais) adapterView.getItemAtPosition(i);

            textView.setText(pais.getNombre().toString());
            imageView.setImageResource(pais.getBandera());


        }
    }