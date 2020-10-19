package com.example.velvetlifestyleassignment.retrofit.usecases

import com.example.velvetlifestyleassignment.extras.SugarApp.Companion.component
import com.example.velvetlifestyleassignment.extras.SugarApp.Companion.dataComponent
import com.example.velvetlifestyleassignment.localdatabase.LocalDatabaseHelper
import com.example.velvetlifestyleassignment.retrofit.ApiHelper
import com.google.gson.Gson

open class BaseUseCase {

    var gson: Gson = component.getGson()
    var apiHelper: ApiHelper = dataComponent.getApiHelper()
    var localDatabaseHelper: LocalDatabaseHelper = dataComponent.getLocalDatabase()
    /*var sharedPrefHelper = dataComponent.getSharedPrefHelper()*/
    // var googleFitHelper = fitComponent.getGoogleFitHelper()

}