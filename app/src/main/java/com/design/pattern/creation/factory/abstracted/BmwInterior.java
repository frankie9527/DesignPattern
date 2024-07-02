package com.design.pattern.creation.factory.abstracted;


public class BmwInterior implements IInterior {
    @Override
    public void describe() {
        System.out.println("x5 豪华");
    }

    @Override
    public void seatParameter() {

    }

    @Override
    public boolean haveSunroof() {
        return true;
    }
}
