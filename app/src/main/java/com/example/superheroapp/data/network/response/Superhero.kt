package com.example.superheroapp.data.network.response


import com.google.gson.annotations.SerializedName

data class Superhero(
    @SerializedName("appearance")
    val appearance: Appearance,
    @SerializedName("biography")
    val biography: Biography,
    @SerializedName("connections")
    val connections: Connections,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: Image,
    @SerializedName("name")
    val name: String,
    @SerializedName("powerstats")
    val powerstats: Powerstats,
    @SerializedName("work")
    val work: Work
)