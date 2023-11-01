package com.example.navigationtemplate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.navigationtemplate.R
import com.example.navigationtemplate.viewmodel.SplashViewModel
import com.example.navigationtemplate.viewmodel.impl.SplashViewModelImpl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : Fragment(R.layout.fragment_splash) {
    private val viewModel:SplashViewModel by viewModels<SplashViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.openMain()
    }
}