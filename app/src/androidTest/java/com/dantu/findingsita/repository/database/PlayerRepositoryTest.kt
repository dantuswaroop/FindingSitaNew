package com.dantu.findingsita.repository.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PlayerRepositoryTest {

    private lateinit var playerDao: PlayerDao
    private lateinit var db: GameDatabase

    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, GameDatabase::class.java).build()
        playerDao = db.playerDao
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun insertPlayer() {
        assertEquals(0, playerDao.getPlayers().size)
        playerDao.insert(Player(playerName = "swaroop", password = "1234"))
        assertEquals(1, playerDao.getPlayers().size)
        assertEquals("swaroop", playerDao.getPlayers().get(0).playerName)

        playerDao.insert(Player(playerName = "swaroop", password = "1234"))
        assertEquals(2, playerDao.getPlayers().size)
        assertEquals("swaroop", playerDao.getPlayers().get(1).playerName)
    }

    @Test
    fun deletePlayer() {
        playerDao.insert(Player(playerName = "swaroop", password = "1234"))
        playerDao.insert(Player(playerName = "swaroop1", password = "1234"))
        playerDao.insert(Player(playerName = "swaroop2", password = "1234"))
        playerDao.insert(Player(playerName = "swaroop3", password = "1234"))

        assertEquals(4, playerDao.getPlayers().size)

        playerDao.delete(playerDao.getPlayers().get(2))

        assertEquals(3, playerDao.getPlayers().size)
    }

    @Test
    fun updatePlayer() {
        playerDao.insert(Player(playerName = "swaroop", password = "1234"))
        playerDao.insert(Player(playerName = "swaroop1", password = "1234"))
        playerDao.insert(Player(playerName = "swaroop2", password = "1234"))
        playerDao.insert(Player(playerName = "swaroop3", password = "1234"))

        assertEquals("swaroop", playerDao.getPlayers().get(0).playerName)
        val player = Player("changedname", "1234")
        player.playerId = 1;
        playerDao.update(player)
        assertEquals("changedname", playerDao.getPlayers().get(0).playerName)
    }
}