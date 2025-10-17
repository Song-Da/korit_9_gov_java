package com.korit.study.ch20;

import com.korit.study.ch01.Casting;


public class StaticMain {

    int age;

    public static void main(String[] args) { //
        StaticStudy staticStudy = new StaticStudy();
//        Casting.main("김준일"); // 이 클래스 안에 정적인 건 나온다는 뜻
        StaticStudy.print("김준이");
        System.out.println(staticStudy.age);
        System.out.println("김준일");
        StaticStudy.age2 = (staticStudy.age2);
        StaticStudy.age2 = 10;
        System.out.println(staticStudy.age);
        System.out.println(staticStudy.age2);
        StaticStudy.age2 = 20;
        System.out.println(StaticStudy.age2);
        staticStudy.age2 = 30; // 소문자는 instansof 인 것. 고유가 되는 거라 생성된 ㅔ 니다.
        System.out.println(StaticStudy.age2);
        StaticStudy s2 = new StaticStudy();
        s2.age2 = 50;
        System.out.println(staticStudy.age);

    }
}
// static 정적 메모리 할당
/**
 * 정적 메모리 할당은? 소스 코드를 읽어들임.
 * 파이썬은 대화형, 스ㅡ크립트 언어
 * 컴파일: 사람이 작성한 코드를 기계가 해석하는 것.
 * 메모리 안에서 딱 정해놓음. A라는 프로그램을 만들면 크로그램이 실행되고 날 때사ㅣ
 * ㄴ낭비가 되는 현상이 좆=ㅏ
 *
 * 조건에 의해서 달라질 수 있다.
 *거쳐지는 동작 단계들이 많아디면 replace ram 에 있는 걸 실제로 저장하는 곳은 하드디스크, SSㄹvmfpftl qorahfl
 *
 * 페이징이 들어있음.버츄얼 메모리 가상 메모리를 프로그램적으로 만든 것.
 * A 프로그램 하나가 계속 반복 동작 중이면 나머지 B,C 등 새동작이 가능하지 않음. 동작이 다 끝난 뒤에...
 * 프로그램이 종료될 때까지 무조건 상주하고 있는 게  static
 * 스레드
 *
 *
 *
 *
 *
 */