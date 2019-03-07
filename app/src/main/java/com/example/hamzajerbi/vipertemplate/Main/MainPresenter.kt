package com.example.hamzajerbi.vipertemplate.Main

class MainPresenter : MainViewToPresenterInterface, MainInteractorToPresenterInterface {



    override var view: MainPresenterToViewInterface? = null
    override var interector: MainPresentorToInteractorInterface? = null
    override var router: MainPresenterToRouterInterface? = null

    override fun requestMain() {
        val view = view ?: return
        interector?.fetchMain(view.contxt)
    }
    override fun mainFetched(argument: MainEntities) {
        view?.showMain(argument.list)

    }
}
