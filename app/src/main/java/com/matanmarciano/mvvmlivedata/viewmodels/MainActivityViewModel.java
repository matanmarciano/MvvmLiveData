package com.matanmarciano.mvvmlivedata.viewmodels;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.matanmarciano.mvvmlivedata.models.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends BaseObservable {
    private MutableLiveData<List<Model>> modelsLiveData;

    public MainActivityViewModel() {
        this.modelsLiveData = new MutableLiveData<>();

        List<Model> modelsList = new ArrayList<>();
        modelsList.add(new Model("Suzuki Swift", 2761111));
        modelsList.add(new Model("Renoult Megan", 3679060));
        modelsList.add(new Model("Fiat Panda", 4638764));
        modelsList.add(new Model("Fiat 500", 1234567));
        modelsList.add(new Model("Toyota Land Crouser", 9876543));
        setModelsLiveData(modelsList);
    }

    @Bindable
    public MutableLiveData<List<Model>> getModelsLiveData() {
        return modelsLiveData;
    }

    private void setModelsLiveData(List<Model> modelsList) {
        modelsLiveData.postValue(modelsList);
    }
}
