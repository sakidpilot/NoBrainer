package com.example.st_nobrainerquizapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/st_nobrainerquizapp/REST_API;", "", "getGuide", "Lretrofit2/Call;", "Lcom/example/st_nobrainerquizapp/UserGuide;", "app_debug"})
public abstract interface REST_API {
    
    @retrofit2.http.GET(value = "/api/guide")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.example.st_nobrainerquizapp.UserGuide> getGuide();
}