package com.example.examenlistview;

import static com.example.examenlistview.DatosElemento.drawableResourceFromId;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class AdaptadorElemento extends ArrayAdapter {
    // Lo que vamos a cargar en cada uno de los elemento.xml que van a las posiciones del recycler
    private List<DatosElemento> listaElementoDatos;
    private int layoutResId;  // Add this field to store the layout resource ID

    public AdaptadorElemento(@NonNull Context context, int layoutResId, @NonNull List<DatosElemento> listaElementoDatos) {
        super(context, layoutResId, listaElementoDatos);
        this.layoutResId = layoutResId;  // Set the layout resource ID
        this.listaElementoDatos = listaElementoDatos;
    }

    @Override
    public int getCount() {
        return listaElementoDatos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaElementoDatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(layoutResId, null);
        }

        TextView clubNameLabel = view.findViewById(R.id.club);
        TextView countryLabel = view.findViewById(R.id.pais);
        TextView cityLabel = view.findViewById(R.id.ciudad);
        TextView yearLabel = view.findViewById(R.id.año);
        ImageView imageView = view.findViewById(R.id.escudo);

        DatosElemento elemento = listaElementoDatos.get(position);

        clubNameLabel.setText(elemento.getClub());
        cityLabel.setText(elemento.getCiudad());
        countryLabel.setText(elemento.getPais());
        yearLabel.setText(elemento.getAño()+"");
        imageView.setBackgroundResource(drawableResourceFromId(elemento.getImagenId()));

        return view;
    }


}
