package com.design.pattern.behavioral.observer;


import com.design.pattern.PrintLog;
import com.design.pattern.behavioral.observer.example1.PersonOne;
import com.design.pattern.behavioral.observer.example1.PersonTwo;
import com.design.pattern.behavioral.observer.example1.Shares;
import com.design.pattern.behavioral.observer.example2.Hospital;
import com.design.pattern.behavioral.observer.example2.NotificationCenter;
import com.design.pattern.behavioral.observer.example2.School;

import java.util.Scanner;

public class ObserverPattern {
    public static void main(String[] args) {
        PrintLog.getInstance().show("请输入一串字符");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //通知数据输入了

        //例子1:股票涨跌，人们进行买进卖出
        Shares shares=new Shares();
        shares.addObserver(new PersonOne());
        shares.addObserver(new PersonTwo());
        shares.change(str);

        PrintLog.getInstance().show("     ");
        //例子2: 自然灾害来临收到紧急通知
        NotificationCenter.getInstance().addObserver(new School());
        NotificationCenter.getInstance().addObserver(new Hospital());
        NotificationCenter.getInstance().postNotificationName("地震来了 "+str);
    }
}
