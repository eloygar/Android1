package com.example.inflandolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonDer;
    private Button botonIz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonIz = findViewById(R.id.botonIzquierdo);
        botonIz.setOnClickListener(v -> {
            clickIzquierdo(v);
        });
    }

    public void clickIzquierdo(View view) {
        setContentView(R.layout.activity_main);
        botonIz = findViewById(R.id.botonIzquierdo);
        botonIz.setOnClickListener(v -> {
            clickDerecho(v);
        });

    }

    public void clickDerecho(View view) {

        setContentView(R.layout.activity_main2);
        botonDer = findViewById(R.id.botonDerecho);
        botonDer.setOnClickListener(v -> {
            clickIzquierdo(v);
        });
    }
}