package com.vvit.myappcsed;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private ArrayList<Movie> myMovieList;
    private Context context;

    public MovieAdapter(ArrayList<Movie> myMovieList, Context context) {
        this.myMovieList = myMovieList;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_movie, parent, false);
        MovieViewHolder holder = new MovieViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        Movie movie = new Movie();
        movie.setTitle(myMovieList.get(position).getTitle());
        movie.setRelease_date(myMovieList.get(position).getRelease_date());
        holder.movieName.setText(movie.getTitle());
        holder.movieReleaseDate.setText(movie.getRelease_date());
        holder.movieName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Clicked on : ",movie.getTitle());
                Toast.makeText(context, "Clicked on "+movie.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myMovieList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView movieName, movieReleaseDate;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movieName = itemView.findViewById(R.id._movie_name);
            movieReleaseDate = itemView.findViewById(R.id._movie_release_date);

        }
    }
}
