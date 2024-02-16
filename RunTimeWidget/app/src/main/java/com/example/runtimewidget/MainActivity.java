package com.example.runtimewidget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {
     ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout= findViewById(R.id.layout);

        DatePicker datePicker = new DatePicker(this);
       
       /* datePicker.setLayoutParams(new ViewPager.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));*/
        constraintLayout.addView(datePicker);
    }
}