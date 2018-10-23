package com.hengsheng.kotlinandjavasingletondemo.java;

import android.annotation.SuppressLint;
import android.util.Log;

/**
 * Created by zhangbao on 2018/10/23.
 * java静态内部类单例模式
 * 优点：不仅满足了懒加载、线程安全，代码也非常少
 */

public class JavaInnerStaticSingleton {
    private static final String TAG = "JavaInnerStaticSingleton";

    private JavaInnerStaticSingleton() {}

    private static class Holer {
        private static JavaInnerStaticSingleton SINGLETON = new JavaInnerStaticSingleton();
    }

    public static JavaInnerStaticSingleton getInstance() {
        return Holer.SINGLETON;
    }

    @SuppressLint("LongLogTag")
    public void init() {
        Log.e(TAG,"JavaInnerStaticSingleton执行了init()");
    }
}
