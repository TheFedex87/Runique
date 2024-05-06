package it.thefedex87.auth.data.di

import EmailPatternValidator
import it.thefedex87.auth.domain.PatternValidator
import it.thefedex87.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}