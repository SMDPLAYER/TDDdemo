package uz.gita.tdddemo.presenter

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface SplashViewModel {
    val openLoginFlow : Flow<Unit>
    val openMainFlow : Flow<Unit>
}