package com.example.imovie.api_communication

import com.example.imovie.dao.MovieDao
import com.example.imovie.utils.RetrofitImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
internal object MoviesDatabase {

    @Provides
    @ViewModelScoped
    fun provideMovieDAO(): MovieDao = RetrofitImpl.getClient().create(MovieDao::class.java)

}