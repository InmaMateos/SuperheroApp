package com.example.superheroapp.data.network.response

import com.google.gson.annotations.SerializedName

data class SuperheroResponse(
    @SerializedName("response") val response: String,
    @SerializedName ("results") val results: List<Superhero>,
    @SerializedName("results-for") val results_for: String
)