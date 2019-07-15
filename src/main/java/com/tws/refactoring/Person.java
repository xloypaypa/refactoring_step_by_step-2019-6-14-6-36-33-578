package com.tws.refactoring;

public class Person {

    private String name;

    public void call(Person someone) {
        System.out.println(this.name + " call " + someone.name);
    }
}
