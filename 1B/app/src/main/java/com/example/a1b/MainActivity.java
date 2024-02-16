package com.example.a1b;

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
        EditText editText = (EditText) findViewById(R.id.stones);
        EditText editText2 = (EditText) findViewById(R.id.libras);
        if(Integer.parseInt(editText2.getText().toString())>13){
            Toast.makeText(this, "Error las libras tienen que ser menores que 13 ", Toast.LENGTH_SHORT).show();
            return;
        }
        //sin las , produce error
        //String text = editText.getText().toString()+ editText2.getText().toString();
        String text = editText.getText().toString() + "," + editText2.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT,text);


        startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            ((TextView)findViewById(R.id.resultado)).setText(data.getDoubleExtra(REQUEST_RESULT,
                    0) + " kg");
        }

    }
}