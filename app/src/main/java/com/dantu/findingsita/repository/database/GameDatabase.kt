package com.dantu.findingsita.repository.database

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = arrayOf(Game::class, Play::class, Player::class),
    version = 1,
    exportSchema = false
)
abstract class GameDatabase : RoomDatabase() {
    abstract val gameDao : GameDao
    abstract val playDao : PlayDao
    abstract val playerDao : PlayerDao

    object Companion {
        private lateinit var INSTANCE : GameDatabase
        fun getInstance(context: Application) : GameDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext,
                    GameDatabase::class.java, "game_database")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE
        }
    }
}