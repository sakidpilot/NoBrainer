package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/st_nobrainerquizapp/ActivityLogin;", "Lcom/example/st_nobrainerquizapp/BaseActivity;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "binding", "Lcom/example/st_nobrainerquizapp/databinding/ActivityLoginBinding;", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "handleResults", "", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "signInWithGoogle", "sinInUser", "updateUI", "account", "validateForm", "", "email", "", "password", "app_release"})
public final class ActivityLogin extends com.example.st_nobrainerquizapp.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.example.st_nobrainerquizapp.databinding.ActivityLoginBinding binding;
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient googleSignInClient;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcher = null;
    
    public ActivityLogin() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void sinInUser() {
    }
    
    private final boolean validateForm(java.lang.String email, java.lang.String password) {
        return false;
    }
    
    private final void signInWithGoogle() {
    }
    
    private final void handleResults(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> task) {
    }
    
    private final void updateUI(com.google.android.gms.auth.api.signin.GoogleSignInAccount account) {
    }
}