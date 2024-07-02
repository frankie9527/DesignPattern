package com.design.pattern.behavioral.observer.example2;


public class School implements NotificationCenter.NotificationCenterDelegate {
    @Override
    public void didReceivedNotification(String str) {
        System.out.println("School didReceivedNotification "+str);
    }
}
