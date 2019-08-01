package com.matanmarciano.mvvmlivedata.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.matanmarciano.mvvmlivedata.R;
import com.matanmarciano.mvvmlivedata.databinding.ActivityMainBinding;
import com.matanmarciano.mvvmlivedata.models.Model;
import com.matanmarciano.mvvmlivedata.viewmodels.MainActivityViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main, new AppDataBindingComponent(this));
        activityBinding.setViewModel(new MainActivityViewModel());
    }

    @BindingAdapter({"items"})
    public void items(final RecyclerView recyclerView, List<Model> models) {
        Log.i("LIVE_DATA_TEST", "Let's see if this method is reached");

        // TODO: update recyclerView adapter...
    }
}
