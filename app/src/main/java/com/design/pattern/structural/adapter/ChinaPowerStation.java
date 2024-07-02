package com.design.pattern.structural.adapter;


/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class ChinaPowerStation {
    public int providePower(){
        System.out.println("供电站提供220V");
        return 220;
    }
}
