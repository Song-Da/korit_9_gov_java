package com.korit.study.ch01;


import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 */
public class Type {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//      논리 자료형
//        boolean open; // 선언을 하고 나면
//        open = true; // 무조건 값을 초기화를 시켜야 자바가 컴파일러 에러를 띄우지 않음. 최초의 값 대입을 초기화. 이후는 대입
        boolean open = true; // 선언 후 바로 초기화. (입주 청소 하는 것과 같다.)
        System.out.println(open);
        open = false;
        System.out.println(open);

//      문자 자료형
        char lastName = '김'; // 문자열 아니고 '문자' 이다.
        System.out.println(lastName);

//      문자열 자료형
//        char firstName = '준일'; < 한 글자가 아니라 두 글자 이상은 사용할 수 없다.
        String firstName = "준일"; // 첫글자가 대문자인 파스칼 표기법인 String은 클래스.
        System.out.println(firstName);
        String contents1 = "안녕하세요.\n김준일입니다.";
        System.out.println(contents1);
        String contents2 = """
                안녕하세요.
                김준일입니다.""";
        System.out.println(contents2); // """ 세개를 찍으면 줄바꿈이 가능함.

//      숫자
        double avg = 89.33; // 실수
        System.out.println(avg);
        int number = 10000000; // 정수
        System.out.println(number);
        long nowTime = (int) new Date().getTime(); // 명시적 형변환. 잘려나감.(데이터 손실이 일어남)
        System.out.println(nowTime); // 현재 년월일시간
        long longNumber = 2200000000l; // 소문자 l 을 붙여야 에러가 뜨지 않음.
        System.out.println(longNumber);

//        상수
        final String uploadPath = "~/upload/image"; // 보통 경로들은 final 을 붙여 사라지지 않게 하려 함.
        final String UPLOAD_PATH = "/upload/image"; // 대문자와 스네이크 사용함.상수도 선언되는 순간에 초기화가 동시에 이뤄지고 이후로는 값을 변하지 않게 제약을 건다.
//        개발을 할 때는 앞에 final 표기를 해야 한다. 클린 코딩할 때 많이 씀. 데이터가 변하지 않게끔 고정.
        
    } // 중괄호로 감싼 부분은 하나의 영역, 지역이라 생각하면 됨.
}
