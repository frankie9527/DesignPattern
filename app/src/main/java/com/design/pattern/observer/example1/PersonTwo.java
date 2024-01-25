package com.design.pattern.observer.example1;

import com.design.pattern.PrintLog;

public class PersonTwo implements SharesObserver {
    @Override
    public void doAction(String str) {
        PrintLog.getInstance().show("PersonTwo 股票变了，卖出" + " input " + str);
    }
}
