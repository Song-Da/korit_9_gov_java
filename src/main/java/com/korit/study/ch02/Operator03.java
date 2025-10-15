package com.korit.study.ch02;

public class Operator03 {
    public static void main(String[] args) {
//      논리 연산자 (true false, 0 1)
//      || or연산자 (합)(둘 중에 하나만이라도 충족되면 true 가 됨)
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = b1 || b2;
        System.out.println(b3);
        b3 = b1 || true;
        System.out.println(b3);

//      && and연산자 (곱)(둘 중에 하나라도 불총족 시 false 가 됨)
        boolean b4 = b1 && b2;
        b4 = b1 && true;
        b4 = true && true;
        System.out.println(b4);

//      ! not연산자 (부정)(true 면은 false 로 false 면 true 로)
        boolean b5 = b1 && true;
        b5 = !b5;
        System.out.println(b5);
        System.out.println(!(true && true));
    }
}
