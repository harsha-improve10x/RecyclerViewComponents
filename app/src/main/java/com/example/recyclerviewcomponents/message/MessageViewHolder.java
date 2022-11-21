package com.example.recyclerviewcomponents.message;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

public class MessageViewHolder extends RecyclerView.ViewHolder {
    TextView nameTxt;
    TextView phoneNumber;
    TextView message;

    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTxt = itemView.findViewById(R.id.name_txt);
        phoneNumber = itemView.findViewById(R.id.number_txt);
        message = itemView.findViewById(R.id.message_text_txt);
    }
}
