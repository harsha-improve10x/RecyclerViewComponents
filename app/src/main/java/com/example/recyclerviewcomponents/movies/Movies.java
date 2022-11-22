package com.example.recyclerviewcomponents.movies;

import com.google.gson.annotations.SerializedName;

public class Movies {
    @SerializedName("_id")
    public String id;
    public String description;
    public String seriesId;
    public String movieId;
    @SerializedName("name")
    public String title;
    public String imageUrl;
}
