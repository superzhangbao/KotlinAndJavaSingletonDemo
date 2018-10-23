package com.hengsheng.kotlinandjavasingletondemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hengsheng.kotlinandjavasingletondemo.java.*
import com.hengsheng.kotlinandjavasingletondemo.kotlin.*

/**
 * java和kotlin单例模式
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //饿汉式
        JavaHungrySingleton.getInstance().init()
        KotlinHungrySingleton.init()
        //懒汉式
        JavaLazySingleton.getInstance().init()
        KotlinLazySingleton.SINGLETON.init()
        //同步锁式
        JavaSyncSingleton.getInstance().init()
        KotlinSyncSingleton.getInstance().init()
        //双重检测式
        JavaDoubleCheckSingleton.getInstance().init()
        KotlinDoubleCheckSingleton.SINGLETON.init()
        //静态内部类式
        JavaInnerStaticSingleton.getInstance().init()
        KotlinInnerSingleton.getInstance().init()
    }
}
