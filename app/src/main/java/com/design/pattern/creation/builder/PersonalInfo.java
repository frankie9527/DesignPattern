package com.design.pattern.creation.builder;

import android.support.annotation.NonNull;

public class PersonalInfo {
    private final String name;
    private final int age;
    private final String phoneNum;
    private final String inCome;

    PersonalInfo(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phoneNum = builder.phoneNum;
        this.inCome = builder.inCome;
    }

    public static final class Builder {
        private String name;
        private int age;
        private String phoneNum;
        private String inCome;

        public Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder personAge(int age) {
            this.age = age;
            return this;
        }

        public Builder phoneNum(String num) {
            this.phoneNum = num;
            return this;
        }

        public Builder inCome(String inCome) {
            this.inCome = inCome;
            return this;
        }

        public PersonalInfo build() {
            return new PersonalInfo(this);
        }
    }

    @NonNull
    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", inCome='" + inCome + '\'' +
                '}';
    }
}
