package com.example.itworkxnews.data.db

import androidx.room.TypeConverter
import com.example.itworkxnews.data.models.news.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String? {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(null, name)
    }

}