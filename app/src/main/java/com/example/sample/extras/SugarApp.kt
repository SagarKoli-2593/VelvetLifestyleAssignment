package com.example.velvetlifestyleassignment.extras

import android.app.Application
import com.example.velvetlifestyleassignment.components.*
import com.facebook.stetho.Stetho

class SugarApp : Application() {
    companion object {
        private lateinit var sInstance: SugarApp
        lateinit var dataComponent: DataComponent
        val component: ApplicationComponent = DaggerApplicationComponent.builder().build()

        fun getInstance(): SugarApp {
            return sInstance
        }

    }

    override fun onCreate() {
        super.onCreate()
        sInstance = this
        dataComponent = DaggerDataComponent.builder().contextModule(ContextModule(this)).build()
        Stetho.initializeWithDefaults(this)
    }
}