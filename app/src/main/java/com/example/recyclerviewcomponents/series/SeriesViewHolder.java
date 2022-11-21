package com.example.recyclerviewcomponents.series;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

public class SeriesViewHolder extends RecyclerView.ViewHolder {
ImageView seriesImg;
TextView seriesName;

    public SeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        seriesImg = itemView.findViewById(R.id.series_iv);
        seriesName = itemView.findViewById(R.id.movie_series_txt);
    }
}
