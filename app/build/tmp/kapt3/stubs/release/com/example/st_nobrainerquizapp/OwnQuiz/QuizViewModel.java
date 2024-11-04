package com.example.st_nobrainerquizapp.OwnQuiz;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizViewModel;", "Landroidx/lifecycle/ViewModel;", "quizDao", "Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizDao;", "(Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizDao;)V", "allQuizzes", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/st_nobrainerquizapp/OwnQuiz/Quiz;", "getAllQuizzes", "()Landroidx/lifecycle/LiveData;", "deleteQuiz", "Lkotlinx/coroutines/Job;", "quiz", "getQuizById", "quizId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertQuiz", "updateQuizScore", "score", "app_release"})
public final class QuizViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.st_nobrainerquizapp.OwnQuiz.QuizDao quizDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.st_nobrainerquizapp.OwnQuiz.Quiz>> allQuizzes = null;
    
    public QuizViewModel(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.OwnQuiz.QuizDao quizDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.st_nobrainerquizapp.OwnQuiz.Quiz>> getAllQuizzes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertQuiz(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.OwnQuiz.Quiz quiz) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getQuizById(int quizId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.st_nobrainerquizapp.OwnQuiz.Quiz> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateQuizScore(int quizId, int score) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteQuiz(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.OwnQuiz.Quiz quiz) {
        return null;
    }
}