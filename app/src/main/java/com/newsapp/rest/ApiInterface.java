package com.newsapp.rest;

import com.newsapp.model.NewsFeed;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rajendraverma on 15-08-2016.
 */
public interface ApiInterface {

    @GET("/{name}")
    Call<NewsFeed> getXml(String name);
}
