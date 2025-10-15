package com.korit.study.ch06;

public class 연습문제4 {
    public static void main(String[] args) {
        int result = calculate(5, 10, 15, 20);
        System.out.println("결과: " + result);
    }


    public static int add(int a, int b) { return a + b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int subtract(int a, int b) { return a - b; }

    // (a + b) * c - d 를 계산하는 함수를
    // 위의 함수들을 이용해서 작성하세요
    public static int calculate(int a, int b, int c, int d) {
        // 여기에 중첩 함수 호출 코드 작성
        int addResult = add(a, b);
        int mulResult = multiply(addResult, c);
        int subResult = subtract(mulResult, d);
        // 아래와 똑같지만 나중에 되면 타고 타고 들어가는 걸 잘 해야 함. 그때는 이렇게 위처럼 풀어서 쓰지 않음
        
        return subtract(multiply(add(a, b), c), d);
    }

}
/**
 * 그냥 일반적인 연산 기호를 사용해도 되겠지만...
 * 정의해둔 multiply 은 곱하기
 * 정의해둔 subtract 는 빼기
 * 연산의 순서가 있기 때문에 괄호를 잘 봐야 할 것 같다.
 * 함수의 결과를 집어넣고 집어넣어서 사용할 수 있다.
 * 변수 써서 풀어서 쓸 수도 있기는 함.
 */