package com.example.salvarestado;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_COUNTER = " CONTADOR";
    private int miContador = 0;
    private Button boton;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.caja);

        boton = findViewById(R.id.boton);
        boton.setOnClickListener(v -> {
            contador(v);
        });
    }

    private void contador(View view) {
        miContador++;
        texto.setText("Contador :"+miContador);
        //texto.setText(miContador+"");
        //texo.setText("contador:"+Interger.toString(miContador));
    }


    //metodo para recuperar valores
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER,miContador);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        miContador=savedInstanceState.getInt(KEY_COUNTER);
        texto.setText("Contador :"+miContador);
    }
}