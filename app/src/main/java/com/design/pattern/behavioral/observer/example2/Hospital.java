package com.design.pattern.behavioral.observer.example2;


public class Hospital implements NotificationCenter.NotificationCenterDelegate {
    @Override
    public void didReceivedNotification(String str) {
        System.out.println("Hospital didReceivedNotification "+str);
    }
}