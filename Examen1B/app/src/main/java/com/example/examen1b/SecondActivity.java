package com.example.examen1b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent() != null && getIntent().hasExtra(Intent.EXTRA_TEXT)) {

            TextView textview = (TextView) findViewById(R.id.piesCm);
            TextView textview2 = (TextView) findViewById(R.id.pulgadasCm);

            Intent intent = getIntent();
            String text = intent.getStringExtra(Intent.EXTRA_TEXT).toString();

            String[] valores = text.split(",");
            textview.setText(valores[0]+" pies");
            textview2.setText(valores[1]+" pulgadas");
        }
    }
    public void onClickRegresa(View view) {
        //try {
        double n = Double.parseDouble(((TextView) findViewById(R.id.suma)).getText().toString());
        Intent returnIntent = new Intent();
        returnIntent.putExtra(MainActivity.REQUEST_RESULT, n);
        setResult(RESULT_OK, returnIntent);
        finish();
        // try catch por error en el parse
      /* } catch (NumberFormatException e) {
           e.printStackTrace();
           Toast.makeText(this, "Error al convertir a double", Toast.LENGTH_SHORT).show();
       } catch (Exception e) {
           e.printStackTrace();
           Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

       }*/
    }
    public void suma(View view){
        TextView textView = (TextView) findViewById(R.id.piesCm);
        int num1 = Integer.parseInt(textView.getText().toString().split(" ")[0]);

        TextView textView2 = (TextView) findViewById(R.id.pulgadasCm);
        int num2 = Integer.parseInt(textView2.getText().toString().split(" ")[0]);

        double n1 = (double) num1 * 30.48 ;
        double n2 = (double) num2 * 2.54;

        ((TextView)findViewById(R.id.suma)).setText(String.valueOf(n1 + n2));
    }

}