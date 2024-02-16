package com.example.a1b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);

        if(getIntent() != null && getIntent().hasExtra(Intent.EXTRA_TEXT)) {

            TextView textview = (TextView) findViewById(R.id.stones2);
            TextView textview2 = (TextView) findViewById(R.id.libras2);

            Intent intent = getIntent();
            String text = intent.getStringExtra(Intent.EXTRA_TEXT).toString();


            String[] pesos = text.split(",");
            textview.setText(pesos[0]+" stones");
            textview2.setText(pesos[1]+" libras");
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
    public void convertir(View view){
        TextView textView = (TextView) findViewById(R.id.stones2);
        int num1 = Integer.parseInt(textView.getText().toString().split(" ")[0]);

        TextView textView2 = (TextView) findViewById(R.id.libras2);
        int num2 = Integer.parseInt(textView2.getText().toString().split(" ")[0]);


        double res = ((double) num1 * 6.35) +((double) num2 * 0.453592);
       ((TextView)findViewById(R.id.suma)).setText(String.valueOf(res));



    }

}
