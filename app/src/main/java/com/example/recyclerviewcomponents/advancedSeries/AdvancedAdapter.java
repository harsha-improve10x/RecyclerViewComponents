package com.example.recyclerviewcomponents.advancedSeries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdvancedAdapter extends RecyclerView.Adapter<AdvancedViewHolder> {
    public ArrayList<AdvancedSeries> advancedSerieses;

    public void setAdvancedSerieses(ArrayList<AdvancedSeries> advancedSeriesesList) {
        advancedSerieses = advancedSeriesesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdvancedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advanced_xml_layout,parent,false);
        AdvancedViewHolder advancedViewHolder = new AdvancedViewHolder(view);
        return advancedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdvancedViewHolder holder, int position) {
        AdvancedSeries advancedSeries = advancedSerieses.get(position);
        holder.advancedName.setText(advancedSeries.movieTitle);
        Picasso.get().load(advancedSeries.ImageUrl).into(holder.advancedIv);
    }

    @Override
    public int getItemCount() {
        return advancedSerieses.size();
    }
}
