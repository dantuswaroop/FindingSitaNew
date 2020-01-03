package com.dantu.findingsita.repository.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/dantu/findingsita/repository/database/PlayerDao;", "", "delete", "", "player", "Lcom/dantu/findingsita/repository/database/Player;", "deleteAllPlayers", "getPlayerById", "playerId", "", "getPlayers", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "app_debug"})
public abstract interface PlayerDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM players")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dantu.findingsita.repository.database.Player>> getPlayers();
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player);
    
    @androidx.room.Query(value = "DELETE FROM players")
    public abstract void deleteAllPlayers();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM players WHERE playerId=:playerId")
    public abstract com.dantu.findingsita.repository.database.Player getPlayerById(int playerId);
}