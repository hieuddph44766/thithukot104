package com.example.ph44766_thithukot104.model

import com.google.gson.annotations.SerializedName

data class MovieRequest(
    @SerializedName("id") var filmId: String? = null,
    val filmName: String,
    val releaseDate: String,
    val description: String,
    val image: String
)

data class StatusResponse(
    val status: Int,
    val message: String
)