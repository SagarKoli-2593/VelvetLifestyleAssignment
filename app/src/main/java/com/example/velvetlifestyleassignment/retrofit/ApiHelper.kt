package com.example.velvetlifestyleassignment.retrofit

import com.example.velvetlifestyleassignment.retrofit.entity.MasterDataResponse
import io.reactivex.Single

interface ApiHelper {

    fun loadMasterData() : Single<List<MasterDataResponse>>
}