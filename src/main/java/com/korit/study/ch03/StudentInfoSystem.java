package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 선언용은 다 맨 위에 코드를 정리를 해두는 편이 좋다. 보기가 편하기 때문에....
        String name = "";
        int age = 0;
        int studentYear = 0;
        double kor = 0;


        System.out.print("학생 이름: ");
        name = scanner.nextLine();

        System.out.print("나이: ");
        age = scanner.nextInt();
        System.out.print("학년: ");
        studentYear = scanner.nextInt();

//        boolean grade2 = 16 == age ? "(고등학교 1학년)" :
//                17 == age ? "(고등학교 2학년)" :
//                        18 == age ? "(고등학교 3학년)" : "미지정";

        System.out.print("국어 점수를 입력하세요: "); // 점수는 소수점이 있을 수도 있으므로 double로 응용이 가능하다...
        kor = scanner.nextDouble();
        System.out.print("영어 점수를 입력하세요: ");
        double eng = scanner.nextDouble();
        System.out.print("수학 점수를 입력하세요: ");
        double mt = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("자기 소개를 입력하세요: ");
        String introduction = scanner.nextLine();

        double sum = kor + eng + mt;
        double avg = sum / 3;
        String grade = avg >= 95 ? "A+" :
                avg >= 90 ? "A" :
                        avg >= 85 ? "B+" :
                avg >= 80 ? "B" :
                avg >= 75 ? "C+" :
                avg >= 70 ? "C" :
                avg >= 65 ? "D+" :
                avg >= 60 ? "D" : "F";


        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성적: ");
        System.out.println("국어: " + kor);
        System.out.println("영어: " + eng);
        System.out.println("수학: " + mt);
        System.out.println("평균: " + avg + "점 " + grade);
        System.out.println("자기소개: " + introduction);

        /**
         * (String.format("""
         * 이름: %s
         * 나이: %d세 (고등학교 2학년)
         * 성적:
         *      국어: %.2f점
         *      영어: %.2f점
         *      수학: %.2f점
         *      평균: %.2f점 (학점: %s점)
         *      자기소개: %s""", name, age, kor, eng, mt, avg, grade, introduction));
         *      
         *      %.2f => 소수점 둘째 자리까지 출력하라는 의미
         *      """ 3개 쓰는 걸 별로 추천하지 않음. 많은 회사들이 jdk 11ver. 을 사용하기 때문에...
         *      동작이 안 될 가능성이 높음. 비추.
         */

        scanner.close();
    }
}
