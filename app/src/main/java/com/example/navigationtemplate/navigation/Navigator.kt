package com.example.navigationtemplate.navigation

import androidx.navigation.NavDirections

interface Navigator {
    suspend fun navigateTo(direction: NavDirections)
    suspend fun back()
}