package com.design.pattern.observer.example1;

/**
 * 股票被观察者  :股票本身
 */
public class Shares extends SharesSubject {

    @Override
    public void change(String str) {
        if (observers.size() == 0) {
            return;
        }
        for (SharesObserver sharesObserver :
                observers) {
            sharesObserver.doAction(str);
        }
    }
}
