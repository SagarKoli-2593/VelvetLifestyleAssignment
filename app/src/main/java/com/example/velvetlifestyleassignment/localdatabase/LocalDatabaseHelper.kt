package com.example.velvetlifestyleassignment.localdatabase

import com.example.velvetlifestyleassignment.retrofit.domainDto.MasterDataDTO
import com.example.velvetlifestyleassignment.retrofit.domainDto.SectionDTO

interface LocalDatabaseHelper {
    fun saveAllMasterData(masterDataDTO: List<MasterDataDTO>)

    fun saveSectionList(sectionDto:ArrayList<SectionDTO>)
}