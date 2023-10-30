package com.mvvm.movieapp.ui.details

import com.mvvm.movieapp.data.moviedetails.MovieDetails
import com.mvvm.movieapp.remote.MovieInterface
import com.mvvm.movieapp.utils.Constants
import com.mvvm.movieapp.utils.Status
import com.mvvm.movieapp.utils.Result


class MovieDetailsRepository(private val movieInterface: MovieInterface) {


    suspend fun getMovieDetails(imdbId: String): Result<MovieDetails> {


        return try {

            val response = movieInterface.getMovieDetails(imdbId, Constants.API_KEY)
            if (response.isSuccessful) {

                Result(Status.SUCCESS, response.body(), null)

            } else {
                Result(Status.ERROR, null, null)
            }


        } catch (e: Exception) {
            Result(Status.ERROR, null, null)
        }


    }


}