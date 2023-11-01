package com.example.navigationtemplate.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationtemplate.navigation.Navigator
import com.example.navigationtemplate.viewmodel.AboutViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AboutViewModelImpl @Inject constructor(
    private val navigator: Navigator
) : AboutViewModel, ViewModel(){
    override fun back() {
        viewModelScope.launch {
            navigator.back()
        }
    }
}