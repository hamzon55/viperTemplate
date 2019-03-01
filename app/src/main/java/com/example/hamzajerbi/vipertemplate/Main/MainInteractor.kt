package com.example.hamzajerbi.vipertemplate.Main

import android.content.Context
import com.example.hamzajerbi.vipertemplate.Main.Adapter.MainAdapterModel

class MainInteractor : MainPresentorToInteractorInterface {
    override fun fetchMain(context: Context) {
        val service = ArrayList<MainAdapterModel>()
        service.add(MainAdapterModel("Text"))
        val entity  = MainEntities(list = service)
        presenter?.serviceFetched(entity)

    }

    override var presenter: MainInteractorToPresenterInterface? = null
}