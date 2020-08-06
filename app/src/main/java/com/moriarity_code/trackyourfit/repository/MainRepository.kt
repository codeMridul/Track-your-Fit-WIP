package com.moriarity_code.trackyourfit.repository

import com.moriarity_code.trackyourfit.database.RunDao
import com.moriarity_code.trackyourfit.database.RunEntity
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDao: RunDao
) {
    suspend fun insertRun(runEntity: RunEntity) = runDao.insertRun(runEntity)

    suspend fun deleteRun(runEntity: RunEntity) = runDao.deleteRun(runEntity)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByAverageSpeedInKMPH() = runDao.getAllRunsSortedByAverageSpeedInKMPH()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getAllRunsSortedByDistanceInMeters() = runDao.getAllRunsSortedByDistanceInMeters()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getTotalAvgSpeed() = runDao.getTotalAverageSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()


}