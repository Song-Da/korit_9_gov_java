package com.korit.study.ch05;

public class 연습문제10 {
    public static void main(String[] args) {
        int[] studentScore = { 85, 92, 78, 96, 88, 73, 99, 82 };

        for (int i = 0; i < studentScore.length; i++) {
            if (studentScore.length < 89) {
                System.out.println("A등급");
            }
        }
    }
}
