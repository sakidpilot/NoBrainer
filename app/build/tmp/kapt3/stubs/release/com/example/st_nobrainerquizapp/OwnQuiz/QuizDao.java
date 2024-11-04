package com.example.st_nobrainerquizapp.OwnQuiz;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizDao;", "", "deleteQuiz", "", "quiz", "Lcom/example/st_nobrainerquizapp/OwnQuiz/Quiz;", "(Lcom/example/st_nobrainerquizapp/OwnQuiz/Quiz;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllQuizzes", "Lkotlinx/coroutines/flow/Flow;", "", "getQuizById", "quizId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertQuiz", "updateQuizScore", "score", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
@androidx.room.Dao
public abstract interface QuizDao {
    
    @androidx.room.Query(value = "SELECT * FROM quizzes")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.st_nobrainerquizapp.OwnQuiz.Quiz>> getAllQuizzes();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertQuiz(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.OwnQuiz.Quiz quiz, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM quizzes WHERE id = :quizId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getQuizById(int quizId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.st_nobrainerquizapp.OwnQuiz.Quiz> $completion);
    
    @androidx.room.Query(value = "UPDATE quizzes SET score = :score WHERE id = :quizId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateQuizScore(int quizId, int score, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteQuiz(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.OwnQuiz.Quiz quiz, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}