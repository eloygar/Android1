package com.example.examenlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lista);

        AdaptadorElemento adaptador = new AdaptadorElemento(this, R.layout.elemento, DatosElemento.poblarLista());
        listView.setAdapter(adaptador);
        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView textView = findViewById(R.id.seleccion);
        textView.setText(((DatosElemento)parent.getItemAtPosition(position)).getClub());
        ImageView imageView = findViewById(R.id.logo);
        imageView.setBackgroundResource(DatosElemento.drawableResourceFromId(((DatosElemento) parent.getItemAtPosition(position)).getImagenId()));
    }
}