package com.example.navigationtemplate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import com.example.navigationtemplate.R
import com.example.navigationtemplate.viewmodel.AboutViewModel
import com.example.navigationtemplate.viewmodel.impl.AboutViewModelImpl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutFragment : Fragment(R.layout.fragment_about) {
    private val viewModel: AboutViewModel by viewModels<AboutViewModelImpl>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnBack).setOnClickListener {
            viewModel.back()
        }
    }
}