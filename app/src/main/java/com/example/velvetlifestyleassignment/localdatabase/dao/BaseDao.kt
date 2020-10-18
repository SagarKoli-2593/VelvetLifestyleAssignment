package com.example.velvetlifestyleassignment.localdatabase.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy

interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insetAll(list: List<T>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: T)
}