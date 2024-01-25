package com.design.pattern.observer.example2;

import com.design.pattern.observer.example1.SharesObserver;

import java.util.ArrayList;
import java.util.List;

public class NotificationCenter {
    private static final class OurInstanceHolder {
        static final NotificationCenter ourInstance = new NotificationCenter();
    }

    public static NotificationCenter getInstance() {

        return NotificationCenter.OurInstanceHolder.ourInstance;
    }

    private NotificationCenter() {
    }

    public interface NotificationCenterDelegate {
        void didReceivedNotification(String str);
    }

    protected List<NotificationCenterDelegate> observers = new ArrayList<>();

    public void addObserver(NotificationCenterDelegate observer) {
        observers.add(observer);
    }

    public void removeObserver(NotificationCenterDelegate observer) {
        observers.remove(observer);
    }

    public void postNotificationName(String str) {
        if (observers.size() == 0) {
            return;
        }
        for (NotificationCenterDelegate notificationCenterDelegate :
                observers) {
            notificationCenterDelegate.didReceivedNotification(str);
        }
    }
}
