package com.example.velvetlifestyleassignment.retrofit.domainDto

import com.example.velvetlifestyleassignment.localdatabase.tables.ProductTable

class ProductDTO : BaseDTO() {

    var productID: Int? = null
    var sectionId: Int? = null
    var prodTitle: String? = null
    var prodBodyHTML: String? = null
    var prodVendor: String? = null
    var prodType: String? = null
    var prodCreatedAt: String? = null
    var prodHandle: String? = null
    var prodUpdatedAt: String? = null
    var prodPublishedAt: String? = null
    var prodTemplateSuffix: String? = null
    var prodPublishedScope: String? = null
    var prodTags: String? = null
    var prodAdminGraph: String? = null
    var prodImgSource: String? = null
}

fun ProductTable.tableToDTO():ProductDTO{
    return ProductDTO().also {
        it.productID = productID
        it.sectionId = sectionId
        it.prodTitle = prodTitle
        it.prodBodyHTML = prodBodyHTML
        it.prodVendor = prodVendor
        it.prodType = prodType
        it.prodCreatedAt = prodCreatedAt
        it.prodHandle = prodHandle
        it.prodUpdatedAt= prodUpdatedAt
        it.prodPublishedAt = prodPublishedAt
        it.prodTemplateSuffix = prodTemplateSuffix
        it.prodPublishedScope = prodPublishedScope
        it.prodTags = prodTags
        it.prodAdminGraph = prodAdminGraph
        it.prodImgSource = prodImgSource
    }
}