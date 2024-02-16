package com.example.persistenciadatos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_COUNTER = " CONTADOR";
    private int miContador = 0;
    private Button boton;
    private TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.caja);

        boton = findViewById(R.id.boton);
        boton.setOnClickListener(v -> {
            contador(v);
        });
        //codigo para recuperar el valor del fichero de preferencias
       // SharedPreferences settings = getPreferences(MODE_PRIVATE);
        SharedPreferences misPreferencias = getSharedPreferences("Mifichero",MODE_PRIVATE);
        int defaultCounter = 0;
        miContador = misPreferencias.getInt(KEY_COUNTER,defaultCounter);
        texto.setText("Contador :"+miContador);
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
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences misPreferencias = getSharedPreferences("Mifichero",MODE_PRIVATE);

        //SharedPreferences settings = getPreferences(MODE_PRIVATE);
       // SharedPreferences.Editor editor = settings.edit();
        SharedPreferences.Editor editor = misPreferencias.edit();
        editor.putInt(KEY_COUNTER,miContador);
        editor.commit();


    }
}