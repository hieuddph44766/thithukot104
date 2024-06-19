package com.example.ph44766_thithukot104.RoomDB
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import com.example.ph44766_thithukot104.model.MovieRequest
import com.example.ph44766_thithukot104.model.StatusResponse
import com.example.ph44766_thithukot104.response.MovieResponse

interface MovieService {
    @GET("film")
    suspend fun getListFilms(): Response<List<MovieResponse>>

    @GET("film/{id}")
    suspend fun getFilmDetail(@Path("id") id: String): Response<MovieResponse>

    @POST("film")
    suspend fun addFilm(@Body filmRequest: MovieRequest): Response<StatusResponse>

    @PUT("film/{id}")
    suspend fun updateFilm(
        @Path("id") id: String,
        @Body filmRequest: MovieRequest
    ): Response<StatusResponse>

    @DELETE("film/{id}")
    suspend fun deleteFilm(@Path("id") id: String): Response<StatusResponse>
}
