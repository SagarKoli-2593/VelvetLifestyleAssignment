package com.example.velvetlifestyleassignment.retrofit.domainDto

import com.example.velvetlifestyleassignment.localdatabase.tables.SectionTable

class SectionDTO : BaseDTO() {

    var sectionId: Int? = null

    var sectionTitle: String? = null

    var mediaUrl: String? = null

    var redirectUrl: String? = null
}

fun SectionTable.tableToDTO() : SectionDTO{
    return SectionDTO().also {
        it.sectionId = sectionId
        it.sectionTitle = sectionTitle
        it.mediaUrl = mediaUrl
        it.redirectUrl = redirectUrl
    }
}