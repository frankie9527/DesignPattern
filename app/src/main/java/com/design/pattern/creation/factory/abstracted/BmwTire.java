package com.design.pattern.creation.factory.abstracted;


public class BmwTire implements ITire{
    @Override
    public void make() {
        System.out.println("米其林联合制造");
    }

    @Override
    public void price() {

    }

    @Override
    public void performance() {

    }
}
