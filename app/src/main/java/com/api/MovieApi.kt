package com.api

import com.model.Movies
import com.utils.Constants.SHOWS_END_POINT
import retrofit2.Response
import retrofit2.http.GET

interface MovieApi {
    @GET(SHOWS_END_POINT)
    suspend fun getMovies() : Response<List<Movies>>
}