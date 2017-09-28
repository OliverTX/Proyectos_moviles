package com.example.oliverrodriguez.a222agenda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oliverrodriguez on 20/09/17.
 */

public class ContactoAdapter extends BaseAdapter {
    private ArrayList<Contacto> contactos;
    private Context context;
    private LayoutInflater inflater;

    public ContactoAdapter( Context context,ArrayList<Contacto> contactos) {
        this.contactos = contactos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contactos.size();
    }

    @Override
    public Object getItem(int i) {
        return contactos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.plantillacont,viewGroup,false);
        TextView nombre = (TextView) view1.findViewById(R.id.txt_nombre);
        TextView mail = (TextView) view1.findViewById(R.id.txt_mail);
        TextView cel = (TextView) view1.findViewById(R.id.txt_cel);
        nombre.setText(""+contactos.get(i).getNombre());
        mail.setText(""+contactos.get(i).getMail());
        cel.setText(""+contactos.get(i).getCel());
        return view1;
    }
}
