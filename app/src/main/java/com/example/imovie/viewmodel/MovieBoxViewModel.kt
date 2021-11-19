package com.example.imovie.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.example.imovie.model.Movie
import com.example.imovie.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieBoxViewModel @Inject constructor(
    private val movieRepository: MovieRepository
): ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    fun getMovies() = viewModelScope.launch {
        _movies.postValue(movieRepository.getMovies())
        Log.d("xxxx", "aaaa")
    }

}