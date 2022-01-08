package com.notepad

import android.app.Application
import com.notepad.data.DataStore.init

class NotesApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }
}