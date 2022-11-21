package com.example.recyclerviewcomponents.template;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

public class TextViewHolder extends RecyclerView.ViewHolder {
    TextView messageTxt;

    public TextViewHolder(@NonNull View itemView) {
        super(itemView);
        messageTxt = itemView.findViewById(R.id.message_txt);
    }
}
