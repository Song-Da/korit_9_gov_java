package com.korit.study.ch11;

public class StudyMain {
    public static void main(String[] args) {
        // 과목명: JAVA 기초
        // 담당 선생님 이름: 김준일
        // 담당 선생님 나이: 32
        // 학생1 ID: 20250001
        // 학생1 이름: 박재현
        // 학생1 나이: 24
        // 학생2 ID: 20250002
        // 학생2 이름: 고대한
        // 학생2 나이: 19
        // 학생3 ID: 20250003
        // 학생3 이름: 양재원
        // 학생3 나이: 27
        // 스터디 객체를 생성하시오.

        // 학생 객체 3개를 생성
        Student s1 = new Student(20250001, "박재현", 24);
        Student s2 = new Student(20250002, "고대한", 19);
        Student s3 = new Student(20250003, "양재원", 27);
        // 학생 배열 생성
        Student[] students = new Student[3];
        // 학생 배열에 3명의 학생을 추가
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        // 선생 객체 1개 생성
        Teacher teacher = new Teacher("김준일", 32);
        // 과목 객체 1개 생성
        Subject subject = new Subject("JAVA 기초", teacher);
        // 스터디 객체 1개 생성
        
        Study study = new Study(subject, students);

        StudyPrintService studyPrintService = new StudyPrintService();
        studyPrintService.printInfoAll(study);
        System.out.println("====================");
        studyPrintService.printInfoSubject(study.subject);
        System.out.println("====================");
        studyPrintService.printInfoTeacher(study.subject.teacher);
        System.out.println("====================");
        studyPrintService.printInfoStudent(study.students[0]);


    }
}
