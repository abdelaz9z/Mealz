package com.casecode.domain.repository

import com.casecode.domain.entity.CategoryResponse

interface MealsRepository {
    suspend fun getMealsFromRemote(): CategoryResponse
}