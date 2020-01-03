package com.dantu.findingsita.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\"\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J-\u0010,\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00042\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00100\u001a\u000201H\u0016\u00a2\u0006\u0002\u00102J\b\u00103\u001a\u00020\u0019H\u0016J\b\u00104\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00066"}, d2 = {"Lcom/dantu/findingsita/ui/main/AddOrEditPlayerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "CAMERA_REQUEST", "", "MY_CAMERA_PERMISSION_CODE", "byteArray", "", "editMode", "", "getEditMode", "()Z", "setEditMode", "(Z)V", "player", "Lcom/dantu/findingsita/repository/database/Player;", "playerId", "Ljava/lang/Integer;", "playersViewModel", "Lcom/dantu/findingsita/ui/main/PlayersViewModel;", "getPlayersViewModel", "()Lcom/dantu/findingsita/ui/main/PlayersViewModel;", "setPlayersViewModel", "(Lcom/dantu/findingsita/ui/main/PlayersViewModel;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "updateActionBar", "Companion", "app_debug"})
public final class AddOrEditPlayerFragment extends androidx.fragment.app.Fragment {
    private com.dantu.findingsita.repository.database.Player player;
    private byte[] byteArray;
    private final int CAMERA_REQUEST = 1888;
    private final int MY_CAMERA_PERMISSION_CODE = 100;
    private java.lang.Integer playerId;
    private boolean editMode;
    @org.jetbrains.annotations.NotNull()
    public com.dantu.findingsita.ui.main.PlayersViewModel playersViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getEditMode() {
        return false;
    }
    
    public final void setEditMode(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dantu.findingsita.ui.main.PlayersViewModel getPlayersViewModel() {
        return null;
    }
    
    public final void setPlayersViewModel(@org.jetbrains.annotations.NotNull()
    com.dantu.findingsita.ui.main.PlayersViewModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void updateActionBar() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public AddOrEditPlayerFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dantu/findingsita/ui/main/AddOrEditPlayerFragment$Companion;", "", "()V", "EXTRA_PLAYER_ID", "", "getEXTRA_PLAYER_ID", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String EXTRA_PLAYER_ID = "EXTRA_PLAYER_ID";
        public static final com.dantu.findingsita.ui.main.AddOrEditPlayerFragment.Companion INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_PLAYER_ID() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}