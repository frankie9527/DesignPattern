package com.design.pattern.creation.builder;


import com.design.pattern.PrintLog;

public class BuilderPattern {
    public static void main(String[] args) {
        PersonalInfo person = new PersonalInfo.Builder().
                name("frankie").personAge(33).
                phoneNum("+8613668232308").inCome("¥20000").build();
        PrintLog.getInstance().show(person.toString());

    }
}
