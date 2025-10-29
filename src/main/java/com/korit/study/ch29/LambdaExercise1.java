package com.korit.study.ch29;

interface StringProcessor {
    String process(String str);
}

interface NumberChecker {
    boolean check(int num);
}

interface Printer {
    void print();
}

public class LambdaExercise1 {
    public static void main(String[] args) {

        // 1번: 문자열을 대문자로 변환
//        StringProcessor upperCase = new StringProcessor() {
//            @Override
//            public String process(String str) {
//                return str.toUpperCase();
//            }
//        };
//        System.out.println(upperCase.process("hello"));

        // TODO: 위 코드를 람다 표현식으로 변환하세요
        StringProcessor upperCase = (str) -> str.toUpperCase(); // 재정의를 화살표로 표기하는 것.
                String upCaseStr = upperCase.process("abcd");
                System.out.println(upperCase);

        // 2번: 숫자가 짝수인지 확인
//        NumberChecker isEven = new NumberChecker() {
//            @Override
//            public boolean check(int num) {
//                return num % 2 == 0;
//            }
//        };
//        System.out.println(isEven.check(10));

        // TODO: 위 코드를 람다 표현식으로 변환하세요
         NumberChecker isEven = num -> num % 2 == 0;
        System.out.println(isEven.check(10));

        // 3번: 환영 메시지 출력
//        Printer welcome = new Printer() {
//            @Override
//            public void print() {
//                System.out.println("환영합니다!");
//            }
//        };
//        welcome.print();

        // TODO: 위 코드를 람다 표현식으로 변환하세요
         Printer welcome = () -> System.out.println("환영합니다!"); // 매개변수가 없으면 빈괄호를 만들어줘야 함.
                welcome.print();
    }
}
