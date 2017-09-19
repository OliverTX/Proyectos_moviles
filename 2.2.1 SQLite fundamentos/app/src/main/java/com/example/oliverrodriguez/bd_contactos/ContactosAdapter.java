package com.example.oliverrodriguez.bd_contactos;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by oliverrodriguez on 19/09/17.
 */

public class ContactosAdapter extends ArrayAdapter<String>{
    public ContactosAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
    }
}
