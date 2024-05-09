package it.thefedex87.auth.domain

import it.thefedex87.core.domain.util.DataError
import it.thefedex87.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}