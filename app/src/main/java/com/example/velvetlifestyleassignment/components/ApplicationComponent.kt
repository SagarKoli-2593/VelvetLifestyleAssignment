package com.example.velvetlifestyleassignment.components

import com.google.gson.Gson
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, GsonModule::class])
interface ApplicationComponent {

    fun getGson(): Gson

}