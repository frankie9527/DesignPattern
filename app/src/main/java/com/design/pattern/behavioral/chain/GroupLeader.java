package com.design.pattern.behavioral.chain;

/**
 * author: Frankie
 * Date: 2024/7/2
 * Description:
 */
public class GroupLeader  extends Staff{
    @Override
    void dealEvent(int money) {
        if (money < 2000) {
            //好好干小伙子，我的位置早晚是你的
            System.out.println("GroupLeader:Work hard, your position in my position");
        } else {
            //预算超标了，我们去找经理吧
            System.out.println("GroupLeader:The budget has exceeded the limit. Let's go find the manager");
            superior.dealEvent(money);
        }
    }
}