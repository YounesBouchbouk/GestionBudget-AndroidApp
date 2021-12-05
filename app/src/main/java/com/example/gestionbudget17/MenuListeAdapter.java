package com.example.gestionbudget17;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MenuListeAdapter extends ArrayAdapter<MenuClass> {


    public MenuListeAdapter( Context context , ArrayList<MenuClass> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        MenuView myview = (MenuView) convertView;
        if (myview == null) {
            myview = myview.create(parent);
        }

        myview.display(super.getItem(position));
        return myview;
    }

}
