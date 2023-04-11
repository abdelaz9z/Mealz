package com.example.mealz.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.mealz.R
import com.example.mealz.adapter.MealsAdapter
import com.example.mealz.viewmodel.MealsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MealsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.category_rv)
        val mealsAdapter = MealsAdapter()

        viewModel.getMeals()

        lifecycleScope.launch {
            viewModel.categories.collect {
                mealsAdapter.submitList(it?.categories)
                recyclerView.adapter = mealsAdapter
            }
        }
    }
}