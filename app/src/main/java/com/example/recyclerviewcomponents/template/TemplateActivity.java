package com.example.recyclerviewcomponents.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class TemplateActivity extends AppCompatActivity {
    public ArrayList<Text> texts;
    public TextAdapter textAdapter;
    public RecyclerView messageRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        getSupportActionBar().setTitle("Templates");
        setupDataText();
        setMessageRecyclerView();
    }

    public void setMessageRecyclerView() {
    messageRv = findViewById(R.id.message_rv);
    messageRv.setLayoutManager(new LinearLayoutManager(this));
    textAdapter = new TextAdapter();
    textAdapter.setDataTexts(texts);
    messageRv.setAdapter(textAdapter);
    }

    public void setupDataText() {
        texts = new ArrayList<>();

        Text welcome = new Text();
        welcome.messageText = "Hi,\nWelcome to Improve 10X";
        texts.add(welcome);

        Text busy = new Text();
        busy.messageText = "Hi,I'm busy.I'll call you later";
        texts.add(busy);

        Text call = new Text();
        call.messageText = "Hi,\ncall me when you see the message";
        texts.add(call);

        Text contact = new Text();
        contact.messageText = "-Hi, Please find my contact details\nName: Viswanath Kumar Sandu\nCompany: improve 10X\nMobile: +91900054002";
        texts.add(contact);

        Text account = new Text();
        account.messageText = "Hi, Please find my account details\nAccount Number: 625101515776\nBank: ICICI Bank\nIFSC Code: ICIC0006251";
        texts.add(account);
    }
}