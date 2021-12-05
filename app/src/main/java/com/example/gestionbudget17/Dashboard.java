package com.example.gestionbudget17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {
    private ArrayList<MenuClass> liste;
    private ArrayAdapter adapter;
    private static final int RQ_CODE_EDITION = 1;

    public ArrayList<MenuClass> initData(){
        Resources res = getResources();
        final String[] libelles =  res.getStringArray(R.array.Menu);
        final String[] prix = res.getStringArray(R.array.prix);
        ArrayList<MenuClass> liste2;
        liste2 = new ArrayList<>();
        for (int i=0; i<libelles.length; ++i) {
            liste2.add(new MenuClass(libelles[i], prix[i] ));
        }

        return liste2;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        liste = new ArrayList<>();
        liste = initData();
        ListView lv = (ListView) findViewById(android.R.id.list);
        adapter = new MenuListeAdapter(this,liste);
        lv.setAdapter(adapter);

    }
}