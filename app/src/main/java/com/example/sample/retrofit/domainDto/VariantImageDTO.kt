package com.example.velvetlifestyleassignment.retrofit.domainDto

import com.example.velvetlifestyleassignment.localdatabase.tables.VariantImagesTable

class VariantImageDTO : BaseDTO() {

    var sectionId: Int? = null
    var productId: Int? = null
    var variantImgHeight: Int? = null
    var variantImgWidth: Int? = null
    var variantImgSrc: String? = null
}

fun VariantImagesTable.tableToDTO(): VariantImageDTO {
    return VariantImageDTO().also {
        it.productId = productId
        it.sectionId = sectionId
        it.variantImgHeight = variantImgHeight
        it.variantImgWidth = variantImgWidth
        it.variantImgSrc = variantImgSrc
    }
}