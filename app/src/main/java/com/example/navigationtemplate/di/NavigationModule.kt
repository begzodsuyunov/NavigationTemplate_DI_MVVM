package com.example.navigationtemplate.di

import com.example.navigationtemplate.navigation.Handler
import com.example.navigationtemplate.navigation.NavigationDispatcher
import com.example.navigationtemplate.navigation.Navigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn (SingletonComponent::class)
interface NavigationModule {

    @Binds
    fun bindsNavigator(impl: NavigationDispatcher): Navigator

    @Binds
    fun bindsHandler(impl: NavigationDispatcher): Handler

}