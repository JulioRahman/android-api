package com.julio.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Users {

    @SerializedName("data")
    public List<DataItem> data;
}

