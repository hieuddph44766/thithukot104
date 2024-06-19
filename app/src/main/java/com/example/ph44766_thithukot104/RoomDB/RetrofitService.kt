package com.example.ph44766_thithukot104.RoomDB

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


open class RetrofitService {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://667350ed6ca902ae11b3d7c5.mockapi.io/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val movieService: MovieService by lazy {
        retrofit.create(MovieService::class.java)
    }
}