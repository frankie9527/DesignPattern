package com.design.pattern.structural.facade;


/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class PowerControl {
    public void PowerOn(){
        System.out.println("PowerControl 电源接通");
        System.out.println("PowerControl Bootloader");
        System.out.println("PowerControl Linux 内核启动");
        System.out.println("PowerControl Android 系统启动");
        System.out.println("PowerControl 开机完成");
        System.out.println("                    ");
    }
    public void PowerOff() {
        System.out.println("PowerControl 用户点击关机");
        System.out.println("PowerControl 系统收到关机广播");
        System.out.println("PowerControl 关闭应用程序");
        System.out.println("PowerControl 关闭硬件");
        System.out.println("PowerControl 关机成功");
        System.out.println("                    ");
    }
}
