package com.design.pattern.structural.adapter;

import com.design.pattern.PrintLog;

/**
 * author: Frankie
 * Date: 2024/6/25
 * Description:
 */
public class ChinaPowerStation {
    public int providePower(){
        PrintLog.getInstance().show("供电站提供220V");
        return 220;
    }
}
