package com.example.timeclock;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textClock = findViewById(R.id.reloj);
        textClock.setOnClickListener(view -> pillahora());
        @SuppressLint({"MissingInflatedId","LocalSuppress"}) Button ton =findViewById(R.id.ponHora);
        ton.setOnClickListener(v -> {
            toquecito();
        });
    }

    public void pillahora() {
        TextView textView = findViewById(R.id.hora);
        textView.setText(textClock.getText().toString());
    }
    public void toquecito(){
        EditText editText = findViewById(R.id.pon);
        String pon = editText.getText().toString();
        Toast.makeText(this,"ver formato en horas "+pon ,Toast.LENGTH_LONG).show();
        textClock.setText(pon);
    }
}