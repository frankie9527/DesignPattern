package com.design.pattern.factory.abstracted;

import com.design.pattern.PrintLog;

public class BmwTire implements ITire{
    @Override
    public void make() {
        PrintLog.getInstance().show("米其林联合制造");
    }

    @Override
    public void price() {

    }

    @Override
    public void performance() {

    }
}
