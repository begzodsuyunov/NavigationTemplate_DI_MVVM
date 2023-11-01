package com.example.navigationtemplate.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationtemplate.fragments.AddFragmentDirections
import com.example.navigationtemplate.navigation.Navigator
import com.example.navigationtemplate.viewmodel.AddViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddViewModelImpl @Inject constructor(
    private val navigator: Navigator
) : AddViewModel, ViewModel() {
    override fun openAbout() {
        viewModelScope.launch {
            navigator.navigateTo(AddFragmentDirections.actionAddFragmentToAboutFragment())
        }
    }
}