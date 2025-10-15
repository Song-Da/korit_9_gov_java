package com.korit.study.ch05;

public class 연습문제8 {
    public static void main(String[] args) {
        // 기본급에 세율을 적용했을 때 실제 지급액을 각각 얼마씩 지급되는지 구하기
        // 형변환에 섞어서 만든 것. 배열을 늘리는 코드가 사라짐. 이미 3개라는 범위기 지정되었기 때문에.


        int[] 기본급 = {10000, 20000, 30000};
        double 세율 = 0.15;
        int[] 지급액 = new int[3];

        for (int i = 0; i < 기본급.length; i++) {
            double 세금 = (기본급[i] * 세율);
            int 실수령액 = (int) (기본급[i] - 세금);
            지급액[i] = 실수령액;
//            System.out.println(지급액[i]); <= 옮겨 담고 있는 과정을 출력하는 것임. 한마디로 디버깅! 출력하는 기능은 따로 있음.
        }

        for (int i = 0; i < 지급액.length; i++) {
            System.out.println(지급액[i]);
        }
    }
}



/**
 * TLqkf ㅈㄴ모르겠다아...................
 *
 */