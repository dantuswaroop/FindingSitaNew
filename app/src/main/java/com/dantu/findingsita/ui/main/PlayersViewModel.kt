package com.dantu.findingsita.ui.main

import android.app.Application
import android.view.Display
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.dantu.findingsita.repository.database.Player
import com.dantu.findingsita.repository.database.PlayerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class PlayersViewModel(application: Application) : AndroidViewModel(application) {
    private val playerRepository : PlayerRepository

    init {
        playerRepository = PlayerRepository(application)
    }

    fun getPlayers(): LiveData<List<Player>> = runBlocking {
        playerRepository.getPlayers()
    }

    fun insertPlayer(player: Player) {
        viewModelScope.launch(Dispatchers.IO) {
            playerRepository.insertPlayer(player)
        }
    }

    fun getPlayerById(playerId: Int): Player = runBlocking(Dispatchers.IO) {
        playerRepository.getPlayerById(playerId)
    }

    fun updatePlayer(player: Player) {
        viewModelScope.launch(Dispatchers.IO) {
            playerRepository.updatePlayer(player)
        }
    }

    fun deletePlayer(player: Player) {
        viewModelScope.launch(Dispatchers.IO) {
            playerRepository.deletePlayer(player)
        }
    }

}