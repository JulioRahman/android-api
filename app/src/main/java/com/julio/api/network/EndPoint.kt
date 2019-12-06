package com.julio.api.network

import com.julio.api.model.Users
import retrofit2.Call
import retrofit2.http.GET

interface EndPoint {

    @GET("/api/users")
    fun users(): Call<Users>
}