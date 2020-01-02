package com.dantu.findingsita.repository.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PlayDao {

    @Insert
    fun insertPlay(play: Play)

    @Insert
    fun insertPlay(plays: List<Play>)

    @Update
    fun updatePlay(play: Play)

    @Query("SELECT * from play where game_id=:gameId")
    fun getPlaysForGame(gameId : Int) : List<Play>
}