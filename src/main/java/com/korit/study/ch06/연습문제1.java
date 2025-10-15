package com.korit.study.ch06;

import java.util.Date;

public class 연습문제1 {
    public static void main(String[] args) {

        hello();
        helloName("김준일");
        System.out.println(sum(2));

        Date now = new Date();
        System.out.println(now.getHours());
        System.out.println(now.getMinutes());

        System.out.println(isNowTime(now.getHours(), now.getMinutes()));
    }

    // 매개변수 없음, 리턴값 없음
    // "안녕하세요!"를 출력하는 함수를 작성하세요
    public static void hello() {
        System.out.println("안녕하세요!");
    }

    // 매개변수 있음, 리턴값 없음
    // 이름을 받아서 "안녕하세요, [이름]님!"을 출력하는 함수를 작성하세요
    public static void helloName(String name) {
        System.out.println("안녕하세요, [" + name + "]님!");
    }

    // 매개변수 있음, 리턴값 있음
    // 정수를 받아서 제곱값을 반환하는 함수를 작성하세요
    public static int sum(int number) {
        return number * number;
    }


    // 매개변수 없음, 리턴값 있음
    // 현재 시간을 "현재 시간입니다"라는 문자열로 반환하는 함수를 작성하세요
    public static String isNowTime(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();


        return hours == nowHours && minutes == nowMinutes ? "현재 시간입니다." : "현재 시간이 아닙니다.";
    }
    
}

/**
 * 현재 시와 분이 지금과 같으면 현재 시간이라 나오고 그게 아니면 아니라고 뜨는 가벼운 코드? 아무튼
 * 클래스를 아직 안 배워서... Util 을 배워야 알 것 가튼데
 * 
 */