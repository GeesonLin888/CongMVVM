package com.bigbaby.congmvvm.demotest.databinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bigbaby.base.log.LogUtils
import com.bigbaby.congmvvm.R
import com.bigbaby.congmvvm.databinding.ActivityDemoTestBinding

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/28
 */
open class DemoTestActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDemoTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_test)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_demo_test)
        binding.tvContent.text = "This is Databinding"
        LogUtils.d(binding.tvContent.text.toString())
    }

}