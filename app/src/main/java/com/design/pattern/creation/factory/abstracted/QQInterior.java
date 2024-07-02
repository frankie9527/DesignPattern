package com.design.pattern.creation.factory.abstracted;


public class QQInterior implements IInterior {
    @Override
    public void describe() {
        System.out.println("QQ 亲民版");
    }

    @Override
    public void seatParameter() {

    }

    @Override
    public boolean haveSunroof() {
        return false;
    }
}
