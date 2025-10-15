package com.korit.study.ch06;

public class Function01 {
    public static void main(String[] args) {
        int result = sum(10, 20, 30, 40); // 함수 호출!
        System.out.println(result);
    }

    static int sum(int a, int b, int c, int d) { // 자료형이 일치하기 때문에 호출된 수가 변수에 들어갈 수 있는 것
        return sum2(a, b) + sum2(c, d); // c, d 도 아래로 내려가서 덧셈이 됨. 뭘까?;;
    }

    static int sum2(int a, int b) { //
        return a + b;
    }
}
/**
 * 클래스 안에... 묶어놓은 게 함수...
 *
 * 함수의 목적
 * 1. 똑같은 계산, 로직을 정의해놓고 재사용하려고... 값만 달라지게 하려고. 재사용성
 * 2. 코드가 짜다보면 너무 길어짐. 함수는 기능이다. 기능별로 의미를 부여해서 나눌 때. 코드를
 *    깨끗하게 기능별로 분리하려고.
 *
 * static 은 일단 함수... 할 때는 꼭 붙이기만 하면 됨. static 은 메모리 고정인 거고...
 * 나중에 공용으로 쓰게 될 때 static 을 쓰는 게 좋긴 함. 이외는 자제하는 편이...
 * 리턴을 만나면 함수를 탈출한다. 원래의 호출된 위치로 돌아감.
 *
 * 매개변수를 무한대로 늘릴 수 있음 => 이 뜻은 매개변수가 없을 수도 있다.
 * void 는 함수의 리턴 자료형에 쓰는 건데... 공허하다, 없다든 듯. main 은 리턴값이 없고 그냥 실행만 하는것.
 *
 *
 *
 */