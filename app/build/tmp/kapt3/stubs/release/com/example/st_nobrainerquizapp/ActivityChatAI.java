package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0010H\u0002J.\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J$\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\rH\u0002J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/st_nobrainerquizapp/ActivityChatAI;", "Lcom/example/st_nobrainerquizapp/BaseActivity;", "()V", "TAG", "", "client", "Lokhttp3/OkHttpClient;", "etQuestion", "Lcom/google/android/material/textfield/TextInputEditText;", "idTVQuestion", "Landroid/widget/TextView;", "txtResponse", "getResponse", "", "question", "callback", "Lkotlin/Function1;", "handleErrorResponse", "code", "", "errorBody", "handleQuestion", "handleSuccessResponse", "body", "isNetworkAvailable", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupQuestionInput", "showToast", "message", "app_release"})
public final class ActivityChatAI extends com.example.st_nobrainerquizapp.BaseActivity {
    @org.jetbrains.annotations.NotNull
    private final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "ChatAI";
    private android.widget.TextView txtResponse;
    private android.widget.TextView idTVQuestion;
    private com.google.android.material.textfield.TextInputEditText etQuestion;
    
    public ActivityChatAI() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupQuestionInput() {
    }
    
    private final void handleQuestion(java.lang.String question) {
    }
    
    private final boolean isNetworkAvailable() {
        return false;
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void getResponse(java.lang.String question, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    private final void handleErrorResponse(int code, java.lang.String errorBody, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    private final void handleSuccessResponse(java.lang.String body, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
}