package com.example.recyclerviewcomponents.series;

import com.google.gson.annotations.SerializedName;

public class Series {
    @SerializedName("_id")
    public String id;
    @SerializedName("id")
    public String getId;
    public String title;
    public String imageUrl;
}
