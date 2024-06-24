package com.design.pattern.structural.facade;


/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class FacadePattern {
    public static void main(String[] args) {
        HwTV tv = new HwTV();
        tv.PowerOn();
        tv.switchChannels();
        tv.PowerOff();
    }
}
