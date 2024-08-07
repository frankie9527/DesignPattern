package com.design.pattern.structural.adapter;


/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class OnPlusAdapter implements V30Power {
    ChinaPowerStation station = null;

    public OnPlusAdapter(ChinaPowerStation station) {
        this.station=station;
    }

    @Override
    public int providePower() {
        int conversionVoltage=station.providePower()/22*3;
        System.out.println("充电头正在转化将220V电压转化为"+conversionVoltage+"V");
        return conversionVoltage;
    }
}

interface V30Power {
    int providePower();
}