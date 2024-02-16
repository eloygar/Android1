package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.senddata.ui.login.LoginActivity;


public class MainActivity extends AppCompatActivity {
    private ImageButton careto;
    private EditText editText;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        careto = findViewById(R.id.careto);
        careto.setOnClickListener(v -> {
            onclikCambia(v);
        });
        editText = findViewById(R.id.cajita);
        editText2 = findViewById(R.id.password);

    }

    public void onclikCambia(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        String text = editText.getText().toString();
        String text2 = editText2.getText().toString();

        Bundle cosas = new Bundle();
        cosas.putString("user", text);
        cosas.putString("password",text2);
        intent.putExtras(cosas);
        startActivity(intent);

    }

}