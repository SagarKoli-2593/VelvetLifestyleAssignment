package com.example.velvetlifestyleassignment.components

import com.example.velvetlifestyleassignment.retrofit.usecases.MasterDataUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideMasterDataUseCase(): MasterDataUseCase {
        return MasterDataUseCase()
    }
}