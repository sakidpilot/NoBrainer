package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/st_nobrainerquizapp/ScoreboardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/st_nobrainerquizapp/ScoreboardAdapter$ScoreViewHolder;", "userScores", "", "Lcom/example/st_nobrainerquizapp/UserScore;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ScoreViewHolder", "app_release"})
public final class ScoreboardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.st_nobrainerquizapp.ScoreboardAdapter.ScoreViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.st_nobrainerquizapp.UserScore> userScores = null;
    
    public ScoreboardAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.st_nobrainerquizapp.UserScore> userScores) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.st_nobrainerquizapp.ScoreboardAdapter.ScoreViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.ScoreboardAdapter.ScoreViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/st_nobrainerquizapp/ScoreboardAdapter$ScoreViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/st_nobrainerquizapp/ScoreboardAdapter;Landroid/view/View;)V", "userNameTextView", "Landroid/widget/TextView;", "getUserNameTextView", "()Landroid/widget/TextView;", "userScoreTextView", "getUserScoreTextView", "app_release"})
    public final class ScoreViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView userNameTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView userScoreTextView = null;
        
        public ScoreViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getUserNameTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getUserScoreTextView() {
            return null;
        }
    }
}