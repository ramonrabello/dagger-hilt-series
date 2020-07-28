package com.github.ramonrabello.android.dagger.hilt

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class LoggingViewModel @ViewModelInject constructor(
    private val logger: Logger,
    @Assisted private val savedStateHandle: SavedStateHandle
): ViewModel() {

    fun log(message: String) {
        logger.log(message)
    }
}