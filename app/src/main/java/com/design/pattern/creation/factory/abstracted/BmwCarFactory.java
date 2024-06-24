package com.design.pattern.creation.factory.abstracted;

public class BmwCarFactory implements ICarFactory{
    @Override
    public ITire createTire() {
      return  new BmwTire();
    }

    @Override
    public IInterior createInterior() {
        return new BmwInterior();
    }
}
