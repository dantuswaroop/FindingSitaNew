package com.dantu.findingsita.repository.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PlayerDao {

    @Insert
    fun insert(player : Player)

    @Query("SELECT * FROM players")
    fun getPlayers() : LiveData<List<Player>>

    @Update
    fun update(player: Player)

    @Delete
    fun delete(player: Player)

    @Query("DELETE FROM players")
    fun deleteAllPlayers()

    @Query("SELECT * FROM players WHERE playerId=:playerId")
    fun getPlayerById(playerId: Int): Player
}