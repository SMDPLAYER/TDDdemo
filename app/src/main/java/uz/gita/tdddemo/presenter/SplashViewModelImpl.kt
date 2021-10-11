package uz.gita.tdddemo.presenter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.tdddemo.domain.SplashUseCase
import javax.inject.Inject

@HiltViewModel
class SplashViewModelImpl @Inject constructor(
    useCase: SplashUseCase
) : SplashViewModel, ViewModel() {
    override val openLoginFlow = MutableSharedFlow<Unit>()
    override val openMainFlow = MutableSharedFlow<Unit>()

    init {
        useCase.isSigned().onEach {
            if (it) {
                openMainFlow.emit(Unit)
            } else {
                openLoginFlow.emit(Unit)
            }
        }.launchIn(viewModelScope)
    }
}