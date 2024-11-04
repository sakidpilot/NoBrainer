package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/st_nobrainerquizapp/ActivityResetPassword;", "Lcom/example/st_nobrainerquizapp/BaseActivity;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "binding", "Lcom/example/st_nobrainerquizapp/databinding/ActivityResetPasswordBinding;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "restPassword", "validateForm", "", "email", "", "app_release"})
public final class ActivityResetPassword extends com.example.st_nobrainerquizapp.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.example.st_nobrainerquizapp.databinding.ActivityResetPasswordBinding binding;
    private com.google.firebase.auth.FirebaseAuth auth;
    
    public ActivityResetPassword() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void restPassword() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    private final boolean validateForm(java.lang.String email) {
        return false;
    }
}