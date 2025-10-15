package com.korit.study.ch06;

public class 연습문제2 {
    public static void main(String[] args) {
        int r1 = add(1, 2);
        System.out.println(r1);

        int r2 = add(1.1, 2.2);
        System.out.println(r2);

        int r3 = add(1, 2, 3);
        System.out.println(r3);

        printInfo("김준일");
        printInfo("김준일", 32);
        printInfo("김준일", 32, "IT학원");
    }

    // 정수 2개를 더하는 함수
    public static int add(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(double a, double b) {
        return (int) (a + b);
    }
    /*
    만약에 add 를 double 자료형으로 하고 return 을 int 로 하면.. 아예 다른 값이 나온다.
    왜냐하면 다운 캐스팅을 해도 리턴이 될 때 실수형으로 다시 업캐스팅이 되기 때문에.
     */


    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c) {
        return a + b + c;
    }


    // 이름만 출력하는 함수
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    public static void printInfo(String name, int age) {
//        System.out.println("이름: " + name);
        printInfo(name);
        System.out.println("나이: " + age);
    }

    public static void printInfo(String name, int age, String schoolName) {
//        System.out.println("이름: " + name);
//        System.out.println("나이: " + age);
        printInfo(name, age);
        System.out.println("학교: " + schoolName);
    }

    // 이름과 나이를 출력하는 함수를 오버로딩으로 작성하세요
    // 이름, 나이, 학교를 출력하는 함수도 오버로딩으로 출력하세요

}
