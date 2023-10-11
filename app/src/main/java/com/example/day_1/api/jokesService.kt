package com.example.day_1.api

import retrofit2.Call
import retrofit2.http.GET

interface jokesService {
    @GET("jokes/random")
    fun getJokes(): Call<jokesModel>
}