package com.dantu.findingsita.repository.database;

import java.lang.System;

@androidx.room.Entity(tableName = "game")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/dantu/findingsita/repository/database/Game;", "", "gameId", "", "(I)V", "getGameId", "()I", "setGameId", "gameName", "", "getGameName", "()Ljava/lang/String;", "setGameName", "(Ljava/lang/String;)V", "saved", "", "getSaved", "()Z", "setSaved", "(Z)V", "app_debug"})
public final class Game {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "game_name")
    private java.lang.String gameName;
    @androidx.room.ColumnInfo(name = "saved")
    private boolean saved;
    @androidx.room.ColumnInfo(name = "game_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int gameId;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGameName() {
        return null;
    }
    
    public final void setGameName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getSaved() {
        return false;
    }
    
    public final void setSaved(boolean p0) {
    }
    
    public final int getGameId() {
        return 0;
    }
    
    public final void setGameId(int p0) {
    }
    
    public Game(@androidx.annotation.NonNull()
    int gameId) {
        super();
    }
}