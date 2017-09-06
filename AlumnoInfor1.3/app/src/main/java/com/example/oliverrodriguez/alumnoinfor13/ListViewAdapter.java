package com.example.oliverrodriguez.alumnoinfor13;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by oliverrodriguez on 31/08/17.
 */

public class ListViewAdapter extends BaseAdapter {

    private ArrayList <Alumno> arrayListAlumno;
    private Context context;
    private LayoutInflater layoutInflater;

    public ListViewAdapter(ArrayList<Alumno> arrayListAlumno, Context context) {
        this.arrayListAlumno = arrayListAlumno;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayListAlumno.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayListAlumno.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vistaAlumno = layoutInflater.inflate(R.layout.alumno,viewGroup,false);

        ImageView imageView = (ImageView) vistaAlumno.findViewById(R.id.ivImagen);
        TextView txtNombre = (TextView) vistaAlumno.findViewById(R.id.txt_nombre);
        TextView txtNc = (TextView) vistaAlumno.findViewById(R.id.txt_nc);
        TextView txtCarrer = (TextView) vistaAlumno.findViewById(R.id.txt_carrera);

        txtCarrer.setText(arrayListAlumno.get(i).getCarrera());
        txtNc.setText(arrayListAlumno.get(i).getNc());
        txtNombre.setText(arrayListAlumno.get(i).getNombre());
        imageView.setImageResource(arrayListAlumno.get(i).getImagen());
        return vistaAlumno;
    }
}
