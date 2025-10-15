package com.korit.study.ch10;

public class ClassE {
    String name;
    int age;
    String address;

    public ClassE(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

//    public String toString() {
//        return "name = " + name + ", age = " + age + ", address = " + address;
//    }

    @Override
    public String toString() {
        return "ClassE{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    // toString()

}
