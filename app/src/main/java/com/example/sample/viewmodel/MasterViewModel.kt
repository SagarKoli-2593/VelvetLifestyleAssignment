package com.example.velvetlifestyleassignment.viewmodel

import android.util.Log
import com.example.velvetlifestyleassignment.components.DaggerUseCaseComponent
import com.example.velvetlifestyleassignment.retrofit.domainDto.ProductDTO
import com.example.velvetlifestyleassignment.retrofit.domainDto.SectionDTO
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MasterViewModel : BaseViewModel() {

    var masterDataUseCase = DaggerUseCaseComponent.builder().build().getMaserDataUseCase()

    fun getMasterData() {
        compositeDisposable.add(
            masterDataUseCase.getMasterData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({


                    Log.d("MasterViewModel", "getMasterData :: Success")
                    Log.d("MasterViewModel", "getMasterData :: $it")

                }, {
                    Log.d("MasterViewModel", "getMasterData :: ERROR")
                    Log.d("MasterViewModel", "getMasterData_E :: ${it.localizedMessage}")
                    it.printStackTrace()
                }
                )
        )
    }
}