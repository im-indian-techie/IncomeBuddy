package com.abana.incomebuddy.repository

import androidx.room.Insert
import com.abana.incomebuddy.model.room.dao.ProfileDao
import com.abana.incomebuddy.model.room.entities.Profile
import javax.inject.Inject

class ProfileRepository @Inject constructor(val profileDao: ProfileDao) {
    fun getProfile()=profileDao.getProfileData()
    suspend fun insertProfileData(profile: Profile)=profileDao.insertProfileData(profile)
}