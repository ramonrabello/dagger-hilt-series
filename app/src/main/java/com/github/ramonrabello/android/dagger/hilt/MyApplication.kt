package com.github.ramonrabello.android.dagger.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication: Application(){

    @Inject lateinit var logger: Logger

    override fun onCreate() {
        super.onCreate()
        logger.log("Initializing application")
    }

}