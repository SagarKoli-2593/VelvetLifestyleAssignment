package com.example.velvetlifestyleassignment.localdatabase

import androidx.room.TypeConverter

class Converter {

    @TypeConverter
    fun toListOfInt(strings: String): ArrayList<Int> {
        val list = ArrayList<Int>()
        if(strings.trim().isNotBlank()) {
            val array = strings.split(",")
            for (s in array) {
                list.add(s.toInt())
            }
        }
        return list
    }

    @TypeConverter
    fun intListAsString(list: ArrayList<Int>?): String {
        var result = ""
        list?.forEach { element ->
            result += "$element,"
        }
        return result.removeSuffix(",")
    }


    @TypeConverter
    fun toListOfString(strings: String): ArrayList<String> {
        val list = ArrayList<String>()
        val array = strings.split(",")
        for (s in array) {
            list.add(s)
        }
        return list
    }

    @TypeConverter
    fun stringListAsString(list: ArrayList<String>?): String {
        var result = ""
        list?.forEach { element ->
            result += "$element,"
        }
        return result.removeSuffix(",")
    }
}