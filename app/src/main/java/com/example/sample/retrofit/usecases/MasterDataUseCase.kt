package com.example.velvetlifestyleassignment.retrofit.usecases

import android.util.Log
import com.example.velvetlifestyleassignment.retrofit.domainDto.MasterDataDTO
import com.example.velvetlifestyleassignment.retrofit.domainDto.ProductDTO
import com.example.velvetlifestyleassignment.retrofit.domainDto.SectionDTO
import com.example.velvetlifestyleassignment.retrofit.entity.MasterDataResponse
import com.google.gson.reflect.TypeToken
import io.reactivex.Single
import java.lang.reflect.Type


class MasterDataUseCase : BaseUseCase() {

    fun getMasterData(): Single<List<MasterDataResponse>> {
        return apiHelper.loadMasterData().map { masterdataRespone ->

            //val masterDataDTO = gson.fromJson(gson.toJson(it), MasterDataDTO::class.java)

            val objectList =
                gson.fromJson(gson.toJson(masterdataRespone), Array<MasterDataDTO>::class.java)
                    .asList()
            /*val collectionType: Type = object :
                TypeToken<ArrayList<MasterDataDTO?>?>() {}.type
            val enums: ArrayList<MasterDataDTO> =
                gson.fromJson(gson.toJson(masterdataRespone), collectionType)*/

            val sectionList = arrayListOf<SectionDTO>()
            val hrCategoryList = arrayListOf<ProductDTO>()

            if (masterdataRespone.isNotEmpty()) {
                Log.e("GAMBHIR", "MasterDataUseCase masterdataRespone.isNotEmpty()")

                Log.e("GAMBHIR", "masterdataRespone.size() :: ${masterdataRespone.size}")
                masterdataRespone.forEach { it1 ->
                    Log.e("GAMBHIR", "it1.size() :: ${it1.root?.size}")
                    it1.root?.forEach { root ->
                        val sectionDto = SectionDTO()
                        sectionDto.sectionId = root.id
                        sectionDto.sectionTitle = root.title
                        root.contentData.forEach { content ->
                            sectionDto.mediaUrl = content.mediaUrl
                            sectionDto.redirectUrl = content.redirectUrl
                        }
                        sectionList.add(sectionDto)
                    }

                }
            }

            Log.e("GAMBHIR", "enums ka size :: ${objectList.size}")
            localDatabaseHelper.saveSectionList(sectionList)

            masterdataRespone
        }
    }
}