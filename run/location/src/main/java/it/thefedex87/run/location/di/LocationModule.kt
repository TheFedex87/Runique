package it.thefedex87.run.location.di

import it.thefedex87.run.domain.LocationObserver
import it.thefedex87.run.location.AndroidLocationObserver
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val locationModule = module {
    singleOf(::AndroidLocationObserver).bind<LocationObserver>()
}