package com.example.a2b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.gridlayout.widget.GridLayout;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    GridLayout grid;
    char[] letras = {'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = (GridLayout) findViewById(R.id.gridLayout);
        addButtons();
        //recorrer();
        Button resetButton = findViewById(R.id.button);
        resetButton.setOnClickListener(view -> resetButtons());
    }
    public void addButtons() {
        Button button;
        Random random = new Random();

        for (int i = 0; i < 24; i++) {

            button = new Button(this);
            button.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            //letra random con array
            char randomLetter = letras[random.nextInt(letras.length)];

            button.setText(String.valueOf(randomLetter));
            button.setId(View.generateViewId());
            button.setOnClickListener(this);

            grid.addView(button, i);
        }
    }


   /* public void recorrer(){
        View v;
        for (int i = 0; i<grid.getChildCount(); i++){
            v = grid.getChildAt(i);
           // Toast.makeText(this, "Objeto: "+v.toString(), Toast.LENGTH_SHORT).show();
            v.setBackgroundColor(Color.rgb(255,255,255 ));
        }
    }*/
   @Override
   public void onClick(View v) {
       if (v instanceof Button) {
           Button clickedButton = (Button) v;
           clickedButton.setText("55");
       }
   }

    private void resetButtons() {
        Button button;
        Random random = new Random();

        for (int i = 0; i < grid.getChildCount(); i++) {
            button = (Button) grid.getChildAt(i);
            char randomLetter = letras[random.nextInt(letras.length)];
            button.setText(String.valueOf(randomLetter));
        }
    }
}