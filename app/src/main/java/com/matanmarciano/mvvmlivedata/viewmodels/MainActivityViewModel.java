package com.matanmarciano.mvvmlivedata.viewmodels;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.os.AsyncTask;

import com.matanmarciano.mvvmlivedata.models.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends BaseObservable {
    private MutableLiveData<List<Model>> modelsLiveData;

    public MainActivityViewModel() {
        this.modelsLiveData = new MutableLiveData<>();

        fetchModels();
    }

    private void fetchModels() {
        AsyncTask<Void, Void, Void> asyncTask = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... noParams) {
                List<Model> modelsList = new ArrayList<>();
                modelsList.add(new Model("Suzuki Swift"));
                modelsList.add(new Model("Renoult Megan"));
                modelsList.add(new Model("Fiat Panda"));
                modelsList.add(new Model("Fiat 500"));
                modelsList.add(new Model("Toyota Land Crouser"));

                setModelsLiveData(modelsList);

                return null;
            }
        };
        asyncTask.execute();
    }

    @Bindable
    public MutableLiveData<List<Model>> getModelsLiveData() {
        return modelsLiveData;
    }

    private void setModelsLiveData(List<Model> modelsList) {
        modelsLiveData.postValue(modelsList);
    }
}
