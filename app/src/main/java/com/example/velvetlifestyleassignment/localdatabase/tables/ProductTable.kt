package com.example.velvetlifestyleassignment.localdatabase.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.velvetlifestyleassignment.localdatabase.RoomDatabaseConstant

@Entity(tableName = RoomDatabaseConstant.MASTER_PRODUCT_TABLE_NAME)
class ProductTable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = RoomDatabaseConstant.ID)
    var id: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_PROD_ID)
    var productID: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_SECTION_ID)
    var sectionId: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_TITLE)
    var prodTitle: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_BODY_HTML)
    var prodBodyHTML: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_VENDOR)
    var prodVendor: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_TYPE)
    var prodType: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_CREATED_AT)
    var prodCreatedAt: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_HANDLE)
    var prodHandle: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_UPDATED_AT)
    var prodUpdatedAt: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_PUBLISHED_AT)
    var prodPublishedAt: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_TEMPLATE_SUFFIX)
    var prodTemplateSuffix: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_PUBLISHED_SCOPE)
    var prodPublishedScope: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_TAGS)
    var prodTags: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_ADMIN_GRAPH)
    var prodAdminGraph: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_IMAGE_SOURCE)
    var prodImgSource: String? = null


}