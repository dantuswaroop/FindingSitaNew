package com.dantu.findingsita.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u000fJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dantu/findingsita/ui/main/PlayersViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "playerRepository", "Lcom/dantu/findingsita/repository/database/PlayerRepository;", "deletePlayer", "", "player", "Lcom/dantu/findingsita/repository/database/Player;", "getPlayerById", "playerId", "", "getPlayers", "Landroidx/lifecycle/LiveData;", "", "insertPlayer", "updatePlayer", "app_debug"})
public final class PlayersViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.dantu.findingsita.repository.database.PlayerRepository playerRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dantu.findingsita.repository.database.Player>> getPlayers() {
        return null;
    }
    
    public final void insertPlayer(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dantu.findingsita.repository.database.Player getPlayerById(int playerId) {
        return null;
    }
    
    public final void updatePlayer(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player) {
    }
    
    public final void deletePlayer(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Player player) {
    }
    
    public PlayersViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}