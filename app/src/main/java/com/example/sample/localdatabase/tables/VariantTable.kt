package com.example.velvetlifestyleassignment.localdatabase.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.velvetlifestyleassignment.localdatabase.RoomDatabaseConstant

@Entity(tableName = RoomDatabaseConstant.MASTER_PROD_VARIANT_TABLE_NAME)
class VariantTable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = RoomDatabaseConstant.ID)
    var id: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_SECTION_ID)
    var sectionId: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PRODUCT_PROD_ID)
    var productId: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PROD_VARIANT_TITLE)
    var variantTitle: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PROD_VARIANT_PRICE)
    var variantPrice: Float? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_PROD_VARIANT_COMPARED_PRICE)
    var variantComparedPrice: Float? = null


}