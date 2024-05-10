package it.thefedex87.auth.data

import io.ktor.client.HttpClient
import it.thefedex87.auth.domain.AuthRepository
import it.thefedex87.core.data.networking.post
import it.thefedex87.core.domain.AuthInfo
import it.thefedex87.core.domain.SessionStorage
import it.thefedex87.core.domain.util.DataError
import it.thefedex87.core.domain.util.EmptyResult
import it.thefedex87.core.domain.util.Result
import it.thefedex87.core.domain.util.asEmptyResult

class AuthRepositoryImpl(
    private val httpClient: HttpClient,
    private val sessionStorage: SessionStorage
) : AuthRepository {

    override suspend fun login(email: String, password: String): EmptyResult<DataError.Network> {
        val result = httpClient.post<LoginRequest, LoginResponse>(
            route = "/login",
            body = LoginRequest(
                email = email,
                password = password
            )
        )
        if(result is Result.Success) {
            sessionStorage.set(
                AuthInfo(
                    accessToken = result.data.accessToken,
                    refreshToken = result.data.refreshToken,
                    userId = result.data.userId
                )
            )
        }
        return result.asEmptyResult()
    }

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