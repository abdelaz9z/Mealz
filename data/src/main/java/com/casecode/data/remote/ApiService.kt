package com.casecode.data.remote

import com.casecode.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals(): CategoryResponse
}