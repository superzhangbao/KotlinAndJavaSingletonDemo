package com.hengsheng.kotlinandjavasingletondemo.kotlin

import android.util.Log

/**
 * Created by zhangbao on 2018/10/23.
 * kotlin内部类单例模式
 */
class KotlinInnerSingleton {
    private val TAG:String = "KotlinInnerSingleton"
    companion object {
        fun getInstance() = Holder.SINGLETON
    }

    private object Holder {
        val SINGLETON = KotlinInnerSingleton()
    }

    fun init() {
        Log.e(TAG,"KotlinInnerSingleton执行了init()")
    }
}