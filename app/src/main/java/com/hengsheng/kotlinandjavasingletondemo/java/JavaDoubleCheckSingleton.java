package com.hengsheng.kotlinandjavasingletondemo.java;

import android.annotation.SuppressLint;
import android.util.Log;

/**
 * Created by zhangbao on 2018/10/23.
 * java双重检测式单例模式
 * 优点：第一次获取的时候才会加锁
 */

public class JavaDoubleCheckSingleton {
    private static final String TAG = "JavaDoubleCheckSingleton";

    //第一步：私有构造
    private JavaDoubleCheckSingleton() {}

    //第二步：创建静态对象
    private static volatile JavaDoubleCheckSingleton SINGLETON;

    //第三步：对外公开获取方法
    public static JavaDoubleCheckSingleton getInstance() {
        if (SINGLETON == null) {
            synchronized (JavaDoubleCheckSingleton.class) {
                if (SINGLETON == null) {
                    SINGLETON = new JavaDoubleCheckSingleton();
                }
            }
        }
        return SINGLETON;
    }

    @SuppressLint("LongLogTag")
    public void init() {
        Log.e(TAG,"JavaDoubleCheckSingleton执行了init()");
    }
}
