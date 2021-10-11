package uz.gita.tdddemo.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.tdddemo.domain.SplashUseCase
import uz.gita.tdddemo.domain.SplashUseCaseImpl

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {
    @Binds
    fun bindSplashUseCase(impl: SplashUseCaseImpl): SplashUseCase
}