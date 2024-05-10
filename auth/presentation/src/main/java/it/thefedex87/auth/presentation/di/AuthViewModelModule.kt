package it.thefedex87.auth.presentation.di

import it.thefedex87.auth.presentation.login.LoginViewModel
import it.thefedex87.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}