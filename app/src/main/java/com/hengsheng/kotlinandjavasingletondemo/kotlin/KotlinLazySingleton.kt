package com.hengsheng.kotlinandjavasingletondemo.kotlin

import android.util.Log

/**
 * Created by zhangbao on 2018/10/23.
 * kotlin懒汉式单例模式
 */
class KotlinLazySingleton {
    private val TAG: String = "TestManager"
    //原生写法
    companion object {
        //LazyThreadSafetyMode.NONE线程不安全
        val SINGLETON by lazy(LazyThreadSafetyMode.NONE) {
            KotlinLazySingleton()
        }
    }

    //翻译java写法
//    private var SINGLETON_2 :KotlinLazySingleton? = null
//
//    fun getInstance():KotlinLazySingleton {
//        if (SINGLETON_2 == null) {
//            SINGLETON_2 = KotlinLazySingleton()
//        }
//        return SINGLETON_2!!
//    }

    fun init() {
        Log.e(TAG,"KotlinLazySingleton执行了init()")
    }
}