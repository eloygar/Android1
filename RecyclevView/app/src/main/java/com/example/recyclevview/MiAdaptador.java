package com.example.recyclevview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiViewHolder> {
 /*private List<String> nameList;
 private List<String> detailList; // Nueva lista para detalles
*/
    private List<DatosElementos> lista;

    public MiAdaptador(List<DatosElementos> lista) {
        this.lista = lista;
    }

// Modificar el constructor para aceptar ambas listas
    /*public MiAdaptador(List<String>nameList, List<String> detailList){
     this.nameList=nameList;
     this.detailList = detailList;
 }*/
    public void add (){
        DatosElementos dato = new DatosElementos("ciudad extra","pais extra");
        lista.add(dato);
        notifyDataSetChanged();
        //notifyItemInserted(posicion);
    }
    public void suprime(int posicion){
    lista.remove(posicion);
    notifyDataSetChanged();
    //notifyItemInserted(posicion);

    }


    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.element,parent,false);
        MiViewHolder myMiViewHolder = new MiViewHolder(view);
        return myMiViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, @SuppressLint("RecyclerView") int position) {
        final String ciudad = lista.get(position).getCiudad();
        final String pais = lista.get(position).getPais();
        holder.textView.setText(ciudad);
        holder.detailView.setText(pais);
        holder.imageView.setBackgroundResource(R.drawable.imagen);

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                suprime(position);
            }
        });

        //final String name = nameList.get(position);
        //final String detail = detailList.get(position); // Obtener el detalle
       // holder.textView.setText(name);
       // holder.detailView.setText(detail); // Asignar el detalle al segundo TextView
        //holder.imageView.setBackground();
    }

    @Override
    public int getItemCount() {
        if (lista==null){
            return 0;
        }else {
            return lista.size();
        }
    }

    public class MiViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;
        public TextView detailView; // Segundo TextView
        private ImageView imageView;// imagen
        public MiViewHolder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.tv_label);
            detailView = itemView.findViewById(R.id.tv_label2); // Inicializar el segundo TextView
            imageView = itemView.findViewById(R.id.imageView); // imagen
        }

    }
}
