package com.design.pattern.behavioral.strategy;

/**
 * author: Frankie
 * Date: 2024/6/27
 * Description:
 */
public abstract class Car {
    public String name;
    public IEngine engine;
    public ITire tire;
    public IPrice price;

    public Car setEngine(IEngine engine) {
        this.engine = engine;
        return this;
    }

    public Car setTire(ITire tire) {
        this.tire = tire;
        return this;
    }

    public Car setPrice(IPrice price) {
        this.price = price;
        return this;
    }


    public void engine() {
        engine.engine();
    }

    public void tire() {
        tire.tire();
    }

    public void price() {
        price.price();
    }
}
