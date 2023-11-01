package com.example.navigationtemplate.viewmodel.impl

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationtemplate.fragments.SplashFragmentDirections
import com.example.navigationtemplate.navigation.Navigator
import com.example.navigationtemplate.viewmodel.SplashViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModelImpl @Inject constructor(
    private val navigator: Navigator
) : SplashViewModel, ViewModel(){
    override fun openMain() {
        viewModelScope.launch {
            delay(2000)
            navigator.navigateTo(SplashFragmentDirections.actionSplashFragmentToMainFragment())
            Log.d("Log", "SPlash fragment")
        }
    }
}