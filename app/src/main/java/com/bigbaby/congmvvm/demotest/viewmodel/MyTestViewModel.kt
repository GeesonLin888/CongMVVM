package com.bigbaby.congmvvm.demotest.viewmodel

import androidx.lifecycle.ViewModel
import com.bigbaby.base.log.LogUtils

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/1
 */
open class MyTestViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
        LogUtils.d("MyTestViewModel onCleared")
    }

}