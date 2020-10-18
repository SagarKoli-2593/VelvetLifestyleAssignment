package com.example.velvetlifestyleassignment.retrofit

import com.example.velvetlifestyleassignment.retrofit.entity.MasterDataResponse
import io.reactivex.Single
import retrofit2.http.GET

interface NetworkApi {

    @GET("test.json")
    fun getMasterData(): Single<List<MasterDataResponse>>
}