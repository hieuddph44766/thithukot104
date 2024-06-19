package com.example.ph44766_thithukot104.model

import com.example.ph44766_thithukot104.response.MovieResponse
import com.example.ph44766_thithukot104.ui.theme.screen.MovieFormData

class Transfrom {
    fun MovieResponse.toMovie(): Movie {
        return Movie(
            id = this.filmId,
            filmName = this.filmName,
            releaseDate = this.releaseDate,
            description = this.description,
            image = this.image
        )
    }

    fun MovieFormData.toMovieRequest(): MovieRequest {
//        val filmIdInt = try {
//            this.id?.toIntOrNull()
//        } catch (e: NumberFormatException) {
//            null
//        }
        return MovieRequest(
            filmId = this.id,
            filmName = this.filmName,
            releaseDate = this.releaseDate,
            description = this.description,
            image = this.imageUrl
        )
    }

    fun Movie?.toMovieFormData() = this?.let {
        MovieFormData(
            this.id,
            this.filmName,
            this.releaseDate,
            this.description,
            this.image
        )
    }
}