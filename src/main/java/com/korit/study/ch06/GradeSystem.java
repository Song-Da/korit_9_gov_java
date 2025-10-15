package com.korit.study.ch06;

public class GradeSystem {
    // 평균을 계산하는 함수 (정수 2개)
    public static double average(int score1, int score2) {
        return (score1 + score2) / 2.0;
    }

    // 평균을 계산하는 함수 (정수 3개) - 오버로딩
    public static double average(int score1, int score2, int score3) {
        return (score1 + score2 + score3) / 3.0;
    }

    // 등급을 반환하는 함수
    public static char getGrade(double average) {
        // 90이상: A, 80이상: B, 70이상: C, 그 외: F

//        if (average >= 90) {
//            return 'A';
//        } else if (average >= 80) {
//            return 'B';
//        } else if (average >= 70) {
//            return 'C';
//        } else {
//            return 'F';
//        }

        return average >= 90 ? 'A' : average >= 80 ? 'B' : average >= 70 ? 'C' : 'F';
//      오~~ 삼항연산자로 그냥 바로도 ㄱㄴ하긴 하네.........
    }

    // 학생 정보를 출력하는 함수
    public static void printStudentInfo(String name, int score1, int score2, int score3) {
        // average()와 getGrade() 함수를 호출하여 학생 정보를 출력하세요
        // 출력 형식: "홍길동 학생의 평균: 85.0, 등급: B"
        double avg = average(score1, score2, score3); // 호출
        char grade = getGrade(avg);
        System.out.printf("%s 학생의 평균: %.1f, 등급: %c\n", name, avg, grade);
    }

    public static void main(String[] args) {
        printStudentInfo("홍길동", 80, 85, 90);
        printStudentInfo("김철수", 95, 88, 92);
    }
}
