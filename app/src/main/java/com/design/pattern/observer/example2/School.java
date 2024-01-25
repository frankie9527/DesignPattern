package com.design.pattern.observer.example2;

import com.design.pattern.PrintLog;

public class School implements NotificationCenter.NotificationCenterDelegate {
    @Override
    public void didReceivedNotification(String str) {
        PrintLog.getInstance().show("School didReceivedNotification "+str);
    }
}
