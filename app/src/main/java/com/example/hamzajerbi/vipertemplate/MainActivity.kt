package com.example.hamzajerbi.vipertemplate

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.hamzajerbi.vipertemplate.Main.MainPresenterToViewInterface
import com.example.hamzajerbi.vipertemplate.Main.MainViewToPresenterInterface

class MainActivity : AppCompatActivity(),MainPresenterToViewInterface {
    override val contxt: Context = this
    override var presenter: MainViewToPresenterInterface? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
