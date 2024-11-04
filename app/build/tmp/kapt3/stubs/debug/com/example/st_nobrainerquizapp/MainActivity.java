package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0012\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020$H\u0014J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000e\u00a8\u0006/"}, d2 = {"Lcom/example/st_nobrainerquizapp/MainActivity;", "Lcom/example/st_nobrainerquizapp/BaseActivity;", "()V", "adapter", "Lcom/example/st_nobrainerquizapp/QuizListAdapter;", "getAdapter", "()Lcom/example/st_nobrainerquizapp/QuizListAdapter;", "setAdapter", "(Lcom/example/st_nobrainerquizapp/QuizListAdapter;)V", "auth", "", "getAuth", "()Ljava/lang/String;", "setAuth", "(Ljava/lang/String;)V", "binding", "Lcom/example/st_nobrainerquizapp/databinding/ActivityMainBinding;", "connect", "Lcom/example/st_nobrainerquizapp/CheckConnStatus;", "getConnect", "()Lcom/example/st_nobrainerquizapp/CheckConnStatus;", "quizDB", "Lcom/example/st_nobrainerquizapp/SQLiteDBQuiz;", "quizModelList", "", "Lcom/example/st_nobrainerquizapp/QuizModel;", "getQuizModelList", "()Ljava/util/List;", "setQuizModelList", "(Ljava/util/List;)V", "score", "", "user", "getUser", "setUser", "createNotificationChannel", "", "getQuizFromDatabase", "getQuizFromFirebase", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "requestNotificationPermission", "setupRecyclerView", "showNotification", "Companion", "app_debug"})
public final class MainActivity extends com.example.st_nobrainerquizapp.BaseActivity {
    private com.example.st_nobrainerquizapp.SQLiteDBQuiz quizDB;
    @org.jetbrains.annotations.NotNull
    private final com.example.st_nobrainerquizapp.CheckConnStatus connect = null;
    @org.jetbrains.annotations.Nullable
    private com.example.st_nobrainerquizapp.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHANNEL_ID = "nobrainer_channel";
    private static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 123;
    private static final int NOTIFICATION_ID = 1;
    private static final int PENDING_INTENT_REQUEST_CODE = 0;
    public java.util.List<com.example.st_nobrainerquizapp.QuizModel> quizModelList;
    public com.example.st_nobrainerquizapp.QuizListAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private java.lang.String auth;
    @org.jetbrains.annotations.NotNull
    private java.lang.String user;
    private final int score = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.example.st_nobrainerquizapp.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.st_nobrainerquizapp.CheckConnStatus getConnect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.st_nobrainerquizapp.QuizModel> getQuizModelList() {
        return null;
    }
    
    public final void setQuizModelList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.st_nobrainerquizapp.QuizModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.st_nobrainerquizapp.QuizListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.QuizListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuth() {
        return null;
    }
    
    public final void setAuth(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void getQuizFromFirebase() {
    }
    
    private final void getQuizFromDatabase() {
    }
    
    private final void showNotification() {
    }
    
    private final void requestNotificationPermission() {
    }
    
    private final void createNotificationChannel() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/st_nobrainerquizapp/MainActivity$Companion;", "", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "NOTIFICATION_PERMISSION_REQUEST_CODE", "PENDING_INTENT_REQUEST_CODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}