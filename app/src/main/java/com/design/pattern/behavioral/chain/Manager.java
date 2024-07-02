package com.design.pattern.behavioral.chain;

/**
 * author: Frankie
 * Date: 2024/7/2
 * Description:
 */
public class Manager  extends Staff{
    @Override
    void dealEvent(int money) {
        if (money < 5000) {
            //这次花销有点高，下次注意了！
            System.out.println("Manager:The cost this time is a bit high, please pay attention next time");
        } else {
            //这个让厂长做决定吧
            System.out.println("Manager:Let's let the factory director make the decision");
            superior.dealEvent(money);
        }
    }
}