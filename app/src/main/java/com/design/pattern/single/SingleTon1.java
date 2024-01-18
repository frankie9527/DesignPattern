package com.design.pattern.single;

/**
 * 饿汉式单例设计模式
 */

class SingleTon1 {
    private static final SingleTon1 ourInstance = new SingleTon1();

    static SingleTon1 getInstance() {
        return ourInstance;
    }

    private SingleTon1() {
    }

    public void show() {
        System.out.println("SingletonPattern  SingleTon1");
    }
}
