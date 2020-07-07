package com.github.ramonrabello.android.dagger.hilt

import android.util.Log
import javax.inject.Inject


interface Logger {

    fun log(message: String)
}

class AuditLogger @Inject constructor(): Logger {

    companion object {
        const val TAG = "AuditLogger"
    }

    override fun log(message: String) {
        Log.i(TAG, message)
    }
}