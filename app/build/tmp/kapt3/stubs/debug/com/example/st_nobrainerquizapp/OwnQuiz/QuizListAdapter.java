package com.example.st_nobrainerquizapp.OwnQuiz;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B-\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/st_nobrainerquizapp/OwnQuiz/Quiz;", "Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizListAdapter$QuizViewHolder;", "onItemClicked", "Lkotlin/Function1;", "", "onDeleteClicked", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "QuizViewHolder", "app_debug"})
public final class QuizListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.st_nobrainerquizapp.OwnQuiz.Quiz, com.example.st_nobrainerquizapp.OwnQuiz.QuizListAdapter.QuizViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.st_nobrainerquizapp.OwnQuiz.Quiz, kotlin.Unit> onItemClicked = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.st_nobrainerquizapp.OwnQuiz.Quiz, kotlin.Unit> onDeleteClicked = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.st_nobrainerquizapp.OwnQuiz.Quiz> QuizDiffCallback = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.st_nobrainerquizapp.OwnQuiz.QuizListAdapter.Companion Companion = null;
    
    public QuizListAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.st_nobrainerquizapp.OwnQuiz.Quiz, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.st_nobrainerquizapp.OwnQuiz.Quiz, kotlin.Unit> onDeleteClicked) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.st_nobrainerquizapp.OwnQuiz.QuizListAdapter.QuizViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.OwnQuiz.QuizListAdapter.QuizViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizListAdapter$Companion;", "", "()V", "QuizDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/st_nobrainerquizapp/OwnQuiz/Quiz;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0006R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/st_nobrainerquizapp/OwnQuiz/QuizListAdapter$QuizViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClicked", "Lkotlin/Function1;", "Lcom/example/st_nobrainerquizapp/OwnQuiz/Quiz;", "", "onDeleteClicked", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "currentQuiz", "deleteButton", "Landroid/widget/Button;", "questionCountTextView", "Landroid/widget/TextView;", "quizTitleTextView", "scoreTextView", "bind", "quiz", "app_debug"})
    public static final class QuizViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<com.example.st_nobrainerquizapp.OwnQuiz.Quiz, kotlin.Unit> onItemClicked = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<com.example.st_nobrainerquizapp.OwnQuiz.Quiz, kotlin.Unit> onDeleteClicked = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView quizTitleTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView questionCountTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView scoreTextView = null;
        @org.jetbrains.annotations.Nullable
        private com.example.st_nobrainerquizapp.OwnQuiz.Quiz currentQuiz;
        @org.jetbrains.annotations.NotNull
        private final android.widget.Button deleteButton = null;
        
        public QuizViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.st_nobrainerquizapp.OwnQuiz.Quiz, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.st_nobrainerquizapp.OwnQuiz.Quiz, kotlin.Unit> onDeleteClicked) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.st_nobrainerquizapp.OwnQuiz.Quiz quiz) {
        }
    }
}