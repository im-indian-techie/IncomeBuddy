package com.abana.incomebuddy.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abana.incomebuddy.model.room.entities.Profile
import com.abana.incomebuddy.repository.ProfileRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(val repository: ProfileRepository) : ViewModel() {

    val profileLiveData:LiveData<List<Profile>> = repository.getProfile()

    fun insertProfile(profile: Profile)=viewModelScope.launch {
        repository.insertProfileData(profile)
    }
}