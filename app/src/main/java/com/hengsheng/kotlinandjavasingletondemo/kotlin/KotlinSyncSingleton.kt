package com.hengsheng.kotlinandjavasingletondemo.kotlin

import android.util.Log

/**
 * Created by zhangbao on 2018/10/23.
 * kotlin同步锁单例模式
 */
class KotlinSyncSingleton {
    private val TAG:String = "KotlinSyncSingleton"

    companion object {
        private var SINGLETON:KotlinSyncSingleton? = null

        //在kotlin中，使用注释的方式加锁
        @Synchronized
        fun getInstance():KotlinSyncSingleton {
            if (SINGLETON == null) {
                SINGLETON = KotlinSyncSingleton()
            }
            return SINGLETON!!
        }
    }

    fun init() {
        Log.e(TAG,"KotlinSyncSingleton执行了init()")
    }
}