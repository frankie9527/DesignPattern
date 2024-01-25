package com.design.pattern.observer.example2;

import com.design.pattern.PrintLog;

public class Hospital implements NotificationCenter.NotificationCenterDelegate {
    @Override
    public void didReceivedNotification(String str) {
        PrintLog.getInstance().show("Hospital didReceivedNotification "+str);
    }
}