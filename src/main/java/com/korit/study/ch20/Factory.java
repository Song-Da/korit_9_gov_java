package com.korit.study.ch20;

public class Factory {
    private static int id; // static id 추가
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public Product createProduct(String name) {
        return new Product(++id, name); // ++id 추가 하면 id 가 1씩 전후 증가함
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }
}
/*
프로덕트를 건드는 게 아니라 공장들끼리 아이디를 공유해서 번호를 올려줌.
 */