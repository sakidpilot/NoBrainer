package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/st_nobrainerquizapp/ScorePreferences;", "", "()V", "KEY_SCORE", "", "PREF_NAME", "preferences", "Landroid/content/SharedPreferences;", "decrementScore", "", "getScore", "", "incrementScore", "init", "context", "Landroid/content/Context;", "setScore", "score", "app_release"})
public final class ScorePreferences {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PREF_NAME = "ScorePrefs";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_SCORE = "score";
    private static android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.NotNull
    public static final com.example.st_nobrainerquizapp.ScorePreferences INSTANCE = null;
    
    private ScorePreferences() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final int getScore() {
        return 0;
    }
    
    public final void incrementScore() {
    }
    
    public final void decrementScore() {
    }
    
    public final void setScore(int score) {
    }
}