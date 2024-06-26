package com.design.pattern.behavioral.command;

/**
 * author: Frankie
 * Date: 2024/6/27
 * Description:
 * 个人总结，命令模式虽然是行为模式，但是还是基于接口编程。用集合存放 命令的接口
 * 当用户下发命令的时候，通过key 找到对应的接口！执行相应的方法
 */
public class CommandPattern {

    public static void main(String[] args) {
        TvPanel tvPanel = new TvPanel();
        Power power=new Power();
        SwitchChannel channel=new SwitchChannel();
        Volume volume=new Volume();
        tvPanel.setCommand(0,new PowerOnCommand(power));
        tvPanel.setCommand(1,new PowerOffCommand(power));
        tvPanel.setCommand(2,new SwitchChannelCommand(channel));
        tvPanel.setCommand(3,new VolumeIncreaseCommand(volume));
        tvPanel.setCommand(4,new VolumeReductionCommand(volume));

        tvPanel.onKeyPressed(0);
        tvPanel.onKeyPressed(1);
        tvPanel.onKeyPressed(2);
        tvPanel.onKeyPressed(3);
        tvPanel.onKeyPressed(4);
    }
}
