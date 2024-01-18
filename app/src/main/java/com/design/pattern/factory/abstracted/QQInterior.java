package com.design.pattern.factory.abstracted;

import com.design.pattern.PrintLog;

public class QQInterior implements IInterior {
    @Override
    public void describe() {
        PrintLog.getInstance().show("QQ 亲民版");
    }

    @Override
    public void seatParameter() {

    }

    @Override
    public boolean haveSunroof() {
        return false;
    }
}
