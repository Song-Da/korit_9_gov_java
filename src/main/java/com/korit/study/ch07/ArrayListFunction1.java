package com.korit.study.ch07;

import java.util.Scanner;

public class ArrayListFunction1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        if (names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + i + "): " + names[i]);
            }
        }

        System.out.print("이름입력: ");
        String name = scanner.nextLine();
        String[] newNames = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
        }
        newNames[newNames.length - 1] = name;
        names = newNames;

        if (names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + i + "): " + names[i]);
            }
        }
    }
}
