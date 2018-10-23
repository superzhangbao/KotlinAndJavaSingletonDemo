package com.hengsheng.kotlinandjavasingletondemo.java;

import android.util.Log;

/**
 * Created by zhangbao on 2018/10/23.
 * 饿汉式
 * 优点：只有第一次使用时，才会初始化对象
 * 缺点：线程非安全，多线程中可能会出现创建多个对象
 */

public class JavaHungrySingleton {
    private static final String TAG = "JavaHungrySingleton";

    //第一步：私有构造
    private JavaHungrySingleton() {
    }

    //第二步：私有静态对象
    private static JavaHungrySingleton SINGLETON = new JavaHungrySingleton();

    //第三步：提供对外获取方法
    public static JavaHungrySingleton getInstance() {
        return SINGLETON;
    }

    public void init() {
        Log.e(TAG,"JavaHungrySingleton执行了init()");
    }
}
