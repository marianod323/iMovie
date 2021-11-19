package com.example.imovie.dao

import com.example.imovie.model.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieDao {

    @GET("/search/movie")
    suspend fun getMovies(
        @Query ("api_key") apiKey: String,
        @Query ("query") query: String) : Call<List<Movie>>

}