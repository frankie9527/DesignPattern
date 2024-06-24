package com.design.pattern.creation.factory.abstracted;

public class QQCarFactory implements ICarFactory{
    @Override
    public ITire createTire() {
       return new QQTire();
    }

    @Override
    public IInterior createInterior() {
        return new QQInterior();
    }
}
