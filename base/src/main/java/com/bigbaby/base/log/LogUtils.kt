package com.bigbaby.base.log

import android.util.Log

/**
 * @author: linzhicong
 * @description:
 * @date: 2022/7/28
 */
open class LogUtils {

    companion object {
        private const val TAG = "zcl--test"
        fun d(msg : String) {
            Log.d(TAG, msg)
        }
    }

}