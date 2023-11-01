package com.example.navigationtemplate.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationtemplate.fragments.MainFragmentDirections
import com.example.navigationtemplate.navigation.Navigator
import com.example.navigationtemplate.viewmodel.MainViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModelImpl @Inject constructor(
    private val navigator: Navigator
) : MainViewModel, ViewModel(){
    override fun openAdd() {
        viewModelScope.launch {
            navigator.navigateTo(MainFragmentDirections.actionMainFragmentToAddFragment())
        }
    }
}