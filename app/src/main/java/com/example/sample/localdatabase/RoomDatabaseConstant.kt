package com.example.velvetlifestyleassignment.localdatabase

class RoomDatabaseConstant {

    companion object {

        const val DB_NAME = "RoomLocalDB"

        //SectionTable
        const val MASTER_SECTION_TABLE_NAME = "SectionTable"
        const val MASTER_SECTION_ID = "SectionId"
        const val ID = "Id"
        const val MASTER_SECTION_TITLE = "SectionTitle"
        const val MASTER_SECTION_MEDIA_URL = "MediaUrl"
        const val MASTER_SECTION_REDIRECT_URL = "RedirectUrl"

        //ProductTable
        const val MASTER_PRODUCT_TABLE_NAME = "ProductTable"
        const val MASTER_PRODUCT_PROD_ID = "ProductId"
        const val MASTER_PRODUCT_TITLE = "ProductTitle"
        const val MASTER_PRODUCT_BODY_HTML = "BodyHtml"
        const val MASTER_PRODUCT_VENDOR = "Vendor"
        const val MASTER_PRODUCT_TYPE = "ProductType"
        const val MASTER_PRODUCT_CREATED_AT = "CreatedAt"
        const val MASTER_PRODUCT_HANDLE = "ProductHandle"
        const val MASTER_PRODUCT_UPDATED_AT = "UpdatedAt"
        const val MASTER_PRODUCT_PUBLISHED_AT = "PublishedAt"
        const val MASTER_PRODUCT_TEMPLATE_SUFFIX = "TemplateSuffix"
        const val MASTER_PRODUCT_PUBLISHED_SCOPE = "PublishedScope"
        const val MASTER_PRODUCT_TAGS = "ProductTags"
        const val MASTER_PRODUCT_ADMIN_GRAPH = "AdminGraph"
        const val MASTER_PRODUCT_IMAGE_SOURCE = "ProductSrc"

        //VariantsTable
        const val MASTER_PROD_VARIANT_TABLE_NAME = "VariantTable"
        const val MASTER_PROD_VARIANT_TITLE = "VariantTitle"
        const val MASTER_PROD_VARIANT_PRICE = "VariantPrice"
        const val MASTER_PROD_VARIANT_COMPARED_PRICE = "VariantComparedPrice"

        //VariantImagesTable
        const val MASTER_PROD_VAR_IMAGES_TABLE_NAME = "VariantImagesTable"
        const val MASTER_PROD_VAR_IMAGES_HEIGHT = "VariantImageHeight"
        const val MASTER_PROD_VAR_IMAGES_WIDTH = "VariantImageWidth"
        const val MASTER_PROD_VAR_IMAGES_SRC = "VariantImageSrc"
    }
}