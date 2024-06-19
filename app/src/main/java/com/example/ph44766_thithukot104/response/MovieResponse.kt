package com.example.ph44766_thithukot104.response


import com.google.gson.annotations.SerializedName
import com.example.ph44766_thithukot104.model.Movie

data class MovieResponse(
    @SerializedName("id") val filmId: String,
    @SerializedName("filmName") val filmName: String,
    @SerializedName("releaseDate") val releaseDate: String,
    @SerializedName("description") val description: String,
    @SerializedName("image") val image: String,
){
    fun toMovie(): Movie {
        return Movie(
            id = this.filmId,
            filmName = this.filmName,
            releaseDate = this.releaseDate,
            description = this.description,
            image = this.image
        )
    }
}

