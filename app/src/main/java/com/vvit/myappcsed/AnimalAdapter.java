package com.vvit.myappcsed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private List<String> myAnimals;

    public AnimalAdapter(List<String> myAnimals) {
        this.myAnimals = myAnimals;
    }

    @NonNull
    @Override
    public AnimalAdapter.AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_animal,parent,false);
        AnimalViewHolder holder = new AnimalViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalAdapter.AnimalViewHolder holder, int position) {
        Animal animal = new Animal(myAnimals.get(position));
        holder.myAnimalName.setText(animal.getName());
    }

    @Override
    public int getItemCount() {
        return myAnimals.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        TextView myAnimalName;
        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            myAnimalName = itemView.findViewById(R.id._animal_name);
        }
    }
}
