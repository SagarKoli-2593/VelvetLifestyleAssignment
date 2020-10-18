package com.example.velvetlifestyleassignment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.AndroidInjection

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {

    protected val binding: T by lazy { DataBindingUtil.setContentView(this, layoutId) as T }
    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(layoutId)

        init()
    }
    abstract fun init()
}