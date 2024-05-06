package it.thefedex87.auth.domain

import it.thefedex87.core.domain.DataError
import it.thefedex87.core.domain.EmptyResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}