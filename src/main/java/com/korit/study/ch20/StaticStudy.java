package com.korit.study.ch20;

public class StaticStudy {

    public int age;
    static int age2;

    public static void print(String str) { // 정적으로 쓸 수 있음.
        System.out.println("문자열 출력: " + str);
    }

    public void print2() {
        System.out.println(age2);
    }

    public static void print3() { // 충돌의 여지가 생길 수 있어서 입력 자체가 안 되는 것.
//        System.out.println(age); // 지금 여기가 어묵들어있음. << 머임이게
    }

}

/*
static 이 안 붙은 녀석들은 각각 만들어지는 것. 얘네 전체는 가지고 있는 걸 공유하고 있고 메모리 주소를 똑같은 메모리 주소를 참조하고 있음.
하지만 static 은 틀이 잡혀았어서...
인스턴스 값은 쓸 수 없다. 매개변수로 값을 전달함.
static 으로 만드르어진 공유는


 */