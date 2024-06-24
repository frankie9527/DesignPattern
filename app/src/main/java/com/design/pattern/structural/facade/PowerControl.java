package com.design.pattern.structural.facade;

import com.design.pattern.PrintLog;

/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class PowerControl {
    public void PowerOn(){
        PrintLog.getInstance().show("PowerControl 电源接通");
        PrintLog.getInstance().show("PowerControl Bootloader");
        PrintLog.getInstance().show("PowerControl Linux 内核启动");
        PrintLog.getInstance().show("PowerControl Android 系统启动");
        PrintLog.getInstance().show("PowerControl 开机完成");
        PrintLog.getInstance().show("                    ");
    }
    public void PowerOff() {
        PrintLog.getInstance().show("PowerControl 用户点击关机");
        PrintLog.getInstance().show("PowerControl 系统收到关机广播");
        PrintLog.getInstance().show("PowerControl 关闭应用程序");
        PrintLog.getInstance().show("PowerControl 关闭硬件");
        PrintLog.getInstance().show("PowerControl 关机成功");
        PrintLog.getInstance().show("                    ");
    }
}
