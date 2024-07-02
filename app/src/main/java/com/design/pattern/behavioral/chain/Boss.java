package com.design.pattern.behavioral.chain;

/**
 * author: Frankie
 * Date: 2024/7/2
 * Description:
 */
public class Boss extends Staff {
    @Override
    void dealEvent(int money) {
        if (money < 50000) {
            //我的心在滴血，还有下次扣工资
            System.out.println("Boss:My heart is bleeding, and I will deduct your salary next time");
        } else {
            //兄弟，你被开除了
            System.out.println("Boss:u are fired!");
        }
    }
}
