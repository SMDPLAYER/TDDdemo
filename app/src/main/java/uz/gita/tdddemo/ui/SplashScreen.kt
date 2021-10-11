package uz.gita.tdddemo.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.tdddemo.R
import uz.gita.tdddemo.presenter.SplashViewModel
import uz.gita.tdddemo.presenter.SplashViewModelImpl

@AndroidEntryPoint
class SplashScreen : Fragment(R.layout.screen_splash) {
    private val viewModel: SplashViewModel by viewModels<SplashViewModelImpl>()
    private val navController by lazy(LazyThreadSafetyMode.NONE) { findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.openMainFlow.onEach { navController.navigate(SplashScreenDirections.actionSplashScreenToMainScreen()) }
            .launchIn(lifecycleScope)

        viewModel.openLoginFlow.onEach { navController.navigate(SplashScreenDirections.actionSplashScreenToLoginScreen()) }
            .launchIn(lifecycleScope)
    }
}