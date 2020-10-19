package com.example.velvetlifestyleassignment.components

import com.example.velvetlifestyleassignment.retrofit.usecases.MasterDataUseCase
import dagger.Component

@Component(modules = [UseCaseModule::class])
interface UseCaseComponent {

    fun getMaserDataUseCase() : MasterDataUseCase
}