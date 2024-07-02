package com.design.pattern.structural.adapter;


/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class OnePlus7TPro {
    public void charging(V30Power power){
        System.out.println("7tpro 正在充电 power ="+power.providePower());
    }
}
