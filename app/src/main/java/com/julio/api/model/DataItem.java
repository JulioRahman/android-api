package com.julio.api.model;

import com.google.gson.annotations.SerializedName;

public class DataItem {

    @SerializedName("email")
    public String email;

    @SerializedName("id")
    public int id;

    @SerializedName("first_name")
    public String firstName;

    @SerializedName("last_name")
    public String lastName;

    @SerializedName("avatar")
    public String avatar;
}
