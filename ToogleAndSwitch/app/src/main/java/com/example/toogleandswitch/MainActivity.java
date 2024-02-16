package com.example.toogleandswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements ToggleButton.OnCheckedChangeListener {
    ToggleButton toggleButton;
    Switch aSwitch;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = findViewById(R.id.toggleButton);
        aSwitch= findViewById(R.id.switch1);
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> onCheckedChanged(buttonView,isChecked));
        aSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> cambiaSwitch(buttonView,isChecked) );
        imageView = findViewById(R.id.imageView);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            if (isChecked)
            {
                imageView.setBackgroundResource(R.drawable.team1);
            }else{
                imageView.setBackgroundResource(R.drawable.team4);
            }
    }
    public void cambiaSwitch (CompoundButton buttonView, boolean isChecked){

        if (isChecked)
        {
            imageView.setBackgroundResource(R.drawable.team2);
        }else{
            imageView.setBackgroundResource(R.drawable.team3);
        }
    }
}