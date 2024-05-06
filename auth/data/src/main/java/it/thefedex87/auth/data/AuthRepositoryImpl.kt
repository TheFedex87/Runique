package it.thefedex87.auth.data

import io.ktor.client.HttpClient
import it.thefedex87.auth.domain.AuthRepository
import it.thefedex87.core.data.networking.post
import it.thefedex87.core.domain.DataError
import it.thefedex87.core.domain.EmptyResult

class AuthRepositoryImpl(
    private val httpClient: HttpClient
): AuthRepository {

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}