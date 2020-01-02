package com.dantu.findingsita.repository.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface GameDao {

    @Insert
    fun createGame(game : Game)

    @Update
    fun saveGame(game: Game)

    @Delete
    fun deleteGame(game: Game)
}