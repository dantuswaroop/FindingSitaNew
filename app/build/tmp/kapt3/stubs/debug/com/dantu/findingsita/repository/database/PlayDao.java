package com.dantu.findingsita.repository.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'\u00a8\u0006\f"}, d2 = {"Lcom/dantu/findingsita/repository/database/PlayDao;", "", "getPlaysForGame", "", "Lcom/dantu/findingsita/repository/database/Play;", "gameId", "", "insertPlay", "", "play", "plays", "updatePlay", "app_debug"})
public abstract interface PlayDao {
    
    @androidx.room.Insert()
    public abstract void insertPlay(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Play play);
    
    @androidx.room.Insert()
    public abstract void insertPlay(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dantu.findingsita.repository.database.Play> plays);
    
    @androidx.room.Update()
    public abstract void updatePlay(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Play play);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from play where game_id=:gameId")
    public abstract java.util.List<com.dantu.findingsita.repository.database.Play> getPlaysForGame(int gameId);
}