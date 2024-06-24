package com.design.pattern.structural.adapter;


/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class AdapterPattern {
    public static void main(String[] args){
        OnePlus7TPro plus7TPro=new OnePlus7TPro();
        OnPlusAdapter adapter=new OnPlusAdapter(new ChinaPowerStation());
        plus7TPro.charging(adapter);
    }
}
