package com.example.st_nobrainerquizapp.OwnQuiz;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/st_nobrainerquizapp/OwnQuiz/PlayQuizActivity;", "Lcom/example/st_nobrainerquizapp/BaseActivity;", "()V", "binding", "Lcom/example/st_nobrainerquizapp/databinding/ActivityPlayQuizBinding;", "currentQuestionIndex", "", "optionViews", "", "Landroid/widget/TextView;", "quiz", "Lcom/example/st_nobrainerquizapp/OwnQuiz/Quiz;", "quizViewModel", "Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizViewModel;", "score", "checkAnswer", "", "selectedIndex", "correctIndex", "displayQuestion", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveScore", "showFinalScore", "app_release"})
public final class PlayQuizActivity extends com.example.st_nobrainerquizapp.BaseActivity {
    private com.example.st_nobrainerquizapp.OwnQuiz.QuizViewModel quizViewModel;
    private com.example.st_nobrainerquizapp.OwnQuiz.Quiz quiz;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private com.example.st_nobrainerquizapp.databinding.ActivityPlayQuizBinding binding;
    private java.util.List<? extends android.widget.TextView> optionViews;
    
    public PlayQuizActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void displayQuestion() {
    }
    
    private final void checkAnswer(int selectedIndex, int correctIndex) {
    }
    
    private final void showFinalScore() {
    }
    
    private final void saveScore() {
    }
}