package com.dantu.findingsita.repository.database

import android.app.Application

class PlayerRepository(application: Application) {

    private var playerDao : PlayerDao
    private var playerList : List<Player>
        get() {
           return playerDao.getPlayers()
        }

    init {
        val gameDB = GameDatabase.Companion.getInstance(application)
        playerDao = gameDB.playerDao
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



}