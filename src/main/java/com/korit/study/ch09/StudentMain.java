package com.korit.study.ch09;

//    <문제>
//    2명의 학생정보를 객체를 사용하여 정의하고 출력하는 프로그램을 작성하시오.

/*
이름: 김준일
나이: 32
성별: 남(true)

이름: 김준이
나이: 33
성별: 여(false)
 */

class Student{
    String name;
    int age;
    Boolean gender;

//    함수 정리
    void  printInfo(){
        System.out.println("학생 정보 출력");
        System.out.println("이름:" + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + (gender ? "남" : "여"));
    }
}

public class StudentMain {
    public static void main(String[] args) {
//        new Student(); > 하나의 자료(객체)이다.
        Student s = new Student();
        s.name = "김준일";
        s.age = 32;
        s.gender = true;
        System.out.println("이름: " + s.name);
        System.out.println("나이: " + s.age);
        System.out.println("성별: " + s.gender);

        Student s2 = new Student();
        s2.name = "김준이";
        s2.age = 33;
        s2.gender = false;
        System.out.println("이름: " + s2.name);
        System.out.println("나이: " + s2.age);
        System.out.println("성별: " + s2.gender);

//        s.printInfo랑 s2.printInfo 각각 독립된게 다름
        s.printInfo();
        s2.printInfo();
    }
}
