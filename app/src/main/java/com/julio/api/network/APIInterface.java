package com.julio.api.network;

import com.julio.api.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
