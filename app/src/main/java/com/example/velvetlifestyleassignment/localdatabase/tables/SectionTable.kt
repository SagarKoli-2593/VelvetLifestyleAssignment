package com.example.velvetlifestyleassignment.localdatabase.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.velvetlifestyleassignment.localdatabase.RoomDatabaseConstant

@Entity(tableName = RoomDatabaseConstant.MASTER_SECTION_TABLE_NAME)
class SectionTable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = RoomDatabaseConstant.ID)
    var id: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_SECTION_ID)
    var sectionId: Int? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_SECTION_TITLE)
    var sectionTitle: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_SECTION_MEDIA_URL)
    var mediaUrl: String? = null

    @ColumnInfo(name = RoomDatabaseConstant.MASTER_SECTION_REDIRECT_URL)
    var redirectUrl: String? = null
}