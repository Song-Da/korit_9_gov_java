package com.korit.study.ch05;

public class Star {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * 총 4줄
         * 한줄 출력할 때마다 줄바꿈이 들어감
         * i 가 증가되어 질 때 j 의 별이 하나 추가되고
         * 줄바꿈
         * 다시 돌아가서 i 가 1 더해진 상태고
         * 두번째엔 2로 j 가 별이 2개가 찍힘
         * 전체 4번 반복
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) { // 걍 여기만 바꾸면 되는 거였음 와;
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();

        int n = 10;

        for (int i = 0; i < n; i++) { // i 는 0 이고 10번 반복하며 1씩 더해진다
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < (i < 2 ? i : i < n - 1 ? 1 : n - 1 - i); j++) {
//                System.out.print(" ");
//            }

            System.out.print(i == 0 || i == n - 1 ? "" : " ");

            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        int num = 15;

//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < (j < (num / 2) ? (num / 2) - i : i - (num / 2)))
//        }


        // num 이 전체 반복 횟수임. 거기에 2 를 나누면 중간 지점을 찾는 것임.
        // 중간 지점보다 작으면 작을 때는 다이아몬드가 증가를 해야 하고 어느 지점을 ㄴ머어서부터는
        // 감소를 해야 한다. 작으면 2 곱하고 1을 더하면 됨
        // i 가 최초로 5 일 때부터는
        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (i * 2) +1 : ((num - i - 1) * 2) + 1);
        }

        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (num / 2) - i : i - (num / 2));
        }
        // 정석으로 증가와 역으로 빼지는 공식을 세우면 됨.


        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i); // 역으로 줄어드는 반복이 됨. 왜냐하면 i 에는 계속 1이 더해져서 뒤에만 나옴
        }



        // 별 찍기, 피라미드, 다이아몬드

    }
}
/**
 * i 는 0 이고 4번 반복함. i 에 1 이 추가됨
 * 근데 또 반복을 들어가서 j 는 0 이고 i 에 1 을 더한 값이 반복됨. 그리고 j 또한 1 씩 추가가됨
 * 많이해봐야감이 잡힌대
 * 아...........아무튼... 다이아몬드 몬만들겟ㄴ는데 ?
 */