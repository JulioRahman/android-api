package com.julio.api.model

import com.google.gson.annotations.SerializedName

data class Users(

        @SerializedName("data")
        var data: List<DataItem>? = null
)