package com.design.pattern.single;


/**
 * =
 * getInstance
 * 静态内部类
 * */
class SingleTon3 {
    private static class SingletonHolder{
        private static final SingleTon3 instance = new SingleTon3();
    }
    private SingleTon3(){}
    public static final SingleTon3 getInstance(){
        return SingletonHolder.instance;
    }

    public void show(){
        System.out.println("SingletonPattern  SingleTon3");
    }
}
