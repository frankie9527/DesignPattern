package com.design.pattern.behavioral.strategy;

import com.design.pattern.PrintLog;

/**
 * author: Frankie
 * Date: 2024/6/26
 * Description: 策略模式个人总结就是面向接口编程，定义一个物件。
 * 这个物件由多个功能组成，每个功能可以选择不同配置。每个配置都是面向于接口
 * 只需要实现对应接口即可
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Car e300 = new Benz("e300")
                .setEngine(new V8Engine())
                .setTire(new MqlTire())
                .setPrice(new BenZPrice());
        PrintLog.getInstance().show(e300.name);

        e300.engine();
        e300.tire();
        e300.price();
    }
}
