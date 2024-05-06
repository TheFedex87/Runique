package com.plcoding.runique

import android.app.Application
import com.plcoding.runique.di.appModule
import it.thefedex87.auth.data.di.authDataModule
import it.thefedex87.auth.presentation.di.authViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp: Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule
            )
        }
    }
}