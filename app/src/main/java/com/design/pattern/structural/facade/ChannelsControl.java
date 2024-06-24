package com.design.pattern.structural.facade;

import com.design.pattern.PrintLog;

/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class ChannelsControl {
    public void switchChannels() {
        PrintLog.getInstance().show("ChannelsControl 手指触发按键了");
        PrintLog.getInstance().show("ChannelsControl 发送红外准备切台");
        PrintLog.getInstance().show("ChannelsControl 电视收到红外信号切台成功");
        PrintLog.getInstance().show("                    ");
    }
}
