package com.korit.study.ch06;

public class Function03 {
    public static void main(String[] args) {
        int r1 = sum(1);
        System.out.println(r1);

        int r2 = sum(10.5);
        System.out.println(r2);

        int r3 = sum(10, 2.5);
        System.out.println(r3);

        int r4 = sum(2.5, 20);
        System.out.println(r4);

    }

    static int sum(int n) {
        return n + 10;
    }

    static int sum(double n) { // 이름을 달리 하는 건 새로 맘드는 거고 타입을 달리해야 오버로딩!!
        return (int) (n + 20); // 리턴 타입이 같아도 오버로딩이 됨. 함수 정의에서 매개변수의 자료형만 달라짐. 안의 기능은 달라졌지만.
    }

    static int sum(int n1, double n2) { // 매개변수의 개수가 달라지니까 이것도 된다.
        return (int) (n1 + n2);
    }

    static int sum(double n1,int n2) { // 자료형의 순서가 달라서 가능함. n1 과 n2 흫 뤼릐 자료형 위치롸 반대되게 바꿈.
        return (int) (n1 + n2);
    }



}
