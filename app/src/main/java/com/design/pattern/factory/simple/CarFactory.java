package com.design.pattern.factory.simple;

public class CarFactory {
    public static Car createCar(String type){
        if (type == null) {
            return null;
        }
        Car car = null;
        if (type.equals("bwm")) {
            car = new BmwCar();
        } else if (type.equals("qq")) {
            car = new QQCar();
        }

        return car;
    }
}
