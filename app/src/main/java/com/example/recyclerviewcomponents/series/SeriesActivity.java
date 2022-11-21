package com.example.recyclerviewcomponents.series;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class SeriesActivity extends AppCompatActivity {
    public ArrayList<Series> series;
    public SeriesAdapter seriesAdapter;
    public RecyclerView seriesRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        getSupportActionBar().setTitle("Series");
        setDataSeries();
        setSeriesRv();
    }

    public void setSeriesRv() {
        seriesRv = findViewById(R.id.series_rv);
        seriesRv.setLayoutManager(new LinearLayoutManager(this));
        seriesAdapter = new SeriesAdapter();
        seriesAdapter.setSeriesesData(series);
        seriesRv.setAdapter(seriesAdapter);
    }

    public void setDataSeries() {
        series = new ArrayList<>();
        Series kungFuPanda = new Series();
        kungFuPanda.imageUrl = "https://occ-0-1556-1007.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABduFRBhx6t-Dhqq_nz4teWtFQs7rpEnkYggmaKnJ1jjtbaGGqVSTZi1OfHu6DkmLzO7d5bXlhKYE1Eu6jrJoaO64l0uKJY2YEHJb.jpg?r=109";
        kungFuPanda.title = "Kung Fu Panda Movie Series";
        series.add(kungFuPanda);

        Series harryPotter = new Series();
        harryPotter.imageUrl = "https://wallpapers.com/images/hd/harry-potter-it-all-ends-18u1rkvpzotfmi49-18u1rkvpzotfmi49.jpg";
        harryPotter.title = "Harry Potter Movie Series";
        series.add(harryPotter);
    }
}