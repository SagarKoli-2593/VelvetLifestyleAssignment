package com.example.velvetlifestyleassignment.retrofit

import com.example.velvetlifestyleassignment.retrofit.entity.MasterDataResponse
import com.example.velvetlifestyleassignment.retrofit.entity.Root
import io.reactivex.Single

interface ApiHelper {

    fun loadMasterData() : Single<List<MasterDataResponse>>
}