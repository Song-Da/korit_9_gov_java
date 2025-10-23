package com.korit.study.ch23;

import com.korit.takenotes.array.Array;

import java.util.ArrayList;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        long num4 = 10;
        float num5 = 10;
        byte num6 = 10;
        short num7 = 10;
        char num8 = '1';
        Double num1 = 10.0;
        String num3 = "10";
        Integer num2 = 10; // = new Integer(10); < 현재 이렇게 지원하지 않고 autoBox or autoBoxing 라고 함.
        int num9 = num2; // num2 Integer 를 int 로 바꿔주는 autoUnBoxing
        String numStr = Integer.toString(num); // 여기서 문자열로 바꿔주려면? num 은 그냥 값이고 객체가 아니니까 toString 을 넣을 수 없음.
        String numStr2 = "" + num;
        String numStr3 = num2.toString(); // 이렇게 웨핑되어 있다면 바로 문자열로 바꿔줄 수 있음.
        // 오브젝트가 아니라 그냥 값이 들어있기 때문이다. 참조 자료형 위에는 오브젝트를 위에 두고 있음
        // 참조 자료형과 일반 자료형은 완전히 분리되어 있음. 일반은 객체가 아니고 기능을 가질 수 없음
        // 그 관련 자료형으로 감싸는 건 웨핑 클래스.
        // 인티저 클래스 안에 정수로 무언갈 할 수 있는 기능들이 나옴.
        // num 을 문자열로 바꿔주고 싶다면 Integer.toString(num) 형태도 있고
        // 공백에 더하기 num 을 하면 됨.
        // 살짝 글자가 누워있는 건 static 임. 이텔릭체.



    }
}

/**
 * 도대체 왜 오토박싱을 하느냐?
 * Integer 는 참조 자료형. 참조 자료형의 특징은 객체.
 * 왜 이름이 참조일까? 이걸 타고 들어가면 뭔가 더 있다는 뜻.
 * 일반 자료형은 타고 들어갔을 때 값 하나. 하지만 참조 자료형에는 자료 값이랑 메서드 기능이 들어있기 때문.
 *
 * 살짝 글자가 누워있는 건 static 이 들어가 있고 그 안에 정수 int 자료형을 넣어주면 문자열로 바꿔줌.
 * 1. 목적: 웨핑 되어져 있다면 장점은 정수 기능을 사용할 수 있다. 일반 자료형을 참조 자료형으로 바꿔주는 행위는 박싱.
 * 2. 목적: 제네릭은 무조건 참조 자료형만 쓸 수 있음. generic 타입은 클래스. 참조만. 일반은 사용 불가.
 *
 * 핵심은 일반 자료형은 무조건 웨핑 클래스를 사용해서 참조 자료형으로 바꿔주면 int 도 Integer 로 변해서
 * 사용이 가능하게 됨.
 *
 *
 */