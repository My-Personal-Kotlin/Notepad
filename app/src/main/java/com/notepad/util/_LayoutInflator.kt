package com.notepad.util

import android.content.Context
import android.view.LayoutInflater

val Context.layoutInflator
    get() = LayoutInflater.from(this)