package com.design.pattern.behavioral.chain;

/**
 * author: Frankie
 * Date: 2024/7/2
 * Description:
 */
public class FactoryDirector  extends Staff{
    @Override
    void dealEvent(int money) {
        if (money < 20000) {
            //兄弟，你这次让我有点难搞！千万别有下次了！！！
            System.out.println("FactoryDirector:Brother, you've made it a bit difficult for me this time!");
        } else {
            //大哥，这是只有老板才能拍板了！
            System.out.println("FactoryDirector:Brother, only the boss can make the decision!");
            superior.dealEvent(money);
        }
    }
}