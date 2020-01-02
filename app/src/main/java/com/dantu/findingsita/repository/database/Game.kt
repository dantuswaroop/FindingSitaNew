package com.dantu.findingsita.repository.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game")
class Game(
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "game_id")
    var gameId: Int) {

    @ColumnInfo(name = "game_name")
    var gameName: String = ""

    @ColumnInfo(name = "saved")
    var saved: Boolean = false

}