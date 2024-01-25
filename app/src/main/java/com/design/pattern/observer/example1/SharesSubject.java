package com.design.pattern.observer.example1;

import java.util.ArrayList;
import java.util.List;
/**
 * 股票被观察者  :股票本身
 */
public abstract class SharesSubject {
    protected List<SharesObserver> observers = new ArrayList<>();

    public void addObserver(SharesObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SharesObserver observer) {
        observers.remove(observer);
    }

   public abstract void change(String str);
}
