package com.moriarity_code.trackyourfit.activity.viewModels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moriarity_code.trackyourfit.database.RunEntity
import com.moriarity_code.trackyourfit.repository.MainRepository
import kotlinx.coroutines.launch


class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
    fun insertRun(runEntity: RunEntity) = viewModelScope.launch {
        mainRepository.insertRun(runEntity)
    }
}