package com.bigbaby.congmvvm.demotest.livedata

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/8/1
 */
open class LiveDataTestActivity : FragmentActivity(){

    var liveDataViewModel : LiveDataViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        liveDataViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(LiveDataViewModel::class.java)
        
    }

}