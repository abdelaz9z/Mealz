package com.casecode.data.repository

import com.casecode.data.remote.ApiService
import com.casecode.domain.entity.CategoryResponse
import com.casecode.domain.repository.MealsRepository

class MealsRepositoryImpl(private val apiService: ApiService) : MealsRepository {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}