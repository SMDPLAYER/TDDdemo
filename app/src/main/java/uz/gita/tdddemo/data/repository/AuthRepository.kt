package uz.gita.tdddemo.data.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.tdddemo.data.model.ResultData
import uz.gita.tdddemo.data.model.UserData

interface AuthRepository {
    fun isSigned(): Flow<Boolean>
    fun signUp(userData: UserData): Flow<ResultData<Unit>>
    fun signIn(phone: String, password: String): Flow<Unit>
}