package com.korit.study.ch05;

public class 연습문제3 {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 12, 67, 34, 89, 11 };
        int max = 0;
        for (int i = 0; i < 7; i++) {
            if (nums[i] > max) { // nums[i] 의 값이 max 보다 크면
                max = nums[i];
            }
        }

        max = 0;
        for (int i = 0; i < 7; i++) { // i 는 값이 아니고 인덱스이며 7은 반복 횟수이다. 인덱스 참조를 위해서 쓰이는 거지 값이 아니다.
            max = nums[i] > max ? nums[i] : max;
            }
        System.out.println("최댓값: " + max);
    }
}
