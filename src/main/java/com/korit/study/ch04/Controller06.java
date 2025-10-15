package com.korit.study.ch04;

import java.util.Scanner;

public class Controller06 {
    public static void main(String[] args) {
        // 중첩 반복
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < i; j++) {
                System.out.println("j = " + j);
            }
        }
    }
}
