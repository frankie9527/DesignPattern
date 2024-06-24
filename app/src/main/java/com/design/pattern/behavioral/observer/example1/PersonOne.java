package com.design.pattern.behavioral.observer.example1;

import com.design.pattern.PrintLog;

public class PersonOne implements SharesObserver {
    @Override
    public void doAction(String str) {
        PrintLog.getInstance().show("PersonOne 股票变了，买进"+" input "+str);
    }
}
