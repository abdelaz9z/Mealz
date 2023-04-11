package com.example.mealz.di

import com.casecode.data.remote.ApiService
import com.casecode.data.repository.MealsRepositoryImpl
import com.casecode.domain.repository.MealsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepository {
        return MealsRepositoryImpl(apiService)
    }
}