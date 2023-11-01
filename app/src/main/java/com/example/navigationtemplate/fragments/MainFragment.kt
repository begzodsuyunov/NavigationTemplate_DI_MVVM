package com.example.navigationtemplate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.navigationtemplate.R
import com.example.navigationtemplate.viewmodel.MainViewModel
import com.example.navigationtemplate.viewmodel.impl.MainViewModelImpl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    private val viewModel: MainViewModel by viewModels<MainViewModelImpl>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findNavController()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnAdd).setOnClickListener{
            viewModel.openAdd()
        }
    }
}