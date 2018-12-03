package com.android.design.single;

import com.android.design.utils.ToastUtils;
/**
 * 饿汉式单例设计模式
 * */
class SingleTon1 {
    private static final SingleTon1 ourInstance = new SingleTon1();

    static SingleTon1 getInstance() {
        return ourInstance;
    }

    private SingleTon1() {
    }
    public void show(){
        ToastUtils.show("SingleTon1");
    }
}
