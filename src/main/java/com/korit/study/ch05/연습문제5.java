package com.korit.study.ch05;

public class 연습문제5 {
    public static void main(String[] args) {
//        실행 과정을 값을 넣어가면서 확인하는 게 좋음.

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] evens = new int[0];

        for (int i = 0; i < nums.length; i++) {
            // i 는 0 이고 nums 길이 만큼 반복할 거고 i 를 1씩 증가시키며 반복하겠다.
            if (nums[i] % 2 == 0) {
                int[] temp = new int[evens.length + 1];
                // 새로운 int 정수를 만들 건데 [evens.length + 1] < 내가 만들 배열의 크기.
                // length 는 기존의 크기를 가져옴. 이때 한칸짜리 방이 생겨남.
                // 이 배열의 위치를 temp 라는 변수에 저장하고 temp 는 실제 배열의 주소를 가리킨다.
                for (int j = 0; j < evens.length; j++) { // evens 는 반복횟수임.
                    temp[j] = evens[j];
                }
                evens = temp;
                evens[evens.length - 1] = nums[i]; // 남는 방 조절
            }
        }
    }
}
/*
대입은 어떠한 값을 꼭 봐야함.

 */

/**
 * 짝수를 찾는 걸 출력하는 것
 * 1. System.out.println(nums[i]);
 * 2. int even = nums[i];
 *    System.out.println(even);
 * 
 * 새로운 공간을 만들어줘야 한다.
 * i 가 3이 되면 4인 짝수가 실행이 되고 새로운 공간이 또 생김.
 * 이때 temp 를 쓰는 이유는 배열에 주소가 없으면 쓸 수가 없고...
 * 주소를 변수에 저장하는 거고 new 가 일어날 때마다 주소를 계속 바꿔주는 것.
 * 기존 a 라는 even 에 주소를 저장했는데 temp 라는 변수에 새 주소를 대입하고
 * 기존 주소를 가리킬 방법이 없어지면 쓸 수가 없으니 temp 를 사용해서 다 옮기고...
 *
 * int a = 10; < a 가 가지고 있는 건 10의 주소고 a 의 주소가 들어오는 게 아니라 값의 주소를 b에
 * int b = a; < 대입을 하는 것이다. 가르키는 게 값.
 * print (a)
 *
 * if 문이 끝나면 다ㅣㅅ 돌아가서 새로 열려가지고 선언과 초기화가 됨.
 */