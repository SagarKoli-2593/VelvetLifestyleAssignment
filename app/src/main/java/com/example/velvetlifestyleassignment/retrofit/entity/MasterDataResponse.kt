package com.example.velvetlifestyleassignment.retrofit.entity

import com.google.gson.annotations.SerializedName

data class MasterDataResponse(
    var root: ArrayList<Root>? = null
)

data class Root(
    @field:SerializedName("id") val id: Int,
    @field:SerializedName("title") val title: String,
    @field:SerializedName("contentData") val contentData: List<ContentData>
)

data class ContentData(

    @field:SerializedName("mediaUrl") val mediaUrl: String,
    @field:SerializedName("product_json") val product_json: List<ProductJson>,
    @field:SerializedName("redirectUrl") val redirectUrl: String
)

/*
    var root: ArrayList<Section>? = null
    var contentData: ArrayList<ContentData>? = null
*/


/*class ContentData {
    var mediaUrl: String? = null
    var productJson: ArrayList<ProductJson>? = null
    var redirectUrl: String? = null


}*/
data class ProductJson(

    @field:SerializedName("id") val productId: Int?,
    @field:SerializedName("title") var productTitle: String?,
    @field:SerializedName("body_html") var productBody: String?,
    @field:SerializedName("vendor") var productVendor: String?,
    @field:SerializedName("product_type") var productType: String?,
    @field:SerializedName("created_at") var createdAt: String?,
    @field:SerializedName("handle") var productHandle: String?,
    @field:SerializedName("updated_at") var updatedAt: String?,
    @field:SerializedName("published_at") var publishedAt: String?,
    @field:SerializedName("template_suffix") var templateSuffix: String?,
    @field:SerializedName("published_scope") var publishedScope: String?,
    @field:SerializedName("tags") var productTags: String?,
    @field:SerializedName("admin_graphql_api_id") var adminGraphApiId: String?,
    @field:SerializedName("variants") var variants: ArrayList<Variants>?,
    @field:SerializedName("images") var images: ArrayList<Images>?,
    @field:SerializedName("image") var image: Image?
)
/* var productId: Int? = null
 var productTitle: String? = null
 var productBody: String? = null
 var productVendor: String? = null
 var productType: String? = null
 var createdAt: String? = null
 var productHandle: String? = null
 var updatedAt: String? = null
 var publishedAt: String? = null
 var templateSuffix: String? = null
 var publishedScope: String? = null
 var productTags: String? = null
 var adminGraphApiId: String? = null
 var variants: ArrayList<Variants>? = null
 var images: ArrayList<Images>? = null
 var image: Image? = null*/


data class Variants(
    @field:SerializedName("title") var variantTitle: String?,
    @field:SerializedName("price") var variantPrice: String?,
    @field:SerializedName("compare_at_price") var variantComparedPrice: String?

) /*{
    var variantTitle: String? = null
    var variantPrice: String? = null
    var variantComparedPrice: String? = null
}*/

data class Images(
    @field:SerializedName("width") var width: String?,
    @field:SerializedName("height") var height: String?,
    @field:SerializedName("src") var source: String?

)/* {
    var width: Int? = null
    var height: Int? = null
    var source: String? = null
}*/

data class Image(
    @field:SerializedName("width") var width: String?,
    @field:SerializedName("height") var height: String?,
    @field:SerializedName("src") var source: String?

)