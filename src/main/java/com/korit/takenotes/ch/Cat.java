package com.korit.takenotes.ch;

/**
 * getter 은 원래 있는 값을 빼올 수 있게 만듦. 싱글톤 사용 시 getter 설정을
 * 해서 private 를 걸어둔 걸 getter 덕분에 가져올 수 있게 만들어 줌.
 */

public class Cat {
    String name;
    int age;
    String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void meow() {
        System.out.println("냐옹");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
