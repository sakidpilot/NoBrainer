package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/st_nobrainerquizapp/BiometricManager;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "promptResults", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult;", "getPromptResults", "()Lkotlinx/coroutines/flow/Flow;", "resultChannel", "Lkotlinx/coroutines/channels/Channel;", "showBiometricPrompt", "", "title", "", "description", "BiometricResult", "app_debug"})
public final class BiometricManager {
    @org.jetbrains.annotations.NotNull
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.Channel<com.example.st_nobrainerquizapp.BiometricManager.BiometricResult> resultChannel = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.example.st_nobrainerquizapp.BiometricManager.BiometricResult> promptResults = null;
    
    public BiometricManager(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.st_nobrainerquizapp.BiometricManager.BiometricResult> getPromptResults() {
        return null;
    }
    
    public final void showBiometricPrompt(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult;", "", "AuthenticationError", "AuthenticationFailed", "AuthenticationNotSet", "AuthenticationSuccess", "FeatureUnavailable", "HardwareUnavailable", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$AuthenticationError;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$AuthenticationFailed;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$AuthenticationNotSet;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$AuthenticationSuccess;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$FeatureUnavailable;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$HardwareUnavailable;", "app_debug"})
    public static abstract interface BiometricResult {
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$AuthenticationError;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class AuthenticationError implements com.example.st_nobrainerquizapp.BiometricManager.BiometricResult {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String error = null;
            
            public AuthenticationError(@org.jetbrains.annotations.NotNull
            java.lang.String error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getError() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.st_nobrainerquizapp.BiometricManager.BiometricResult.AuthenticationError copy(@org.jetbrains.annotations.NotNull
            java.lang.String error) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$AuthenticationFailed;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class AuthenticationFailed implements com.example.st_nobrainerquizapp.BiometricManager.BiometricResult {
            @org.jetbrains.annotations.NotNull
            public static final com.example.st_nobrainerquizapp.BiometricManager.BiometricResult.AuthenticationFailed INSTANCE = null;
            
            private AuthenticationFailed() {
                super();
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$AuthenticationNotSet;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class AuthenticationNotSet implements com.example.st_nobrainerquizapp.BiometricManager.BiometricResult {
            @org.jetbrains.annotations.NotNull
            public static final com.example.st_nobrainerquizapp.BiometricManager.BiometricResult.AuthenticationNotSet INSTANCE = null;
            
            private AuthenticationNotSet() {
                super();
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$AuthenticationSuccess;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class AuthenticationSuccess implements com.example.st_nobrainerquizapp.BiometricManager.BiometricResult {
            @org.jetbrains.annotations.NotNull
            public static final com.example.st_nobrainerquizapp.BiometricManager.BiometricResult.AuthenticationSuccess INSTANCE = null;
            
            private AuthenticationSuccess() {
                super();
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$FeatureUnavailable;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class FeatureUnavailable implements com.example.st_nobrainerquizapp.BiometricManager.BiometricResult {
            @org.jetbrains.annotations.NotNull
            public static final com.example.st_nobrainerquizapp.BiometricManager.BiometricResult.FeatureUnavailable INSTANCE = null;
            
            private FeatureUnavailable() {
                super();
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult$HardwareUnavailable;", "Lcom/example/st_nobrainerquizapp/BiometricManager$BiometricResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class HardwareUnavailable implements com.example.st_nobrainerquizapp.BiometricManager.BiometricResult {
            @org.jetbrains.annotations.NotNull
            public static final com.example.st_nobrainerquizapp.BiometricManager.BiometricResult.HardwareUnavailable INSTANCE = null;
            
            private HardwareUnavailable() {
                super();
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
    }
}