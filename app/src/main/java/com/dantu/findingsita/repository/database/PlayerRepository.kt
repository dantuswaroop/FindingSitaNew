package com.dantu.findingsita.repository.database

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PlayerRepository(application: Context) {

    private var playerDao : PlayerDao
    private var playerList : LiveData<List<Player>>
        get() {
           return playerDao.getPlayers()
        }

    init {
        val gameDB = GameDatabase.Companion.getInstance(application)
        playerDao = gameDB!!.playerDao
        playerList = playerDao.getPlayers()
    }

    fun insertPlayer(player: Player) {
        playerDao.insert(player)
    }

    fun deletePlayer(player: Player) {
        playerDao.delete(player)
    }

    fun updatePlayer(player: Player) {
        playerDao.update(player)
    }

    fun getPlayers(): LiveData<List<Player>> {
       return playerDao.getPlayers()
    }

    fun getPlayerById(playerId: Int) : Player {
        return playerDao.getPlayerById(playerId)
    }

}