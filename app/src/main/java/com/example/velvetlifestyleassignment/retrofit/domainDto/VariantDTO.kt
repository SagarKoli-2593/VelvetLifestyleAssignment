package com.example.velvetlifestyleassignment.retrofit.domainDto

import com.example.velvetlifestyleassignment.localdatabase.tables.VariantTable

class VariantDTO :BaseDTO(){

    var sectionId: Int? = null
    var productId: Int? = null
    var variantTitle: String? = null
    var variantPrice: Float? = null
    var variantComparedPrice: Float? = null
}

fun VariantTable.tableToDTO() : VariantDTO{
    return VariantDTO().also {
        it.sectionId = sectionId
        it.productId = productId
        it.variantTitle = variantTitle
        it.variantPrice = variantPrice
        it.variantComparedPrice = variantComparedPrice
    }
}