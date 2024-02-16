package com.example.recicleviewcontextual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<DatosElementos> list = DatosElementos.poblarLista();
        /*List<String> list = new ArrayList<>();
        list.add("China");
        list.add("France");
        list.add("Germany");
        list.add("India");
        list.add("Russia");
        list.add("United Kingdom");
        list.add("United States");

        // Lista de detalles
        List<String> detailList = new ArrayList<>();
        detailList.add("Asia");
        detailList.add("Europe");
        detailList.add("Europe");
        detailList.add("Asia");
        detailList.add("Asia");
        detailList.add("Europe");
        detailList.add("North America");*/

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        RecyclerView recyclerView = findViewById(R.id.rv_View);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        // Para cargar la lista en cada elemento.xml
        MiAdaptador miAdaptador = new MiAdaptador(list);
        recyclerView.setAdapter(miAdaptador);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            miAdaptador.add();
        });

    }
}