package com.example.velvetlifestyleassignment.components

import com.example.velvetlifestyleassignment.localdatabase.LocalDatabaseHelper
import com.example.velvetlifestyleassignment.localdatabase.LocalRoomDatabase
import com.example.velvetlifestyleassignment.retrofit.ApiHelper
import com.example.velvetlifestyleassignment.retrofit.NetworkApi
import com.example.velvetlifestyleassignment.retrofit.RetrofitModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [DataModule::class, GsonModule::class, RetrofitModule::class, ContextModule::class])

interface DataComponent {
    fun getNetworkApi(): NetworkApi

    fun getApiHelper(): ApiHelper

    fun getLocalDatabase(): LocalDatabaseHelper

    fun getRoomDatabase(): LocalRoomDatabase

}