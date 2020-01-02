package com.dantu.findingsita.repository.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/dantu/findingsita/repository/database/PlayRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "playDao", "Lcom/dantu/findingsita/repository/database/PlayDao;", "createPlay", "", "play", "Lcom/dantu/findingsita/repository/database/Play;", "plays", "", "getPlaysForGameId", "gameId", "", "updatePlay", "app_debug"})
public final class PlayRepository {
    private com.dantu.findingsita.repository.database.PlayDao playDao;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dantu.findingsita.repository.database.Play> getPlaysForGameId(int gameId) {
        return null;
    }
    
    public final void updatePlay(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Play play) {
    }
    
    public final void createPlay(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.repository.database.Play play) {
    }
    
    public final void createPlay(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dantu.findingsita.repository.database.Play> plays) {
    }
    
    public PlayRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}