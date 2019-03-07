package com.example.hamzajerbi.vipertemplate.Main

import android.content.Context
import com.example.hamzajerbi.vipertemplate.Main.Adapter.MainAdapterModel

interface MainPresenterToViewInterface {
    val contxt: Context
    var presenter: MainViewToPresenterInterface?
    fun showMain(argument: ArrayList<MainAdapterModel>)
}

interface MainInteractorToPresenterInterface {
    fun mainFetched(argument: MainEntities)
}

interface MainPresentorToInteractorInterface {
    var presenter: MainInteractorToPresenterInterface?
    fun fetchMain(context: Context)
}

interface MainViewToPresenterInterface {
    var view: MainPresenterToViewInterface?
    var interector: MainPresentorToInteractorInterface?
    var router: MainPresenterToRouterInterface?
    fun requestMain()
}

interface MainPresenterToRouterInterface {
    companion object {
        fun configure(activity: MainActivity) {}
    }
}