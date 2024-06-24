package com.design.pattern.structural.facade;

/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class HwTV {
    PowerControl powerControl;
    ChannelsControl channelsControl;

    public HwTV() {
        powerControl = new PowerControl();
        channelsControl = new ChannelsControl();
    }

    public void PowerOn() {
        powerControl.PowerOn();
    }

    public void PowerOff() {
        powerControl.PowerOff();
    }

    public void switchChannels() {
        channelsControl.switchChannels();
    }


}
