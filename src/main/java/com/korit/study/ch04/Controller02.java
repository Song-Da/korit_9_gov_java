package com.korit.study.ch04;

import java.util.Scanner;

public class Controller02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.nextLine();

        switch (name) { // 여기에 들어있는 값이랑 같은 케이스를 찾아가고 그 후의 케이스까지 출력함.
//            변수의 자료값이랑 같아야 함. int 인데 String 을 출력할 수 없다는 뜻.
            case "김준일":
                System.out.println("1");
                break; // 어지간하면 전부 break 를 건다. 알맞은 케이스가 나오면 바로 끝내버리게.
            case "김준이":
                System.out.println("2");
                break;
            case "김준삼":
                System.out.println("3");
                break;
            default: // 1, 2, 3 같은 특정한 값이 아니면 이쪽으로 가세요 라는 뜻
                System.out.println("나머지");
        }
//        switch 는 가독성이 떨어져서 if 문을 추천함.

    }
}
