package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinnete;
    TextView textView;
    ArrayAdapter<String> adaptador;


    static ArrayList<String> pueblaSpinner(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("hola1");
        lista.add("hola2");
        lista.add("hola3");
        lista.add("hola4");
        return lista;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnete = findViewById(R.id.spinner);
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, pueblaSpinner());
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnete.setAdapter(adaptador);

        textView = findViewById(R.id.textView2);

        spinnete.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = spinnete.getSelectedItem().toString();
                textView.setText("Seleccionado: " + selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Puedes manejar este caso si deseas
            }
        });

    }
}