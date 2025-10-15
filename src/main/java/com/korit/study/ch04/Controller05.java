package com.korit.study.ch04;

public class Controller05 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // 조건문을 처리하고 아래의 출력으로 가서 출력 후 증감 하고 다시 조건문의 반복임
            System.out.println(i + 1);
        }

//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//        }
//         틀린 방법은 아니지만 최초의 접근은 아래의 것처럼 하는 게 좋다. 생각을 단순히 할 수 있기 때문...

        /*
        알고리즘 문제를 쉽게 푸려면 i = 0 을 고정시켜놓고 푸는 게 낫다.
        컴퓨터는 0부터 시작해서 쭉 나아가는 걸 반복 연습 해야 한다.
        반복문을 할 때 제일 중요한 개념이고...
        반복 횟수를 딱 정해놓고
         */

        for (int i = 0; i < 5; i++) {
            System.out.println(5 - i);
        }

        /*
        1
        2
        3
        4
        5
        5
        4
        3
        2
        1
         */
    }
}
