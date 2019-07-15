package com.tws.refactoring;

import java.io.Serializable;

public class Driver implements Serializable {
    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
