package com.example.st_nobrainerquizapp.otherGames;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J%\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/st_nobrainerquizapp/otherGames/SnakeGameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/st_nobrainerquizapp/otherGames/SnakeGameState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "isWithinBounds", "", "coordinate", "Lcom/example/st_nobrainerquizapp/otherGames/Coordinate;", "xAxisGridSize", "", "yAxisGridSize", "onEvent", "", "event", "Lcom/example/st_nobrainerquizapp/otherGames/SnakeGameEvent;", "updateDirection", "offset", "Landroidx/compose/ui/geometry/Offset;", "canvasWidth", "updateDirection-3MmeM6k", "(JI)V", "updateGame", "currentGame", "app_release"})
public final class SnakeGameViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.st_nobrainerquizapp.otherGames.SnakeGameState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.st_nobrainerquizapp.otherGames.SnakeGameState> state = null;
    
    public SnakeGameViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.st_nobrainerquizapp.otherGames.SnakeGameState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.st_nobrainerquizapp.otherGames.SnakeGameEvent event) {
    }
    
    private final com.example.st_nobrainerquizapp.otherGames.SnakeGameState updateGame(com.example.st_nobrainerquizapp.otherGames.SnakeGameState currentGame) {
        return null;
    }
    
    private final boolean isWithinBounds(com.example.st_nobrainerquizapp.otherGames.Coordinate coordinate, int xAxisGridSize, int yAxisGridSize) {
        return false;
    }
}