package com.example.examen3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.gridlayout.widget.GridLayout;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    GridLayout grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = (GridLayout) findViewById(R.id.gridLayout);
        addButtons();
        Button resetButton = findViewById(R.id.button);
        resetButton.setOnClickListener(view -> resetButtons());
    }
    public void addButtons() {
        Button button;
        Random random = new Random();

        for (int i = 0; i < 20; i++) {

            button = new Button(this);
            button.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            int randomNumber = random.nextInt(50);
            button.setText(String.valueOf(randomNumber));
            button.setId(View.generateViewId());
            button.setOnClickListener(this);

            grid.addView(button, i);
        }
    }

    @Override
    public void onClick(View v) {
        if (v instanceof Button) {
            Button clickedButton = (Button) v;
            clickedButton.setText("RR");
        }
    }

    private void resetButtons() {
        Button button;
        Random random = new Random();

        for (int i = 0; i < grid.getChildCount(); i++) {
            button = (Button) grid.getChildAt(i);
            int randomNumber = random.nextInt(50);
            button.setText(String.valueOf(randomNumber));
        }
    }
}

