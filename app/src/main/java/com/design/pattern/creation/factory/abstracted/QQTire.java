package com.design.pattern.creation.factory.abstracted;

import com.design.pattern.PrintLog;

public class QQTire implements ITire{
    @Override
    public void make() {
        PrintLog.getInstance().show("性价比轮胎");
    }

    @Override
    public void price() {

    }

    @Override
    public void performance() {

    }
}
