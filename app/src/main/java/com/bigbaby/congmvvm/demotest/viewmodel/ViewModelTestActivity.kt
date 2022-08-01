package com.bigbaby.congmvvm.demotest.viewmodel

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.bigbaby.base.log.LogUtils

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/1
 */
open class ViewModelTestActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel : MyTestViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MyTestViewModel::class.java)
        LogUtils.d("ViewModelTestActivity onCreate viewModel = " + viewModel.hashCode())
    }

    override fun onStop() {
        super.onStop()
        val viewModel : MyTestViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MyTestViewModel::class.java)
        LogUtils.d("ViewModelTestActivity onStop viewModel = " + viewModel.hashCode())
    }

    override fun onDestroy() {
        super.onDestroy()
        val viewModel : MyTestViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MyTestViewModel::class.java)
        LogUtils.d("ViewModelTestActivity onDestroy viewModel = " + viewModel.hashCode())
    }

}