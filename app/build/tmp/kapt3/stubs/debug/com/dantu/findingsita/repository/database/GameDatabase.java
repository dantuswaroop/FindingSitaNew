package com.dantu.findingsita.repository.database;

import java.lang.System;

@androidx.room.Database(entities = {com.dantu.findingsita.repository.database.Game.class, com.dantu.findingsita.repository.database.Play.class, com.dantu.findingsita.repository.database.Player.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/dantu/findingsita/repository/database/GameDatabase;", "Landroidx/room/RoomDatabase;", "()V", "gameDao", "Lcom/dantu/findingsita/repository/database/GameDao;", "getGameDao", "()Lcom/dantu/findingsita/repository/database/GameDao;", "playDao", "Lcom/dantu/findingsita/repository/database/PlayDao;", "getPlayDao", "()Lcom/dantu/findingsita/repository/database/PlayDao;", "playerDao", "Lcom/dantu/findingsita/repository/database/PlayerDao;", "getPlayerDao", "()Lcom/dantu/findingsita/repository/database/PlayerDao;", "Companion", "app_debug"})
public abstract class GameDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dantu.findingsita.repository.database.GameDao getGameDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dantu.findingsita.repository.database.PlayDao getPlayDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dantu.findingsita.repository.database.PlayerDao getPlayerDao();
    
    public GameDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dantu/findingsita/repository/database/GameDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/dantu/findingsita/repository/database/GameDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        private static com.dantu.findingsita.repository.database.GameDatabase INSTANCE;
        public static final com.dantu.findingsita.repository.database.GameDatabase.Companion INSTANCE = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.dantu.findingsita.repository.database.GameDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}