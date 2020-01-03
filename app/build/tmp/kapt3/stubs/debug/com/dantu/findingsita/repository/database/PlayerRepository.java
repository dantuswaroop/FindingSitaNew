package com.dantu.findingsita.repository.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/dantu/findingsita/repository/database/PlayerRepository;", "", "application", "Landroid/content/Context;", "(Landroid/content/Context;)V", "playerDao", "Lcom/dantu/findingsita/repository/database/PlayerDao;", "playerList", "Landroidx/lifecycle/LiveData;", "", "Lcom/dantu/findingsita/repository/database/Player;", "getPlayerList", "()Landroidx/lifecycle/LiveData;", "deletePlayer", "", "player", "getPlayerById", "playerId", "", "getPlayers", "insertPlayer", "updatePlayer", "app_debug"})
public final class PlayerRepository {
    private com.dantu.findingsita.repository.database.PlayerDao playerDao;
    private androidx.lifecycle.LiveData<java.util.List<com.dantu.findingsita.repository.database.Player>> playerList;
    
    private final androidx.lifecycle.LiveData<java.util.List<com.dantu.findingsita.repository.database.Player>> getPlayerList() {
        return null;
    }
    
    public final void insertPlayer(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player) {
    }
    
    public final void deletePlayer(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player) {
    }
    
    public final void updatePlayer(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dantu.findingsita.repository.database.Player>> getPlayers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dantu.findingsita.repository.database.Player getPlayerById(int playerId) {
        return null;
    }
    
    public PlayerRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context application) {
        super();
    }
}