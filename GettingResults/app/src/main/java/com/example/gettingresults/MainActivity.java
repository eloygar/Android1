package com.example.gettingresults;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button boton;
    private EditText editText;
    private TextView textView;
    public static String REQUESTS_RESULT = "REQUEST_RESUlT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.cajita);
        boton = findViewById(R.id.boton);
        boton.setOnClickListener(v -> {
            onclikCambia(v);
        });

    }

    public void onclikCambia(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        String text = editText.getText().toString();


        intent.putExtra(Intent.EXTRA_TEXT, text);
        startActivityForResult(intent, 1);

    }

    // recuperar datos de regreso de una tederminada actividad con codigo
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            Intent intent = new Intent();
            if (resultCode==RESULT_OK){
                textView = findViewById(R.id.resultado);
                String text = data.getStringExtra(REQUESTS_RESULT);
                textView.setText(text);
            }




    }
}