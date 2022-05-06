package com.vvit.myappcsed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {
    RecyclerView myMovieListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        ArrayList<Movie> myMovieList = (ArrayList<Movie>) getIntent().getSerializableExtra("myMovieList");

        myMovieListView = findViewById(R.id._movies_list);
        MovieAdapter movieAdapter = new MovieAdapter(myMovieList,getApplicationContext());
        myMovieListView.setAdapter(movieAdapter);
        myMovieListView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}