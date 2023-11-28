package com.example.superheroapp.data.network

import com.example.superheroapp.data.network.response.SuperheroResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface SuperheroApiService {

    @GET("/api/2138032326587385/search/{name}")
    suspend fun getSuperheroes(@Path("name") name: String): Response<SuperheroResponse>
}