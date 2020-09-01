package com.moriarity_code.trackyourfit.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.moriarity_code.trackyourfit.R
import com.moriarity_code.trackyourfit.activity.viewModels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {
    private val viewModel: MainViewModel by viewModels()
}