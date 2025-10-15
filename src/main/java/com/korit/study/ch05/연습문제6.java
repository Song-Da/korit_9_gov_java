package com.korit.study.ch05;

public class 연습문제6 {
    public static void main(String[] args) {
//        특정 값 개수 세기 -> (arr1, arr2, arr3 [] 박스 안에 값 옮겨담아서 출력하기)
        int[] nums = { 1, 2, 3, 1, 2, 3, 1, 3, 3 }; // 얘를 첫번째 것부터 반복 돌려야 함.
        int[] arr1 = new int[0]; // 1들만 모으기
        int[] arr2 = new int[0]; // 2들만 모으기
        int[] arr3 = new int[0]; // 3들만 모으기

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int[] temp = new int[arr1.length + 1];
                for (int j = 0; j < arr1.length; j++) {
                    temp[j] = arr1[j];
                }
                temp[temp.length - 1] = nums[i];
                arr1 = temp;
                System.out.println("1번 배열 만드는 과정: " + arr1[arr1.length - 1]); // 그냥 한번 출력해서 확인하는 게 낫다.

            } else if (nums[i] == 2) {
                int[] temp = new int[arr2.length + 1];
                for (int j = 0; j < arr2.length; j++) {
                    temp[j] = arr2[j];
                }
                temp[temp.length - 1] = nums[i];
                arr2 = temp;

            } else if (nums[i] == 3) {
                int[] temp = new int[arr3.length + 1];
                for (int j = 0; j < arr3.length; j++) {
                    temp[j] = arr3[j];
                }
                temp[temp.length - 1] = nums[i];
                arr3 = temp;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "]: " + arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "]: " + arr2[i]);
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "]: " + arr3[i]);
        }


    }
}

/**
 * 빨간콩 눌러서 벌레 모양 디버깅을 눌러서
 * 세부적으로 보면 됨 (재개 누르면 계속 들어감)
 *
 */