package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/st_nobrainerquizapp/ActivityScoreboard;", "Lcom/example/st_nobrainerquizapp/BaseActivity;", "()V", "bottomNavigation", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "scoreboardAdapter", "Lcom/example/st_nobrainerquizapp/ScoreboardAdapter;", "userScores", "", "Lcom/example/st_nobrainerquizapp/UserScore;", "fetchTopScores", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ActivityScoreboard extends com.example.st_nobrainerquizapp.BaseActivity {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.st_nobrainerquizapp.ScoreboardAdapter scoreboardAdapter;
    private com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigation;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.st_nobrainerquizapp.UserScore> userScores = null;
    
    public ActivityScoreboard() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchTopScores() {
    }
}