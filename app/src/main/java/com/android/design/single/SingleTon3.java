package com.android.design.single;

import com.android.design.utils.ToastUtils;
/**
 * 静态内部类
 * */
class SingleTon3 {
    private static class SingletonHolder{
        private static final SingleTon3 instance = new SingleTon3();
    }
    private SingleTon3(){}
    public static final SingleTon3 getInsatance(){
        return SingletonHolder.instance;
    }
    public void show(){
        ToastUtils.show("SingleTon3");
    }
}
