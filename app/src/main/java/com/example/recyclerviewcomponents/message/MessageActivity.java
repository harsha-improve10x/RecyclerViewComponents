package com.example.recyclerviewcomponents.message;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class MessageActivity extends AppCompatActivity {
    public ArrayList<Message> messages;
    public MessageAdapter messageAdapter;
    public RecyclerView messagesRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getSupportActionBar().setTitle("Messages");
        setMessagesData();
        setMessagesRv();
    }

    public void setMessagesRv() {
        messagesRv = findViewById(R.id.message_rv);
        messagesRv.setLayoutManager(new LinearLayoutManager(this));
        messageAdapter = new MessageAdapter();
        messageAdapter.setMessagesData(messages);
        messagesRv.setAdapter(messageAdapter);
    }

    public void setMessagesData() {
        messages = new ArrayList<>();

        Message aravind = new Message();
        aravind.name = "Aravind";
        aravind.phoneNumber = " +91 9000540052";
        aravind.messageText = " Hi, Welcome to Improve 10X";
        messages.add(aravind);

        Message ramesh = new Message();
        ramesh.name = "Ramesh";
        ramesh.phoneNumber = " +91 9999999999";
        ramesh.messageText = " Hi, Welcome to Improve 10X";
        messages.add(ramesh);

        Message raj = new Message();
        raj.phoneNumber = "+91 9999999991";
        raj.messageText = " Hi, call me when you see the message";
        messages.add(raj);

        Message kailash = new Message();
        kailash.name = "Kailash";
        kailash.phoneNumber = " +91 9999999992";
        kailash.messageText = "-";
        messages.add(kailash);

        Message swiggy = new Message();
        swiggy.name = "Swiggy Delivery";
        swiggy.phoneNumber = " +91 9999999993";
        swiggy.messageText = " Full address";
        messages.add(swiggy);

        Message delivery = new Message();
        delivery.name = "Swiggy Delivery";
        delivery.phoneNumber = "+ 91 9999999993";
        delivery.messageText = " Are You available for this sunday?\n\n\nWe can have a call and discuss the movie";
        messages.add(delivery);
    }
}