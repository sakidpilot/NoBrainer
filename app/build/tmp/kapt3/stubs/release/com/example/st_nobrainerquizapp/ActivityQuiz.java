package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0012\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u001eH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"Lcom/example/st_nobrainerquizapp/ActivityQuiz;", "Lcom/example/st_nobrainerquizapp/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/example/st_nobrainerquizapp/databinding/ActivityQuizBinding;", "getBinding", "()Lcom/example/st_nobrainerquizapp/databinding/ActivityQuizBinding;", "setBinding", "(Lcom/example/st_nobrainerquizapp/databinding/ActivityQuizBinding;)V", "connect", "Lcom/example/st_nobrainerquizapp/CheckConnStatus;", "getConnect", "()Lcom/example/st_nobrainerquizapp/CheckConnStatus;", "currentQuestionIndex", "", "getCurrentQuestionIndex", "()I", "setCurrentQuestionIndex", "(I)V", "score", "getScore", "setScore", "selectedAnswer", "", "getSelectedAnswer", "()Ljava/lang/String;", "setSelectedAnswer", "(Ljava/lang/String;)V", "finishQuiz", "", "loadQuestions", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "startTimer", "Companion", "app_release"})
public final class ActivityQuiz extends com.example.st_nobrainerquizapp.BaseActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.example.st_nobrainerquizapp.QuestionModel> questionModelList;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String time = "";
    public com.example.st_nobrainerquizapp.databinding.ActivityQuizBinding binding;
    @org.jetbrains.annotations.NotNull
    private final com.example.st_nobrainerquizapp.CheckConnStatus connect = null;
    private int currentQuestionIndex = 0;
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedAnswer = "";
    private int score = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.example.st_nobrainerquizapp.ActivityQuiz.Companion Companion = null;
    
    public ActivityQuiz() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.st_nobrainerquizapp.databinding.ActivityQuizBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.databinding.ActivityQuizBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.st_nobrainerquizapp.CheckConnStatus getConnect() {
        return null;
    }
    
    public final int getCurrentQuestionIndex() {
        return 0;
    }
    
    public final void setCurrentQuestionIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedAnswer() {
        return null;
    }
    
    public final void setSelectedAnswer(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getScore() {
        return 0;
    }
    
    public final void setScore(int p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startTimer() {
    }
    
    private final void loadQuestions() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    private final void finishQuiz() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/st_nobrainerquizapp/ActivityQuiz$Companion;", "", "()V", "questionModelList", "", "Lcom/example/st_nobrainerquizapp/QuestionModel;", "getQuestionModelList", "()Ljava/util/List;", "setQuestionModelList", "(Ljava/util/List;)V", "time", "", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.st_nobrainerquizapp.QuestionModel> getQuestionModelList() {
            return null;
        }
        
        public final void setQuestionModelList(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.st_nobrainerquizapp.QuestionModel> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTime() {
            return null;
        }
        
        public final void setTime(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
    }
}