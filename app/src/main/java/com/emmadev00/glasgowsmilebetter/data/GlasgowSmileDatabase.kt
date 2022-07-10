package com.emmadev00.glasgowsmilebetter.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.glasgowsmilebetter.model.GlasgowSmile

@Database(entities = [GlasgowSmile::class], version = 1, exportSchema = false)
abstract class GlasgowSmileDatabase: RoomDatabase() {
    abstract fun glasgowSDao(): GlasgowSmileDao
}