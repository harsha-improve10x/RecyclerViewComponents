package com.example.recyclerviewcomponents.advancedSeries;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;


public class AdvancedViewHolder extends RecyclerView.ViewHolder {
    TextView advancedName;
    ImageView advancedIv;

    public AdvancedViewHolder(@NonNull View itemView) {
        super(itemView);
        advancedName = itemView.findViewById(R.id.advanced_txt);
        advancedIv = itemView.findViewById(R.id.advanced_iv);
    }
}
