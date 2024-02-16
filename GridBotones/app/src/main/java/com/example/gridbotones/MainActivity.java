package com.example.gridbotones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.gridlayout.widget.GridLayout;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
   GridLayout grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = (GridLayout) findViewById(R.id.grid);
        addHijos();
        recorrer();
    }
    public void recorrer(){
        View v;
        for (int i = 0; i<grid.getChildCount(); i++){
            v = grid.getChildAt(i);
            Toast.makeText(this, "Objeto: "+v.toString(), Toast.LENGTH_SHORT).show();
            v.setBackgroundColor(Color.rgb(255,255,255 ));
        }

    }

    public void addHijos(){
        Button button;
        for (int i = 0; i<18;i++){
            button = new Button(this);
            button.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setText("Button " +i);
            button.setId((View.generateViewId()));
            button.setOnClickListener(this);
            grid.addView(button,i);
        }
    }

    public void onClick(View view){
        Button button = (Button) view;
        recorrer();
     //   button.setBackgroundColor(getColor(R.color.white));
        button.setBackgroundColor(Color.rgb(244,23,244) );

    }
}