package com.vvit.myappcsed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRecyclerViewDemo extends AppCompatActivity {
    RecyclerView myAnimalView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drecycler_view_demo);
        myAnimalView = findViewById(R.id._list_recycler_view);

        List<String> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(getResources().getStringArray(R.array.my_animals)));

        AnimalAdapter animalAdapter = new AnimalAdapter(myList);

        myAnimalView.setLayoutManager(new LinearLayoutManager(this));
        myAnimalView.setAdapter(animalAdapter);

    }
}