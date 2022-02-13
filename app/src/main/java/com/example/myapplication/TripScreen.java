package com.example.myapplication;

import java.util.ArrayList;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TripScreen extends AppCompatActivity {
    ArrayList<Bus> buses;
    GridView gridView;
    GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_screen);

        gridView = findViewById(R.id.gridview_buses_trip);
        buses = new ArrayList<>();
        Bus bs1 = new Bus(111111,"123456");
        buses.add(bs1);
        buses.add(new Bus(222222, "3037485"));
        buses.add(new Bus(333333, "3037485"));
        buses.add(new Bus(444444, "3037485"));
        buses.add(new Bus(555555, "3037485"));
        buses.add(new Bus(666666, "3037485"));
        buses.add(new Bus(777777, "3037485"));
        buses.add(new Bus(888888, "3037485"));
        buses.add(new Bus(999999, "3037485"));

        adapter = new GridAdapter(TripScreen.this, buses);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //todo - what next after click on current bus
            }
        });

        gridView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //todo - what happens when we long press on single bus
                return true;
            }
        });
    }


}