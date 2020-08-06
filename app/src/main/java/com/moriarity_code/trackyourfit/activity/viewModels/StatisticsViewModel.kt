package com.moriarity_code.trackyourfit.activity.viewModels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.moriarity_code.trackyourfit.repository.MainRepository


class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel()