package com.design.pattern.factory;


import com.design.pattern.PrintLog;
import com.design.pattern.factory.abstracted.BmwCarFactory;
import com.design.pattern.factory.abstracted.ICarFactory;
import com.design.pattern.factory.abstracted.QQCarFactory;
import com.design.pattern.factory.simple.CarFactory;

public class FactoryPattern {
    public static void main(String[] args) {
        //简单工厂
        CarFactory.createCar("bwm").price();
        CarFactory.createCar("qq").price();
        PrintLog.getInstance().show("------------");
        PrintLog.getInstance().show("     ");
        //抽象工厂
        ICarFactory bmw=new BmwCarFactory();
        bmw.createInterior().describe();
        bmw.createTire().make();
        PrintLog.getInstance().show("     ");
        ICarFactory qq=new QQCarFactory();
        qq.createInterior().describe();
        qq.createTire().make();
    }
}
