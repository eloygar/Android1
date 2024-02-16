package com.example.a2a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableLayout = findViewById(R.id.tableLayout);
        addButtons();

        Button resetButton = findViewById(R.id.button);
        resetButton.setOnClickListener(view -> resetButtons());
    }

    public void addButtons() {
        TableRow row;
        Button button;
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            row = new TableRow(this);

            for (int j = 0; j < 4; j++) {
                button = new Button(this);
                button.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                int randomNumber = random.nextInt(50) + 1;
                button.setText(String.valueOf(randomNumber));
                button.setId(View.generateViewId());
                button.setOnClickListener(this);

                row.addView(button);
            }

            tableLayout.addView(row);
        }
    }

    @Override
    public void onClick(View v) {
        if (v instanceof Button) {
            Button clickedButton = (Button) v;
            clickedButton.setText("Z");
        }
    }

    private void resetButtons() {
        Button button;

        for (int i = 0; i < tableLayout.getChildCount(); i++) {
            TableRow row = (TableRow) tableLayout.getChildAt(i);

            for (int j = 0; j < row.getChildCount(); j++) {
                button = (Button) row.getChildAt(j);
                button.setEnabled(true);  // Habilitar el botón
                int randomNumber = new Random().nextInt(50) + 1;
                button.setText(String.valueOf(randomNumber));
            }
        }
    }
}
