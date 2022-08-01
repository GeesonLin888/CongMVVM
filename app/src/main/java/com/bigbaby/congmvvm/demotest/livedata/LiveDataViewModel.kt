package com.bigbaby.congmvvm.demotest.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/1
 */
open class LiveDataViewModel : ViewModel() {

    var liveData : MutableLiveData<String>? = null

    fun getData() : MutableLiveData<String> {
        if (liveData == null) {
            liveData = MutableLiveData<String>()
        }
        return liveData as MutableLiveData<String>
    }
}