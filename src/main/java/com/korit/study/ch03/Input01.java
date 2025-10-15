package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner s = new Scanner(inputStream);
        // s 라는 변수를 스캐너 자료형으로 선언했다. 선언 하고나면은 꼭 초기화를 같이 해준다. 뒤의 값이 앞의 자료형과 같아야 한다.
        // 이 변수에 들어간 자료가 스캐너이다. 이외는 일단 외우기.
        String str = s.nextLine();
        // 입력된 결과를 str 에 담는 것.
//        System.out.println(String.format("입력값: %s", str));
        System.out.println("입력값: " + str);
//        %d 는 숫자를 입력할 때, %s 는 문자를 쓸 때. 자료형에 따라서 표현식이 달라진다.
//        s.nextLine(); // 이걸로 앞에 남은 띄어쓰기. 버퍼를 날려줌.
        String str2 = s.nextLine(); // 여기서 새 시작이 가능하다...
        System.out.println("주소: " + str2);
//        address 는 주소
//        s.next() 는 띄어쓰기가 나타나면 문자를 끊어버림. 끊은 앞쪽의 것을 리턴해서 저장한다. 컴퓨터는 띄어쓰기로 잘라진 부분은
//        사라진 게 아니라 앞부분까지만 리턴해서 저장한 거고 나머지는 어딘가에 따로 저장되어 남아는 있지만 출력되지 않은 것 뿐이다.
        System.out.println();
//        next는 스페이스로 끝나고 line 은 중간에 띄어쓰기도 포함하고 Enter 가 문장의 끝임.
//        문자를 입력 받을 때는 nextLine 을 쓰는 게 낫다.


    }
}

// = 대입 연산자 라고 하는 것은 무조건 변수에 값을 넣을 ㄸ때 씀 같다라는 의미가 아니고 무조건 어떠한 변수에 어떠한 값을 집어넣을
// 때 쓴다. 모든 프로그래밍 언어에 쓰는 일반 자료형. 자바에서만 쓸 수 있는 자료형들이 존재하는데 그게 대부분 대문자로 싲가하고 객체라고 함. 참조자료형이라고도 부름 왜
// String 은 참조 자료형이다. char 들을 묶어서 만든 게 String 이다. 일반, 참조가 있는데
// 변수 앞에는 무조건 자료형이다. 변수 앞에는 무조건 똑같은 관련 자료형들만 대입이 가능함.
