package com.design.pattern.creation.factory.simple;

import com.design.pattern.PrintLog;

public class QQCar implements Car {
    @Override
    public void price() {
        PrintLog.getInstance().show("qq car $3000");
    }
}
