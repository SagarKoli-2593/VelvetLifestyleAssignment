package com.example.velvetlifestyleassignment.localdatabase.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.velvetlifestyleassignment.localdatabase.RoomDatabaseConstant

@Entity(tableName = RoomDatabaseConstant.MASTER_PROD_VAR_IMAGES_TABLE_NAME)
class VariantImagesTable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = RoomDatabaseConstant.ID)
    var id: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_SECTION_ID)
    var sectionId: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_PROD_ID)
    var productId: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PROD_VAR_IMAGES_HEIGHT)
    var variantImgHeight: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PROD_VAR_IMAGES_WIDTH)
    var variantImgWidth: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PROD_VAR_IMAGES_SRC)
    var variantImgSrc: String? = null
}