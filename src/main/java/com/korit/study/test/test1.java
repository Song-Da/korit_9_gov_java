package com.korit.study.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요");
        } else {
            for (int i = 0; i + 1 < num; i++) {
                System.out.println(i + " ");
            }
        }
        scanner.close();
    }
}
