package com.example.recyclerviewcomponents.groceries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GroceriesAdapter extends RecyclerView.Adapter<GroceriesViewHolder> {

    public ArrayList<Grocery> groceries;

    public void setGroceries(ArrayList<Grocery> groceriesList) {
        groceries = groceriesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GroceriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.groceries_xml_layout, parent, false);
        GroceriesViewHolder groceriesViewHolder = new GroceriesViewHolder(view);
        return groceriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceriesViewHolder holder, int position) {
        Grocery grocery = groceries.get(position);
        holder.itemTxt.setText(grocery.item);
        Picasso.get().load(grocery.imageUrl).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return groceries.size();
    }
}
