package com.design.pattern.factory.simple;

import com.design.pattern.PrintLog;

public class BmwCar implements Car{
    @Override
    public void price() {
        PrintLog.getInstance().show("bmw car $50000");
    }

}
