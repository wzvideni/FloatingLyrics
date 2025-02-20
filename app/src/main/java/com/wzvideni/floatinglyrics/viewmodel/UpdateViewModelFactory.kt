package com.wzvideni.floatinglyrics.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


@Suppress("UNCHECKED_CAST")
class UpdateViewModelFactory(private val versionCode: Long, private val application: Application) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UpdateViewModel::class.java)) {
            return UpdateViewModel(versionCode, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
