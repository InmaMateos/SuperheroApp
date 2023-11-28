package com.example.superheroapp.data.network.response


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("url")
    val url: String
)