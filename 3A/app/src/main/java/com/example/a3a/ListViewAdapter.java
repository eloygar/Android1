package com.example.a3a;

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
public class ListViewAdapter extends ArrayAdapter<Equipo> {
    LayoutInflater layoutInflater;
    public ListViewAdapter(@NonNull Context context, int resource, @NonNull List<Equipo> objects) {
        super(context, resource, objects);
        layoutInflater = LayoutInflater.from(context);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View rowView = layoutInflater.inflate(R.layout. element, null, true);
        Equipo t = getItem(position);

        TextView name = (TextView) rowView.findViewById(R.id.nombre);
        name.setText(t.getNombre());

        TextView city = (TextView) rowView.findViewById(R.id.ciudad);
        city.setText(t.getCiudad());

        TextView country = (TextView) rowView.findViewById(R.id.pais);
        country.setText(t.getPais());

        TextView year = (TextView) rowView.findViewById(R.id.anho);
        year.setText(t.getAnho());

        ImageView icon = (ImageView) rowView.findViewById(R.id.escudo);
        icon.setImageResource(t.escudo);

        return rowView;
    }
}
