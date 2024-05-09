package it.thefedex87.core.data.di

import it.thefedex87.core.data.auth.EncryptedSessionStorage
import it.thefedex87.core.data.networking.HttpClientFactory
import it.thefedex87.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}