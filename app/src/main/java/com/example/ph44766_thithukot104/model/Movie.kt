package com.example.ph44766_thithukot104.model

import com.google.gson.annotations.SerializedName
import com.example.ph44766_thithukot104.ui.theme.screen.MovieFormData

data class Movie(
    @SerializedName("id") val id: String,
    @SerializedName("filmName") val filmName: String,
    @SerializedName("releaseDate") val releaseDate: String,
    @SerializedName("description") val description: String,
    @SerializedName("image") val image: String
){
    fun toMovieFormData() = this?.let {
        MovieFormData(
            this.id,
            this.filmName,
            this.releaseDate,
            this.description,
            this.image
        )
    }
}
