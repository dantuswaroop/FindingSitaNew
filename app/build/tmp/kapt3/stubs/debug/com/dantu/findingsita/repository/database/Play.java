package com.dantu.findingsita.repository.database;

import java.lang.System;

@androidx.room.Entity(tableName = "play", primaryKeys = {"game_id", "player_id"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/dantu/findingsita/repository/database/Play;", "", "gameId", "", "playerId", "(II)V", "getGameId", "()I", "setGameId", "(I)V", "playId", "", "getPlayId", "()J", "setPlayId", "(J)V", "getPlayerId", "setPlayerId", "score", "getScore", "setScore", "app_debug"})
public final class Play {
    @androidx.room.ColumnInfo(name = "play_id")
    @androidx.annotation.NonNull()
    private long playId;
    @androidx.room.ColumnInfo(name = "score")
    private int score;
    @androidx.room.ColumnInfo(name = "game_id")
    private int gameId;
    @androidx.room.ColumnInfo(name = "player_id")
    private int playerId;
    
    public final long getPlayId() {
        return 0L;
    }
    
    public final void setPlayId(long p0) {
    }
    
    public final int getScore() {
        return 0;
    }
    
    public final void setScore(int p0) {
    }
    
    public final int getGameId() {
        return 0;
    }
    
    public final void setGameId(int p0) {
    }
    
    public final int getPlayerId() {
        return 0;
    }
    
    public final void setPlayerId(int p0) {
    }
    
    public Play(@androidx.annotation.NonNull()
    int gameId, @androidx.annotation.NonNull()
    int playerId) {
        super();
    }
}