package com.wzvideni.floatinglyrics.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


@Suppress("UNCHECKED_CAST")
class SharedPreferencesViewModelFactory(private val application: Application) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SharedPreferencesViewModel::class.java)) {
            return SharedPreferencesViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
