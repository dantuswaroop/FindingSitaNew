package com.dantu.findingsita.repository.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\b"}, d2 = {"Lcom/dantu/findingsita/repository/database/GameDao;", "", "createGame", "", "game", "Lcom/dantu/findingsita/repository/database/Game;", "deleteGame", "saveGame", "app_debug"})
public abstract interface GameDao {
    
    @androidx.room.Insert()
    public abstract void createGame(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Game game);
    
    @androidx.room.Update()
    public abstract void saveGame(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Game game);
    
    @androidx.room.Delete()
    public abstract void deleteGame(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Game game);
}