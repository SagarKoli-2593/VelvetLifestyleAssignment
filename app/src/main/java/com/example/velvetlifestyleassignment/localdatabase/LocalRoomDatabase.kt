package com.example.velvetlifestyleassignment.localdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.velvetlifestyleassignment.localdatabase.dao.ProductDAO
import com.example.velvetlifestyleassignment.localdatabase.dao.SectionDAO
import com.example.velvetlifestyleassignment.localdatabase.dao.VariantDAO
import com.example.velvetlifestyleassignment.localdatabase.dao.VariantImagesDAO
import com.example.velvetlifestyleassignment.localdatabase.tables.ProductTable
import com.example.velvetlifestyleassignment.localdatabase.tables.SectionTable
import com.example.velvetlifestyleassignment.localdatabase.tables.VariantImagesTable
import com.example.velvetlifestyleassignment.localdatabase.tables.VariantTable

@Database(
    entities = [SectionTable::class, ProductTable::class, VariantTable::class, VariantImagesTable::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class LocalRoomDatabase : RoomDatabase() {

    abstract fun getSectionDao(): SectionDAO
    abstract fun getProductDao(): ProductDAO
    abstract fun getVariantDao(): VariantDAO
    abstract fun getVariantImagesDao(): VariantImagesDAO

}