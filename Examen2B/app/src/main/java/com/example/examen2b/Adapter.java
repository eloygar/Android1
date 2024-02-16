package com.example.examen2b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<Pais> {
    LayoutInflater layoutInflater;
    public Adapter(@NonNull Context context, int resource, @NonNull List<Pais> objects) {
        super(context, resource, objects);
        layoutInflater = LayoutInflater.from(context);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View rowView = layoutInflater.inflate(R.layout. element, null, true);
        Pais p = getItem(position);

        TextView name = (TextView) rowView.findViewById(R.id.nombre);
        name.setText(p.getNombre());

        TextView capital = (TextView) rowView.findViewById(R.id.capital);
        capital.setText(p.getCapital());

        TextView poblacion = (TextView) rowView.findViewById(R.id.poblacion);
        poblacion.setText(p.getPoblación());

        TextView superficie = (TextView) rowView.findViewById(R.id.superficie);
        superficie.setText(p.getSuperficie());

        ImageView bandera = (ImageView) rowView.findViewById(R.id.bandera);
        bandera.setImageResource(p.bandera);

        return rowView;
    }
}