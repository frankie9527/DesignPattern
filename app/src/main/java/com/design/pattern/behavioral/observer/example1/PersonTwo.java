package com.design.pattern.behavioral.observer.example1;


public class PersonTwo implements SharesObserver {
    @Override
    public void doAction(String str) {
        System.out.println("PersonTwo 股票变了，卖出" + " input " + str);
    }
}
