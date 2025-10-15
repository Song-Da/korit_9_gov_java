package com.korit.study.ch02;

public class Operator01 {
    public static void main(String[] args) {
//      산술연산
        int n1 = 10;
        int n2 = 5;
        int r1 = n1 + n2;
        System.out.println(r1);

//      문자열 더하기
        String text1 = "문자열";
        String text2 = "합치기";
        String text3 = text1 + text2;
        System.out.println(text3);
        System.out.println("문자열2" + "   " + "합치기2" + text1 + ": " + r1);

//      연산으로 인한 캐스팅
        double n3 = 2.1;
        int n4 = 10;
        System.out.println(n3 + n4); // 상위의 자료형 타입으로 따라가게 된다.
        // n3 와 n4 는 변수일 뿐. 안에 들어간 리터럴 값을 더한 것이고 출력한 것.
        String n5 = "" + 2.1; // 아무것도 없는 문자열 + 2.1
        double n6 = 10.12;
        double n7 = Double.parseDouble(n5) + n6;
        System.out.println(n7); // 수학적 연산이 일어나지 않고 글자를 이어붙이는 게 됨.
        System.out.println((char) ('a' + 10));
//      문자는 캐릭터 자료형. 아스키코드에 의해서 a 는 97 이라는 숫자를 가짐.
//      char 는 정수보다 하위이기 때문에 int 자료형을 따라간다. (보통)
//      하지만 만약에 문자를 더하고 싶다면 위처럼 캐스팅을 해주어야 한다.

        System.out.println('a' + ('b' + ""));
//      문자열은 덧셈이 안 되기 때문에 수학적 연산을 하기 위해서는 숫자로 변형된 것이다. 그 값이 더해진 결과를 출력한 것.
//      하지만 "" 을 앞에 둔다면 문자열 a 가 b 와 붙어지는 것이기에... 문자는 우선 순서가 제일 중요하다.

//      나머지 연산
        int n8 = 10;
        int n9 = 4;
        int n10 = n8 % n9;
        System.out.println(n10);


//      문자열로 더해버리면 전부 문자열이 되어버린다.
    }
}