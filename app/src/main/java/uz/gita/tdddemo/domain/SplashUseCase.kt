package uz.gita.tdddemo.domain

import kotlinx.coroutines.flow.Flow

interface SplashUseCase {
    fun isSigned(): Flow<Boolean>
}