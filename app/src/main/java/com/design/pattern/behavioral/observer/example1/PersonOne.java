package com.design.pattern.behavioral.observer.example1;


public class PersonOne implements SharesObserver {
    @Override
    public void doAction(String str) {
        System.out.println("PersonOne 股票变了，买进"+" input "+str);
    }
}
