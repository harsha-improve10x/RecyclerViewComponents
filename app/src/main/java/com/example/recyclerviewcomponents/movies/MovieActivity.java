package com.example.recyclerviewcomponents.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity {
    public ArrayList<Movies> movies;
    public RecyclerView moviesRv;
    public MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        getSupportActionBar().setTitle("Movies");
        setMoviesData();
        setMoviesRv();
    }

    public void setMoviesRv() {
        moviesRv = findViewById(R.id.movie_rv);
        moviesRv.setLayoutManager(new GridLayoutManager(this,2));
        moviesAdapter = new MoviesAdapter();
        moviesAdapter.setMovieses(movies);
        moviesRv.setAdapter(moviesAdapter);
    }

    public void setMoviesData() {
        movies = new ArrayList<>();
        Movies harry1 = new Movies();
        harry1.imageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/01_HP_Film1_1.jpg";
        harry1.title = "Harry Potter and the Philosopher's Stone";
        movies.add(harry1);

        Movies harry2 = new Movies();
        harry2.imageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/02_HP_Film2_2.jpg";
        harry2.title = "Harry Potter and the Chamber of Secrets";
        movies.add(harry2);

        Movies harry3 = new Movies();
        harry3.imageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/03_HP_Film3_3.jpg?downsize=1920:*&output-quality=92";
        harry3.title = "Harry Potter and the Prisoner of Azkaban";
        movies.add(harry3);

        Movies harry4 = new Movies();
        harry4.imageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/04_HP_Film4_4.jpg";
        harry4.title = "Harry Potter and the Goblet of fire";
        movies.add(harry4);

        Movies harry5 = new Movies();
        harry5.imageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/05_HP_Film5_5.jpg";
        harry5.title = "Harry Potter and the Order of the Phoenix";
        movies.add(harry5);

        Movies harry6 = new Movies();
        harry6.imageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/06_HP_Film6_6.jpg?downsize=1920:*&output-quality=92";
        harry6.title = "Harry Potter and the Half-Blood Prince";
        movies.add(harry6);

        Movies harry7 = new Movies();
        harry7.imageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/07_HP_Film7_7.jpg";
        harry7.title = "Harry Potter and the Deathly Hallows - Part 1";
        movies.add(harry7);

        Movies harry8 = new Movies();
        harry8.imageUrl = "https://web.static.nowtv.com/images/NOWTV_2021/UK/harrypotter/landingpagemovies/moviesgrid/newnames/08_HP_Film8_8_.jpg";
        harry8.title = "Harry Potter and the Deathly Hallows - Part 2";
        movies.add(harry8);
    }
}