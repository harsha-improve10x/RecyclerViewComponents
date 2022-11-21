package com.example.recyclerviewcomponents.advancedSeries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class AdvancedSeriesActivity extends AppCompatActivity {
    public ArrayList<AdvancedSeries> advancedSeries;
    public RecyclerView advancedRv;
    public AdvancedAdapter advancedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_series);
        getSupportActionBar().setTitle("Series");
        setAdvancedSeriesData();
        setAdvancedRv();
    }

    public void setAdvancedRv() {
        advancedRv = findViewById(R.id.advanced_series_rv);
        advancedRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        advancedAdapter = new AdvancedAdapter();
        advancedAdapter.setAdvancedSerieses(advancedSeries);
        advancedRv.setAdapter(advancedAdapter);
    }

    public void setAdvancedSeriesData() {
        advancedSeries = new ArrayList<>();
        AdvancedSeries harry1 = new AdvancedSeries();
        harry1.ImageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/01_HP_Film1_1.jpg";
        harry1.movieTitle = "Harry Potter and the Philosopher's Stone";
        advancedSeries.add(harry1);

        AdvancedSeries harry2 = new AdvancedSeries();
        harry2.ImageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/02_HP_Film2_2.jpg";
        harry2.movieTitle = "Harry Potter and the Chamber of Secrets";
        advancedSeries.add(harry2);

        AdvancedSeries harry3 = new AdvancedSeries();
        harry3.ImageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/03_HP_Film3_3.jpg?downsize=1920:*&output-quality=92";
        harry3.movieTitle = "Harry Potter and the Prisoner of Azkaban";
        advancedSeries.add(harry3);

        AdvancedSeries harry4 = new AdvancedSeries();
        harry4.ImageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/04_HP_Film4_4.jpg";
        harry4.movieTitle = "Harry Potter and the Goblet of fire";
        advancedSeries.add(harry4);

        AdvancedSeries harry5 = new AdvancedSeries();
        harry5.ImageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/05_HP_Film5_5.jpg";
        harry5.movieTitle = "Harry Potter and the Order of the Phoenix";
        advancedSeries.add(harry5);

        AdvancedSeries harry6 = new AdvancedSeries();
        harry6.ImageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/06_HP_Film6_6.jpg?downsize=1920:*&output-quality=92";
        harry6.movieTitle = "Harry Potter and the Half-Blood Prince";
        advancedSeries.add(harry6);

        AdvancedSeries harry7 = new AdvancedSeries();
        harry7.ImageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/07_HP_Film7_7.jpg";
        harry7.movieTitle = "Harry Potter and the Deathly Hallows - Part 1";
        advancedSeries.add(harry7);

        AdvancedSeries harry8 = new AdvancedSeries();
        harry8.ImageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/08_HP_Film8_8_.jpg";
        harry8.movieTitle = "Harry Potter and the Deathly Hallows - Part 2";
        advancedSeries.add(harry8);

    }
}