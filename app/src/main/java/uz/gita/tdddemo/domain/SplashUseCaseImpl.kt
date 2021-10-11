package uz.gita.tdddemo.domain

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.gita.tdddemo.data.repository.AuthRepository
import javax.inject.Inject

class SplashUseCaseImpl @Inject constructor(
    private val authRepository: AuthRepository
) : SplashUseCase {
    override fun isSigned(): Flow<Boolean> = authRepository.isSigned()
}