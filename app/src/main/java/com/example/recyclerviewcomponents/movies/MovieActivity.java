package com.example.recyclerviewcomponents.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieActivity extends AppCompatActivity {
    public ArrayList<Movies> movies = new ArrayList<>();
    public RecyclerView moviesRv;
    public MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        getSupportActionBar().setTitle("Movies");
        setMoviesRv();
        fetchData();
    }

    public void setMoviesRv() {
        moviesRv = findViewById(R.id.movie_rv);
        moviesRv.setLayoutManager(new GridLayoutManager(this,2));
        moviesAdapter = new MoviesAdapter();
        moviesAdapter.setMovieses(movies);
        moviesRv.setAdapter(moviesAdapter);
    }

    public void fetchData() {
        MovieApi movieApi = new MovieApi();
        MovieService movieService = movieApi.createMovieService();
        Call<List<Movies>>call = movieService.fetchMovies();
        call.enqueue(new Callback<List<Movies>>() {
            @Override
            public void onResponse(Call<List<Movies>> call, Response<List<Movies>> response) {
                List<Movies> movies = response.body();
                moviesAdapter.setMovieses(movies);
            }

            @Override
            public void onFailure(Call<List<Movies>> call, Throwable t) {
                Toast.makeText(MovieActivity.this, "failed to load Data", Toast.LENGTH_SHORT).show();
            }
        });
    }

}