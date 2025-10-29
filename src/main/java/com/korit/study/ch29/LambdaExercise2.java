package com.korit.study.ch29;

interface MathOperation {
    int operate(int a, int b);
}

interface TripleOperation {
    int operate(int a, int b, int c);
}

interface Formatter {
    String format(String name, int age, String city);
}

public class LambdaExercise2 {
    public static void main(String[] args) {

        // TODO 1: 두 수를 더하는 람다 표현식 작성
        MathOperation add = (n1, n2) -> n1 + n2; // 여기에 람다 작성
        System.out.println(add.operate(10, 20));

        // TODO 2: 두 수 중 큰 수를 반환하는 람다 표현식 작성
        MathOperation max = (n1, n2) -> n1 > n2 ? n1 : n2; // 여기에 람다 작성
        MathOperation max2 = (n1, n2) -> Math.max(n1, n2); // 여기에 람다 작성

        // TODO 3: 두 수의 거듭제곱을 계산하는 람다 (a의 b제곱)
        MathOperation power = (n1, n2) -> (int) Math.pow(n1, n2);

        MathOperation power2 = (n1, n2) -> {
            if (n2 == 0) {
                return 1; // 만약에 n2 가 0 과 동일하면 리턴 값으로 1 이 나올 것이다. 그렇지 않다면 아래로 내려감
            }
            int result = n1;
            for (int i = 0; i < n2; i++) {
                result *= n1;
            }
            return result;
        }; // 여기에 람다 작성
        // 힌트: Math.pow() 사용

        // TODO 4: 세 수의 평균을 구하는 람다 표현식 작성
        TripleOperation average = (n1, n2, n3) -> (n1 + n2 + n3) / 3; // 여기에 람다 작성

        // TODO 5: 이름, 나이, 도시를 받아서 형식화된 문자열로 만드는 람다
        // 출력 형식: "이름: 홍길동, 나이: 25세, 거주지: 서울"
        Formatter personInfo = (name, age, address) ->
                String.format("이름: %s, 나이: %d세, 거주지%s", name, age, address); // 여기에 람다 작성


        // 테스트 코드
        System.out.println("10 + 20 = " + add.operate(10, 20));
        System.out.println("15와 27 중 큰 수: " + max.operate(15, 27));
        System.out.println("2의 10제곱: " + power.operate(2, 10));
        System.out.println("10, 20, 30의 평균: " + average.operate(10, 20, 30));
        System.out.println(personInfo.format("홍길동", 25, "서울"));
    }
}
