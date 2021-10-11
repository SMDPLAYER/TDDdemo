package uz.gita.tdddemo.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.gita.tdddemo.data.model.ResultData
import uz.gita.tdddemo.data.model.UserData
import uz.gita.tdddemo.data.source.local.LocalStorage
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val localStorage: LocalStorage
) : AuthRepository {

    override fun isSigned(): Flow<Boolean> = flow {
        emit(localStorage.isSigned)
    }.flowOn(Dispatchers.IO)

    override fun signUp(userData: UserData): Flow<ResultData<Unit>> = flow {
        if (true){
            emit(ResultData.Success(Unit))
        } else{
            emit(ResultData.FailureMessage<Unit>("Internet yo'q"))
        }
    }.flowOn(Dispatchers.IO)

    override fun signIn(phone: String, password: String): Flow<Unit> = flow {
    }
}