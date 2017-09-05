package com.example.oliverrodriguez.a14menuderestaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by oliverrodriguez on 05/09/17.
 */

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<Platillo> arrayListPlatillo;
    private Context context;
    private LayoutInflater layoutInflater;

    public ListViewAdapter(ArrayList<Platillo> arrayListPlatillo, Context context) {
        this.arrayListPlatillo = arrayListPlatillo;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayListPlatillo.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayListPlatillo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vistaPlatillo = layoutInflater.inflate(R.layout.platillo,viewGroup,false);

        ImageView imaPlatillo= (ImageView) vistaPlatillo.findViewById(R.id.im_platillo);
        TextView txtPlatillo = (TextView) vistaPlatillo.findViewById(R.id.txt_platillo);
        TextView txtCantidad =( TextView) vistaPlatillo.findViewById(R.id.txt_cantidad);
        imaPlatillo.setImageResource(arrayListPlatillo.get(i).getImagen());
        txtPlatillo.setText(arrayListPlatillo.get(i).getNombre());
        txtCantidad.setText(""+arrayListPlatillo.get(i).getCantidad());
        return vistaPlatillo;
    }
}
