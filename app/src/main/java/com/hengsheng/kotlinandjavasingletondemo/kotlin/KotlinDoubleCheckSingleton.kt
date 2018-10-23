package com.hengsheng.kotlinandjavasingletondemo.kotlin

import android.annotation.SuppressLint
import android.util.Log

/**
 * Created by zhangbao on 2018/10/23.
 * kotlin双重检测式单例模式
 */
class KotlinDoubleCheckSingleton {
    private val TAG:String = "KotlinDoubleCheckSingleton"
    //kotlin原生写法
    companion object {
        val SINGLETON by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            KotlinDoubleCheckSingleton()
        }
    }

    //翻译java代码写法
    /*private var SINGLETON_2:KotlinDoubleCheckSingleton? = null

    fun getInstance():KotlinDoubleCheckSingleton {
        if (SINGLETON_2 == null) {
            synchronized(KotlinDoubleCheckSingleton::class) {
                if (SINGLETON_2 == null) {
                    SINGLETON_2 = KotlinDoubleCheckSingleton()
                }
            }
        }
        return SINGLETON_2!!
    }*/

    @SuppressLint("LongLogTag")
    fun init() {
        Log.e(TAG,"KotlinDoubleCheckSingleton执行了init()")
    }
}