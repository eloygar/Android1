package com.example.calendarpick;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalendarView.OnDateChangeListener {

    CalendarView calendarView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> onSelectedDayChange(view , year , month,dayOfMonth));
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
        textView= findViewById(R.id.fecha);
        String fecha = dayOfMonth+" "+month+" "+year;
        textView.setText(fecha);
    }
}