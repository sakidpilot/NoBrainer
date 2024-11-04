package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J.\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/st_nobrainerquizapp/UserPreferences;", "", "()V", "KEY_AGE", "", "KEY_BIO", "KEY_EMAIL", "KEY_GENDER", "KEY_USERNAME", "PREF_NAME", "preferences", "Landroid/content/SharedPreferences;", "clearUserDetails", "", "getAge", "getBio", "getEmail", "getGender", "getUsername", "init", "context", "Landroid/content/Context;", "setUserDetails", "email", "username", "bio", "gender", "age", "app_release"})
public final class UserPreferences {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PREF_NAME = "UserPrefs";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_EMAIL = "email";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_USERNAME = "username";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_BIO = "bio";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_GENDER = "gender";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_AGE = "age";
    private static android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.NotNull
    public static final com.example.st_nobrainerquizapp.UserPreferences INSTANCE = null;
    
    private UserPreferences() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void setUserDetails(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String bio, @org.jetbrains.annotations.NotNull
    java.lang.String gender, @org.jetbrains.annotations.NotNull
    java.lang.String age) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBio() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAge() {
        return null;
    }
    
    public final void clearUserDetails() {
    }
}