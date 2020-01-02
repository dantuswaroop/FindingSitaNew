package com.dantu.findingsita.repository.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "players")
class Player(
    @NonNull
    @ColumnInfo(name = "player_name")
    var playerName: String,
    @NonNull
    @ColumnInfo(name = "password")
    var password: String
) {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    var playerId: Int = 0

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    var image: ByteArray? = null

}