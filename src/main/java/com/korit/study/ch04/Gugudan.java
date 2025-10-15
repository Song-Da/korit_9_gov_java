package com.korit.study.ch04;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        /* 구구단 */
        Scanner scanner = new Scanner(System.in);
        int startDan = scanner.nextInt();
        int endDan = scanner.nextInt();

        int danRange = endDan - startDan + 1;

//        여기에 코드를 작성하세요. 입력 순서와 Scanner 메서드 조합에 주의
//        for (int i = 0; i < danRange; i++) {
//            int dan = startDan + i;
//            System.out.println(dan + "단");
//            for (int j = 0; j < 9; j++) {
//                int num = j + 1;
//                System.out.println(String.format("%d X %d = %d", dan, num, dan * num));
//            }
//        }

//        거꾸로 출력하기 (와ㅋㅋ;;;;)
        for (int i = 0; i < danRange; i++) {
            int dan = (endDan - i);
            System.out.println(dan + "단");
            for (int j = 0; j < 9; j++) {
                int num = 9 - j;
                System.out.println(String.format("%d X %d = %d", dan, num, dan * num));
            }
        }
        scanner.close();
    }
}
// 반복 횟수를 잘 이용해서 문제를 풀어야 함.
// 반복문은 배열을 위해서 씀. 브레이크, 컨디뉴도 아직까지는 괜찮은데...