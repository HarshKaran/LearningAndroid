package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class TypesOfViewsActivity extends AppCompatActivity {
ListView listView;
Spinner spinner;
AutoCompleteTextView autoView;
ArrayList<String>arrNames=new ArrayList<>();
ArrayList<String>arrIds=new ArrayList<>();
ArrayList<String> arrLanguages = new ArrayList<>();

// ************ ListView ************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_views);
        listView=findViewById(R.id.listView);
        spinner=findViewById(R.id.spinner);
        autoView=findViewById(R.id.autoView);
        arrNames.add("Rahul");
        arrNames.add("Rah");
        arrNames.add("Ram");
        arrNames.add("Arun");
        arrNames.add("Chomu");
        arrNames.add("Cheeku");
        arrNames.add("Lodu");
        arrNames.add("Gaandu");
        arrNames.add("lund");
        arrNames.add("Rahul");
        arrNames.add("Rah");
        arrNames.add("Ram");
        arrNames.add("Arun");
        arrNames.add("Chomu");
        arrNames.add("Cheeku");
        arrNames.add("Lodu");
        arrNames.add("Gaandu");
        arrNames.add("lund");
        arrNames.add("Rahul");
        arrNames.add("Rah");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // i is position
                if(i==0){
                    Toast.makeText(TypesOfViewsActivity.this, "Clickef 1st Item", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //   ******  Spinner ************

        arrIds.add("Aadhar Card");
        arrIds.add("Rashan Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving Card");
        arrIds.add("PAN Card");

        ArrayAdapter<String> Spinneradapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(Spinneradapter);

        //   ******** Auto Complete View *********

        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("C#");
        arrLanguages.add("CScript");
        arrLanguages.add("Objective C");
        arrLanguages.add("PHP");
        arrLanguages.add("Java");

        ArrayAdapter<String> Language_adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguages);
        autoView.setAdapter(Language_adapter);
        autoView.setThreshold(1);


    }
}