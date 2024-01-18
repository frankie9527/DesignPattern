package com.design.pattern.factory.simple;

import com.design.pattern.PrintLog;
import com.design.pattern.factory.simple.Car;

public class QQCar implements Car {
    @Override
    public void price() {
        PrintLog.getInstance().show("qq car $3000");
    }
}
