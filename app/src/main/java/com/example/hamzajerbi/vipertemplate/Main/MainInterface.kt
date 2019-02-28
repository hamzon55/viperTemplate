package com.example.hamzajerbi.vipertemplate.Main

import android.content.Context
import com.example.hamzajerbi.vipertemplate.MainActivity

interface MainPresenterToViewInterface {
    val  contxt: Context
    var presenter: MainViewToPresenterInterface?
}

interface MainInteractorToPresenterInterface {


}

interface MainPresentorToInteractorInterface {
    var presenter: MainInteractorToPresenterInterface?


}

interface MainViewToPresenterInterface {
    var view: MainPresenterToViewInterface?
    var interector: MainPresentorToInteractorInterface?
    var router: MainPresenterToRouterInterface?
    fun updateView()


}

interface MainPresenterToRouterInterface {
    companion object {
        fun configure(activity: MainActivity) {}
    }


}