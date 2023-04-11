package com.casecode.domain.usecase

import com.casecode.domain.repository.MealsRepository

class GetMealz(private val mealsRepository: MealsRepository) {
    suspend operator fun invoke() = mealsRepository.getMealsFromRemote()
}