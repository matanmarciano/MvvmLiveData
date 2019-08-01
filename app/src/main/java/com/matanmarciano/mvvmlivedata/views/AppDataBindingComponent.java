package com.matanmarciano.mvvmlivedata.views;

public class AppDataBindingComponent<T> implements android.databinding.DataBindingComponent {
    private T activity;

    public AppDataBindingComponent(T activity) {
        this.activity = activity;
    }

    public MainActivity getMainActivity() {
        return (MainActivity) activity;
    }
}