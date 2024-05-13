package it.thefedex87.run.presentation.di

import it.thefedex87.run.presentation.active_run.ActiveRunViewModel
import it.thefedex87.run.presentation.run_overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val runViewModelModule = module {
    viewModelOf(::RunOverviewViewModel)
    viewModelOf(::ActiveRunViewModel)
}