package com.dantu.findingsita.repository.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PlayRepositoryTest {

    private lateinit var playDao: PlayDao
    private lateinit var db: GameDatabase

    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, GameDatabase::class.java).build()
        playDao = db.playDao
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun getPlaysForGameId() {
        val plays = arrayListOf(
            Play(1, 1),
            Play(1, 2),
            Play(1, 3),
            Play(2, 1),
            Play(2, 2),
            Play(2, 3),
            Play(3, 1)
        )
        playDao.insertPlay(plays)

        assertEquals(1, playDao.getPlaysForGame(3).size)
        assertEquals(3, playDao.getPlaysForGame(2).size)
        assertEquals(3, playDao.getPlaysForGame(1).size)
    }

    @Test
    fun updatePlay() {
    }

    @Test
    fun createPlay() {
    }

    @Test
    fun testCreatePlay() {
    }
}