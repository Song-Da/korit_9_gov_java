package com.korit.study.ch05;

public class 연습문제1 {

    public static void main(String[] args) {

        /**
         * 배열 대괄호 [] 안에는 숫자를 넣으면 공간이 숫자만큼 정해지는 거라
         * 넣으면 안 됨. 정해두면 좋지 않음.
         */


        String[] names = new String[3];
//        0 => 김준일, 1 => 김준이, 2 => 김준삼
//        전체 출력
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
        /*
        문자열 공간 3개를 만들었음.
         */


//        1. 배열의 모든 요소 출력
//        변수명은 뒤에다가 s 를 붙일 것. 왜냐하면 하나만 들어있는 게 아니니까.
//        1번 배열의 모든 요소 출력 (반복문 포함) 을 손에 익숙하게 만드는 게 제일 중요함.
//        나머지는 익숙해진 다음에 해도 괜찮음. 기본적인 1번 문제를 익히는 게 제일 중요.

//        노가다 ver.
        int[] nums = new int[] { 10, 20, 30, 40, 50};
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
//        System.out.println(nums[4]);
//
//        int a = 1;
//        System.out.println(nums[a]);
//        위처럼 변수를 가져다 쓸 수 있다. 재활용이 가능!!

//        인덱스가 1씩 증가하는 건 for 문을 쓰자.
//        실질적인 정답은 아래의 것이다.
        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }
        /*
        풀이.
        배열을 만나는 순간 대괄호 [] 를 기억해야 한다.
        순서대로 10, 20, 30, 40, 50 들어가있고 0번 1번 2번 3번 4번이라고 한다. 컴퓨터는
        0부터 번호가 시작됨.
        정수형이면 int 배열임
        배열의 선언과 초기화 및 배열의 값을 어떻게 꺼낼지 학습이 되어야 함.

        순서대로 반복되는 게 뭔지. [] <- 안에 숫자가 파란색으로 쓰는데 대괄호 안에는
        값을 쓸 수 있다. 변수를 쓸 수 있다는 것.
         */


//        2. 배열 요소의 합계 구하기
        int [] array = { 5, 10, 15, 20, 25 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("배열 요소들의 합: " + sum);
//        지역 범위를 잘 구분해야 한다. for 문 밖으로 꺼내놔야 알맞은 답이 나오고
//        안에 넣은 상태로 진행하면 점점 더해지면서 5번 반복이 됨.


//        3. 배열에서 최댓값 찾기
        int[] nums1 = { 23, 45, 12, 67, 34, 89, 11 };
        int max = nums1[0];

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > max) {
                max = nums1[i];
            }
        }
        System.out.println("배열의 최댓값: " + max);

        /*
        int i = 0 이고 0인 i 에서 nums1 에 배정된 공간 만큼 비교함
        만약에 i 보다 작은 max 가 참이라면 max 는
         */


//        4. 배열의 짝수만 출력
        int[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] % 2 == 0) {
                System.out.println("짝수: " + nums2[i]);
            }
        }

        /*
        if 를 쓰는 게 아닌가? 음....
        근데 써야하지 않나.....
        한줄로 숫자만 떼서 어떻게 하지....ㅋㅋ
        아 돌겠구려
        문제의 푸는 과정을 보고 자기 스킬로 만드는 게 중요한데 와
        ㅅㅂ모르겠근
         */

//        5. 배열 역순으로 출력
        int[] nums3 = { 1, 2, 3, 4, 5 };
        for (int i = 0; i > nums3.length; i--) {
            
            System.out.println(nums3[i]);
        }


    }
}
