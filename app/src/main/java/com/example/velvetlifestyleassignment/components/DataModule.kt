package com.example.velvetlifestyleassignment.components

import android.content.Context
import androidx.room.Room
import com.example.velvetlifestyleassignment.localdatabase.LocalDatabaseHelper
import com.example.velvetlifestyleassignment.localdatabase.LocalRoomDatabase
import com.example.velvetlifestyleassignment.localdatabase.RoomDatabaseConstant.Companion.DB_NAME
import com.example.velvetlifestyleassignment.localdatabase.RoomDatabaseManager
import com.example.velvetlifestyleassignment.retrofit.ApiHelper
import com.example.velvetlifestyleassignment.retrofit.RetroFitManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    fun provideApiHelper(): ApiHelper {
        return RetroFitManager()
    }

    @Singleton
    @Provides
    fun provideLocalDatabaseHelper(): LocalDatabaseHelper {
        return RoomDatabaseManager()
    }

    @Singleton
    @Provides
    fun provideLocalRoomDatabase(context: Context): LocalRoomDatabase {
        return Room.databaseBuilder(context, LocalRoomDatabase::class.java, DB_NAME)
            /*.addMigrations(
                MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4, MIGRATION_4_5, MIGRATION_5_6,
                MIGRATION_6_7, MIGRATION_7_8, MIGRATION_8_9, MIGRATION_9_10, MIGRATION_10_11,
                MIGRATION_11_12, MIGRATION_12_13, MIGRATION_13_14, MIGRATION_14_15, MIGRATION_15_16,
                MIGRATION_16_17, MIGRATION_17_18, MIGRATION_18_19, MIGRATION_19_20 , MIGRATION_20_21,
                MIGRATION_21_22
            )*/
            //   .fallbackToDestructiveMigration() //comment this line if data persistence required
            .build()
    }

}