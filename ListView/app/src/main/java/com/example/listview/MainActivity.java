package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1,pueblalista());
        lista = findViewById(R.id.lista);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(this);
    }
    public static List<String> pueblalista(){
        List<String> clubs = new ArrayList<>();
        clubs.add("Celtiña");
        clubs.add("Lugo");
        clubs.add("Corujo");
        clubs.add("Rapido de Bouzas");
        clubs.add("Racin de ferror");
        clubs.add("pontevedra");
        return clubs;
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView texto = findViewById(R.id.seleccion);
        texto.setText((CharSequence) parent.getItemAtPosition(position));
    }
}