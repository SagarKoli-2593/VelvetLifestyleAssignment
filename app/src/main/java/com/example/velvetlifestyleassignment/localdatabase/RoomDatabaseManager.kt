package com.example.velvetlifestyleassignment.localdatabase

import android.util.Log
import com.example.velvetlifestyleassignment.extras.SugarApp
import com.example.velvetlifestyleassignment.localdatabase.tables.ProductTable
import com.example.velvetlifestyleassignment.localdatabase.tables.SectionTable
import com.example.velvetlifestyleassignment.localdatabase.tables.VariantImagesTable
import com.example.velvetlifestyleassignment.localdatabase.tables.VariantTable
import com.example.velvetlifestyleassignment.retrofit.domainDto.MasterDataDTO
import com.example.velvetlifestyleassignment.retrofit.domainDto.SectionDTO
import javax.inject.Singleton

@Singleton
class RoomDatabaseManager : LocalDatabaseHelper {

    private var localRoomDatabase: LocalRoomDatabase = SugarApp.dataComponent.getRoomDatabase()

    override fun saveAllMasterData(masterDataDTO: List<MasterDataDTO>) {
        saveMasterData(masterDataDTO)
    }

    override fun saveSectionList(sectionDto: ArrayList<SectionDTO>) {
        val sectionList: ArrayList<SectionTable> = ArrayList()

        sectionDto.forEach { sectionData ->
            val sectionTable = SectionTable()
            sectionTable.sectionId = sectionData.sectionId
            sectionTable.sectionTitle = sectionData.sectionTitle
            sectionTable.mediaUrl = sectionData.mediaUrl
            sectionTable.redirectUrl = sectionData.redirectUrl
            sectionList.add(sectionTable)

            localRoomDatabase.getSectionDao().insetAll(sectionList)
        }
    }

    private fun saveMasterData(masterDataDTO: List<MasterDataDTO>) {

        //val sectionTable = SectionTable()
        val productTable = ProductTable()
        val VariantTable = VariantTable()
        val VariantImagesTable = VariantImagesTable()

        val sectionList: ArrayList<SectionTable> = ArrayList()

        Log.w("Gambhir", "RoomDBManager :: masterDataDTO.size :: ${masterDataDTO.size}")
        masterDataDTO.forEach {
            Log.w("Gambhir", "RoomDBManager :: it.sectionList.size :: ${it.sectionList.size}")
            it.sectionList.forEach { sectionData ->
                val sectionTable = SectionTable()
                sectionTable.sectionId = sectionData.sectionId
                sectionTable.sectionTitle = sectionData.sectionTitle
                sectionTable.mediaUrl = sectionData.mediaUrl
                sectionTable.redirectUrl = sectionData.redirectUrl
                sectionList.add(sectionTable)
            }
        }

        localRoomDatabase.getSectionDao().insetAll(sectionList)
    }


}