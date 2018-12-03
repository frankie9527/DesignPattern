package com.android.design.single;

import com.android.design.utils.ToastUtils;

/**
 * 懒汉式单例设计模式
 * 双重锁懒汉设计模式
 */
class SingleTon2 {
    private static SingleTon2 ourInstance = null;

    static SingleTon2 getInstance() {
        if (ourInstance == null){
            synchronized (SingleTon2.class) {
                if (ourInstance == null) {
                    ourInstance = new SingleTon2();
                }
            }
        }

        return ourInstance;
    }

    private SingleTon2() {
    }

    public void show() {
        ToastUtils.show("SingleTon2");
    }
}
