package com.dantu.findingsita.repository.database;

import java.lang.System;

@androidx.room.Entity(tableName = "players")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/dantu/findingsita/repository/database/Player;", "", "playerName", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "image", "", "getImage", "()[B", "setImage", "([B)V", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "playerId", "", "getPlayerId", "()I", "setPlayerId", "(I)V", "getPlayerName", "setPlayerName", "app_debug"})
public final class Player {
    @androidx.annotation.NonNull()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int playerId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(typeAffinity = androidx.room.ColumnInfo.BLOB)
    private byte[] image;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "player_name")
    private java.lang.String playerName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "password")
    private java.lang.String password;
    
    public final int getPlayerId() {
        return 0;
    }
    
    public final void setPlayerId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlayerName() {
        return null;
    }
    
    public final void setPlayerName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Player(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String playerName, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String password) {
        super();
    }
}