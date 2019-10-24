package com.julio.api.network;

import com.julio.api.model.Users;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoint {

    @GET("/api/users")
    Call<Users> getUsers();
}
