package com.dantu.findingsita.repository.database

import android.app.Application

class PlayRepository(application: Application) {

    private var playDao : PlayDao

    init {
        val gameDB = GameDatabase.Companion.getInstance(application)
        playDao = gameDB.playDao
    }

    fun getPlaysForGameId(gameId : Int) : List<Play>{
        return playDao.getPlaysForGame(gameId)
    }

    fun updatePlay(play: Play) {
        return playDao.updatePlay(play)
    }

    fun createPlay(play: Play) {
        return playDao.insertPlay(play)
    }

    fun createPlay(plays : List<Play>) {
        return playDao.insertPlay(plays)
    }
}