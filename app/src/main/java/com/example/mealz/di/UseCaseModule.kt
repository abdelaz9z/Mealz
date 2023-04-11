package com.example.mealz.di

import com.casecode.domain.repository.MealsRepository
import com.casecode.domain.usecase.GetMealz
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(mealsRepository: MealsRepository): GetMealz {
        return GetMealz(mealsRepository)
    }
}