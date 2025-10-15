package com.korit.study.ch04;

public class Controller01 {
    public static void main(String[] args) {
        int num = 10;

        String text = num > 5 ? "5보다 큽니다." : "5이하입니다."; // 계산이 되었다.
        System.out.println(text);
        if (num > 5) {
            System.out.println("5보다 큽니다."); // 계산이 아니라 합당하면 이걸 출력해라. (명령)
        } else { // 무조건 하나가 실행되면 나머지는 출력되지 않음. (ex: 왼쪽 길을 들어갔으면 다시 돌아가는 건 없다.)
            System.out.println("5이하 입니다.");
        }

        int score = 85;

        if (score > 50) System.out.println("50보다 큽니다.");
//        원래 중괄호가 있어야 하는데 생략됨. if 문은 하나의 명령을 실행시킬 때는 중괄호를 생략할 수가 있다.
        else System.out.println("50이하 입니다.");
//        원래 중괄호를 쳐야 하지만 치지 않고도 쓸 수 있다. 명령이 하나일 때만!! 2개의 명령을 동시에 쓸 대는
//        중괄호로 감싸주어야 한다.


        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 85) {
            System.out.println("B+");
        } else {
            System.out.println("B");
        }
    }
}
/**
 * 삼항연산자는 계산이 되는 거고
 * 조건문은 명령을 실행할 수 있는 것.
 * 연산과 명령 실행은 구분되어야 한다.
 *
 * 내일 연산자 발표 (삼항연산자)
 *
 */