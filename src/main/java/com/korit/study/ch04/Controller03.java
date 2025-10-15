package com.korit.study.ch04;

import java.util.Scanner;

public class Controller03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOpen = true;

        while (isOpen) { // 특정 조건에 의한 반복. for 문은 순서가 중요함.
            System.out.println("문을 열고 들어왔습니다.");
            System.out.print("문을 닫으시겠습니까?(y/n)");
            String cmd = scanner.nextLine();
            isOpen = !"y".equals(cmd);
            System.out.println("1111");
        }
        System.out.println("문을 닫고 나왔습니다.");

        while (true) {
            System.out.println("문을 열고 들어왔습니다.");
            System.out.print("문을 닫으시겠습니까?(y/n)");
            String cmd = scanner.nextLine();
            if (!"y".equals(cmd)) {
                break; // 
            };
            System.out.println("1111");
        }
        // 반복의 반복. 중첩
        while (true) { // 폴더 들어가기, 뒤로가기가 while 구조고... 모든 프로그램은 while 로 돌아가고 있음.
            System.out.print("첫번째 반복 y/n");
            String cmd = scanner.nextLine();
            if ("y".equals(cmd)) { // 만약에 n 을 입력받으면 false 가 나와서 안쪽 것을 들어가지 않고 바깥으로 바로 빠져나와서 false 코드 실행
                while (true) {
                    System.out.print("두번째 반복 y/n");
                    String cmd2 = scanner.nextLine();
                    if ("n".equals(cmd2)) {
                        break;
                    }
                }
            } else {
                System.out.println("종료");
                break;
            }
        }
    }
}
// 가장 큰 반복의 존재로 어떤 프로그램을 켜놔도 계속 실행중인 것이다. 계속 돌아갈 수 있는 게 while 구조이기 때문에...
// 조건에 의해서 반복 처리할 때 쓰임.