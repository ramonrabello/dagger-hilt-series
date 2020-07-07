package com.github.ramonrabello.android.dagger.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(value = [ApplicationComponent::class, ActivityComponent::class])
@Module
abstract class LoggingModule {

    @Binds
    abstract fun bindAuditLogger(impl: AuditLogger): Logger

}