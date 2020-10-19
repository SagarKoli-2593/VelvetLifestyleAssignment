package com.example.velvetlifestyleassignment.retrofit

import com.example.velvetlifestyleassignment.extras.SugarApp
import com.example.velvetlifestyleassignment.retrofit.entity.MasterDataResponse
import com.example.velvetlifestyleassignment.retrofit.entity.Root
import io.reactivex.Single

class RetroFitManager(private var networkApi: NetworkApi = SugarApp.dataComponent.getNetworkApi()) :
    ApiHelper {
    override fun loadMasterData(): Single<List<MasterDataResponse>> {
        return networkApi.getMasterData()
    }
}