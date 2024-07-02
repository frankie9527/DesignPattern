package com.design.pattern.behavioral.chain;

/**
 * author: Frankie
 * Date: 2024/7/2
 * Description:
 */
public class ChainResponsibilityPattern {
    public static void main(String[] args) {
       GroupLeader groupLeader=new GroupLeader();
       Manager manager=new Manager();
       FactoryDirector factoryDirector=new FactoryDirector();
       Boss boss=new Boss();
       groupLeader.setSuperior(manager);
       manager.setSuperior(factoryDirector);
       factoryDirector.setSuperior(boss);


       int buyMoney=8000;
       groupLeader.dealEvent(buyMoney);
    }
}
