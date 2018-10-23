package com.hengsheng.kotlinandjavasingletondemo.java;

import android.util.Log;

/**
 * Created by zhangbao on 2018/10/23.
 * java懒汉式单例模式
 * 优点：只有第一次使用时，才会初始化对象
 * 缺点：线程非安全，多线程中可能会出现创建多个对象
 */

public class JavaLazySingleton {
    private static final String TAG = "JavaLazySingleton";

    //第一步：私有构造
    private JavaLazySingleton(){}

    //第二步：创建私有对象成员变量
    private static JavaLazySingleton SINGLETON;

    //第三步：提供对外获取方法
    public static JavaLazySingleton getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new JavaLazySingleton();
        }
        return SINGLETON;
    }

    public void init() {
        Log.e(TAG,"JavaLazySingleton执行了init()");
    }
}
