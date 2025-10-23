package com.korit.takenotes.ch;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("나비", 3, "흰색");

        myCat.setName("톰");
        myCat.setAge(5);
        myCat.setColor("검은색");

        System.out.println("이름: " + myCat.getName());
        System.out.println("나이: " + myCat.getAge());
        System.out.println("색깔: " + myCat.getColor());
        myCat.meow();
    }
}
