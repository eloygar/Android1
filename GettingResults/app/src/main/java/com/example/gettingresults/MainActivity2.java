package com.example.gettingresults;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.llegado);
        button = findViewById(R.id.volver);
        text = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        textView.setText(text);
        button.setOnClickListener(v -> {
            volver(v);
        });
    }

    public void volver(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.REQUESTS_RESULT,text.toUpperCase());
        setResult(RESULT_OK,intent);
        finish();

    }
}