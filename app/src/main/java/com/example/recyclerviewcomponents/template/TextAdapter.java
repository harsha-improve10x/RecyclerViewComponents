package com.example.recyclerviewcomponents.template;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class TextAdapter extends RecyclerView.Adapter<TextViewHolder> {
public ArrayList<Text> texts;

    public void setDataTexts(ArrayList<Text> textList) {
        texts = textList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_xml_file,parent,false);
        TextViewHolder textViewHolder = new TextViewHolder(view);
        return textViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {
        Text text = texts.get(position);
        holder.messageTxt.setText(text.messageText);
    }

    @Override
    public int getItemCount() {
        return texts.size();
    }
}
