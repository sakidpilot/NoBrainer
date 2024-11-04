package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a8\u0006\u001b"}, d2 = {"Lcom/example/st_nobrainerquizapp/SQLiteDBQuiz;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAfricaQuestions", "", "Lcom/example/st_nobrainerquizapp/QuestionModel;", "getAllQuizzes", "Lcom/example/st_nobrainerquizapp/QuizModel;", "getAtlasQuestions", "getBirdQuestions", "getQuestionsByQuizId", "quizId", "", "getSouthAfricaQuestions", "getWildlifeQuestions", "insertInitialData", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onCreate", "onUpgrade", "oldVersion", "", "newVersion", "Companion", "app_debug"})
public final class SQLiteDBQuiz extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DATABASE_NAME = "quiz_database";
    private static final int DATABASE_VERSION = 1;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_QUIZ = "quiz";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_QUIZ_ID = "id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_TITLE = "title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_SUBTITLE = "subtitle";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_TIME = "time";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_QUESTION = "question";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String COLUMN_QUESTION_ID = "question_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_QUIZ_ID_FK = "quiz_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_QUESTION = "question";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_OPTIONS = "options";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_CORRECT = "correct";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COLUMN_HINT = "hint";
    @org.jetbrains.annotations.NotNull
    public static final com.example.st_nobrainerquizapp.SQLiteDBQuiz.Companion Companion = null;
    
    public SQLiteDBQuiz(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override
    public void onUpgrade(@org.jetbrains.annotations.NotNull
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    private final void insertInitialData(android.database.sqlite.SQLiteDatabase db) {
    }
    
    private final java.util.List<com.example.st_nobrainerquizapp.QuestionModel> getWildlifeQuestions() {
        return null;
    }
    
    private final java.util.List<com.example.st_nobrainerquizapp.QuestionModel> getBirdQuestions() {
        return null;
    }
    
    private final java.util.List<com.example.st_nobrainerquizapp.QuestionModel> getSouthAfricaQuestions() {
        return null;
    }
    
    private final java.util.List<com.example.st_nobrainerquizapp.QuestionModel> getAfricaQuestions() {
        return null;
    }
    
    private final java.util.List<com.example.st_nobrainerquizapp.QuestionModel> getAtlasQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.st_nobrainerquizapp.QuizModel> getAllQuizzes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.st_nobrainerquizapp.QuestionModel> getQuestionsByQuizId(@org.jetbrains.annotations.NotNull
    java.lang.String quizId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/st_nobrainerquizapp/SQLiteDBQuiz$Companion;", "", "()V", "COLUMN_CORRECT", "", "COLUMN_HINT", "COLUMN_OPTIONS", "COLUMN_QUESTION", "COLUMN_QUESTION_ID", "COLUMN_QUIZ_ID", "COLUMN_QUIZ_ID_FK", "COLUMN_SUBTITLE", "COLUMN_TIME", "COLUMN_TITLE", "DATABASE_NAME", "DATABASE_VERSION", "", "TABLE_QUESTION", "TABLE_QUIZ", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}