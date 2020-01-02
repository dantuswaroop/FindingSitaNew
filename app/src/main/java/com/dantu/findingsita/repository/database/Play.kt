package com.dantu.findingsita.repository.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "play", primaryKeys = arrayOf("game_id", "player_id"))
class Play(
    @NonNull
    @ColumnInfo(name = "game_id")
    var gameId: Int,
    @NonNull
    @ColumnInfo(name = "player_id")
    var playerId: Int
) {
    @NonNull
    @ColumnInfo(name = "play_id")
    var playId: Long = System.currentTimeMillis()

    @ColumnInfo(name = "score")
    var score: Int = 0

}