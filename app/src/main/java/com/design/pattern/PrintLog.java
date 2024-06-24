package com.design.pattern;


/**
 * =
 * getInstance
 * 静态内部类
 * */
public class PrintLog {
    private static class SingletonHolder{
        private static final PrintLog instance = new PrintLog();
    }
    private PrintLog(){}
    public static PrintLog getInstance(){
        return SingletonHolder.instance;
    }

    public void show(String str){
        System.out.println(str);
    }
}
