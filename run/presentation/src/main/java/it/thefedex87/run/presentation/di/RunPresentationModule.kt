package it.thefedex87.run.presentation.di

import it.thefedex87.run.domain.RunningTracker
import it.thefedex87.run.presentation.active_run.ActiveRunViewModel
import it.thefedex87.run.presentation.run_overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val runPresentationModule = module {
    singleOf(::RunningTracker)

    viewModelOf(::RunOverviewViewModel)
    viewModelOf(::ActiveRunViewModel)
}