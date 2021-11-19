package com.example.imovie.repository

import com.example.imovie.dao.MovieDao
import com.example.imovie.model.Movie
import com.example.imovie.utils.RetrofitImpl
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
class MovieRepository @Inject constructor(
    private val movieDao: MovieDao
) {
    //val apiKey = "e8f5bef788dafdd1730506b33b74dc53"
    //val v4Read = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJlOGY1YmVmNzg4ZGFmZGQxNzMwNTA2YjMzYjc0ZGM1MyIsInN1YiI6IjYxOTEyMWM2NzI0ZGUxMDAyYmViM2M1ZSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.gaXCQyussxU52rlhiTFts0MsjWkn11NLx3YZjQMOYFI"

    suspend fun getMovies(): List<Movie> {
        return movieDao.getMovies(RetrofitImpl.API_KEY, "Dune").execute().body()?: listOf()
    }

}