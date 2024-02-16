package com.example.operacionesaritmeticas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String PETICION = "PETICION";
    private Button button;
    private EditText editText1;
    private EditText editText2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editTextNumberSigned);
        editText2 = findViewById(R.id.editTextNumberSigned2);
        resultado = findViewById(R.id.r);
        button = findViewById(R.id.boton);
        button.setOnClickListener(v -> {
            onclikCambia(v);
        });
    }

    public void onclikCambia(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("n1", text1);
        bundle.putString("n2", text2);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK && data != null) {
                Bundle bundle = data.getBundleExtra(PETICION);

                if (bundle != null) {
                    String suma = bundle.getString("Suma");
                    String resta = bundle.getString("Resta");
                    String multiplicacion = bundle.getString("Multiplicacion");
                    String hola = bundle.getString("hola");
                    String division = bundle.getString("Division");
                    resultado.setText(" Suma " + suma + " Resta " + resta + " multiplicacion " + multiplicacion + " division " + division);
                }
            }
        }
    }
}