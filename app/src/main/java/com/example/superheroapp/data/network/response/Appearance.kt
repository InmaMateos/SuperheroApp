package com.example.superheroapp.data.network.response

import com.google.gson.annotations.SerializedName

data class Appearance(
    @SerializedName("eye-color") val eyeColor: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("hair-color") val hairolor: String,
    @SerializedName("height")   val height: List<String>,
    @SerializedName("race") val race: String,
    @SerializedName("weight") val weight: List<String>
)