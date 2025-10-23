package com.korit.study.ch24;

public class Writer {
    private String username;
    private int age;

    public Writer(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
