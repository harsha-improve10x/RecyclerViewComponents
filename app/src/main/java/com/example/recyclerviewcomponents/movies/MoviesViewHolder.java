package com.example.recyclerviewcomponents.movies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

public class MoviesViewHolder extends RecyclerView.ViewHolder {
    TextView moviesTitle;
    ImageView imageView;

    public MoviesViewHolder(@NonNull View itemView) {
        super(itemView);
        moviesTitle = itemView.findViewById(R.id.movie_title_txt);
        imageView = itemView.findViewById(R.id.picture_iv);

    }
}
