package com.example.recyclerviewcomponents.groceries;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

public class GroceriesViewHolder extends RecyclerView.ViewHolder {

    TextView itemTxt;
    ImageView imageView;

    public GroceriesViewHolder(@NonNull View itemView) {
        super(itemView);
        itemTxt = itemView.findViewById(R.id.groceries_txt);
        imageView = itemView.findViewById(R.id.groceries_iv);
    }
}
