package com.korit.study.ch24;

import java.util.Objects;

public class Writer {
    private String username;
    private int age;

    public Writer() { // 깡통값
    }

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Writer writer)) return false;
        return age == writer.age && Objects.equals(username, writer.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age);
    }
}
