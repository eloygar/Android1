package com.example.operacionesaritmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private int uno=0 , dos =0;
    private Button boton ;

    private TextView num1;

    private TextView num2;

    protected  static int Suma(int uno , int dos){

        return uno+dos;
    }
    protected  static int Resta(int uno , int dos){

        return uno-dos;
    }
    protected  static int Multiplicacion(int uno , int dos){

        return uno*dos;
    }
    protected static double Division(int dividendo, int divisor) {
        if (divisor == 0) {
            // Manejar el caso de división entre 0
            return Double.POSITIVE_INFINITY; // Puedes elegir otro valor apropiado
        } else {
            return (double) dividendo / divisor;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        num1 = findViewById(R.id.num1);
        num2= findViewById(R.id.num2);
        boton = findViewById(R.id.button);
        Bundle llegar =getIntent().getExtras();
        num1.setText(llegar.getString("n1"));
        num2.setText(llegar.getString("n2"));
        uno = Integer.parseInt(num1.getText().toString());
        dos = Integer.parseInt(num2.getText().toString());
        boton.setOnClickListener(v -> {
            onClickVuelve(v);
        });
    }
    public void onClickVuelve(View view){

        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("Suma",Suma(uno,dos)+"");
        bundle.putString("Resta",Resta(uno,dos)+"");
        bundle.putString("Multiplicacion",Multiplicacion(uno,dos)+"");
        bundle.putString("Division",Division(uno,dos)+"");

        intent.putExtra(MainActivity.PETICION,bundle);
        setResult(RESULT_OK,intent);
        finish();
        
    }
}