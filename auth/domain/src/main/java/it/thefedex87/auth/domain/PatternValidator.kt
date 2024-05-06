package it.thefedex87.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}