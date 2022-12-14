package com.example.recyclerviewcomponents.movies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieService {
    @GET("movies")
    Call<List<Movies>> fetchMovies();
}
