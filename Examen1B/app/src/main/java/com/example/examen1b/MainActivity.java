package com.example.examen1b;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String REQUEST_RESULT = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickSwitchActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.pies);
        EditText editText2 = (EditText) findViewById(R.id.pulgadas);
        if(Integer.parseInt(editText2.getText().toString())>11){
            Toast.makeText(this, "Error las pulgadas tienen que ser menores que 11 ", Toast.LENGTH_SHORT).show();
            return;
        }
        //String text = editText.getText().toString()+ editText2.getText().toString();
        String text = editText.getText().toString() + "," + editText2.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT,text);


        startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            ((TextView)findViewById(R.id.vuelta)).setText(data.getDoubleExtra(REQUEST_RESULT,
                    0) + " cm");
        }

    }}