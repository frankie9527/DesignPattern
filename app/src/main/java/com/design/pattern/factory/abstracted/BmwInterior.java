package com.design.pattern.factory.abstracted;

import com.design.pattern.PrintLog;

public class BmwInterior implements IInterior {
    @Override
    public void describe() {
        PrintLog.getInstance().show("x5 豪华");
    }

    @Override
    public void seatParameter() {

    }

    @Override
    public boolean haveSunroof() {
        return true;
    }
}
