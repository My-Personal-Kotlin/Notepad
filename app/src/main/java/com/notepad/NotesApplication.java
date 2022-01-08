package com.notepad;

import android.app.Application;

import com.notepad.data.DataStore;

public class NotesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataStore.init(this);
    }
}
