package com.example.superheroapp.data.network.response


import com.google.gson.annotations.SerializedName

data class Work(
    @SerializedName("base")
    val base: String,
    @SerializedName("occupation")
    val occupation: String
)