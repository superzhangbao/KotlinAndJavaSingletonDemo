package com.hengsheng.kotlinandjavasingletondemo.kotlin

import android.util.Log

/**
 * Created by zhangbao on 2018/10/23.
 * kotlin饿汉式单例实现方式
 */
object KotlinHungrySingleton {
    private val TAG: String = "KotlinHungrySingleton"
    fun init() {
        Log.e(TAG,"KotlinHungrySingleton执行了init()")
    }
}