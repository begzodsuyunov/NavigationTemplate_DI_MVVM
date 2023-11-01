package com.example.navigationtemplate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import com.example.navigationtemplate.R
import com.example.navigationtemplate.viewmodel.AddViewModel
import com.example.navigationtemplate.viewmodel.impl.AddViewModelImpl
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AddFragment : Fragment(R.layout.fragment_add) {
    private val viewModel: AddViewModel by viewModels<AddViewModelImpl>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnAdd2).setOnClickListener {
            viewModel.openAbout()
        }
    }



}
