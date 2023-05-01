package com.example.order_app_gui.ui.watch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WatchViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public WatchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is watch fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}