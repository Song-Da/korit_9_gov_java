package com.korit.study.ch05;

public class 연습문제2 {
    public static void main(String[] args) {
        int[] nums = { 5, 10, 15, 20, 25 };
        int result = nums[0] + nums[1] + nums[2] + nums[3] + nums[4]; // for 문으로는 이렇게 할 수는 없다
        System.out.println("배열 요소들의 합: " + result);
//        위의 방법은 추천하지 않음!

//        for 문으로 바꿔서  사용 가능한 거
        int result2 = 0;
        result2 = result2 + nums[0];
        result2 = result2 + nums[1];
        result2 = result2 + nums[2];
        result2 = result2 + nums[3];
        result2 = result2 + nums[4];

        for (int i = 0; i < 5; i++) {
            result2 = result2 + nums[i];
            /**
             * 이 안에 출력을 넣어버리면 계속 출력도 반복이 됨
             * 중간에 더해지는 과정을 보고 싶으면 해도 됨. 하지만
             */
            if (i == 4) {
                System.out.println("배열 요소들의 합: " + result2);
                /**
                 * 이렇게도 응용이 가능함.
                 * 반복 안에 if 를 넣어서 마지막만 출력할 수 있는 방법
                 */
            }
        }
        System.out.println("배열 요소들의 합: " + result);

        /**
         * 소스 코드가 완성이 되어있어야 되는데...자바는 실행 중간에 소스 코드를 꽂아넣을
         *
         */
    }
}
