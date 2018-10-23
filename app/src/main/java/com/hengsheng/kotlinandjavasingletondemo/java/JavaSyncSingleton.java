package com.hengsheng.kotlinandjavasingletondemo.java;

import android.util.Log;

/**
 * Created by zhangbao on 2018/10/23.
 * java同步锁单例模式
 * 优点：保证线程安全
 * 缺点：每次都要加锁，获取的时候不经济
 */

public class JavaSyncSingleton {

    private static final String TAG = "JavaSyncSingleton";

    //第一步：私有构造
    private JavaSyncSingleton() {}

    //第二步：创建四有对象
    private static JavaSyncSingleton SINGLETON;

    //第三步：提供对外访问方法
    public static synchronized JavaSyncSingleton getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new JavaSyncSingleton();
        }
        return SINGLETON;
    }

    public void init() {
        Log.e(TAG,"JavaSyncSingleton执行了init()");
    }
}
