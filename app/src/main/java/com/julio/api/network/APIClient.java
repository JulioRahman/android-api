package com.julio.api.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    public static Retrofit getClient() {
        String BASE_URL = "https://reqres.in";
        GsonConverterFactory factory = GsonConverterFactory.create();
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(BASE_URL);
        builder.addConverterFactory(factory);
        Retrofit retrofit = builder.build();
        return retrofit;
    }
}
