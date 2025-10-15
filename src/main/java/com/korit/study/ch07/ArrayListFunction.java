package com.korit.study.ch07;

import java.util.Scanner;

public class ArrayListFunction {

    // 함수의 이름은 무조건 동사, 변수의 이름은 명사로 짓기를 구분지어야 함.
    // 이 기능은 실행한 후에 돌려주는 것. 즉 리턴이 없으므로 void 를 붙임.

    public static void printNameAll(String[] names) { // 변수명을 똑같이 맞춰줄 필요X 매개변수도 새로 선언하는 것이기 때문에 같지 않음. 그냥 통일을 시키는 것
        if (names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + i + "): " + names[i]); // 현재 names 안에 들어간 이름을 하나하나 출력하는 것.
            }
        }
    }

    public static String[] addToArray(String value, String[] currentArray) {
        String[] newArray = new String[currentArray.length + 1]; // new String 으로 기존보다 더 큰걸 새로 만들어버려서 이렇게 됨.
        for (int i = 0; i < currentArray.length; i++) { // 반복 돌리면서 이동하라는 느낌
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름입력: ");
        return scanner.nextLine();
    }

//    add 추가하다 || names 는 배열이니까... name 으로 명명
    public static String[] addInputNameToNames(String[] names) {
        String name = inputName();
        return addToArray(name, names);
    }

    public static void main(String[] args) {

        String[] names = new String[0];

//        printNameAll(names);
//
//        System.out.print("1번 이름입력: ");
//        String name1 = scanner.nextLine();
//        String[] newNames = new String[names.length + 1]; // 기존의 names 보다 1개 큰 거
//        newNames[newNames.length - 1] = name1; // 내가 입력받은 이름을 추가하는 것 || 이 부분이 조금 어려운 듯?
//        names = newNames; // names 가 새로 입력된 이름이 들어가있을 것.

//        if (names.length == 0) { // names 에 현재 뭔가가 들어가서 0 과 같지 않으므로 false 인 else 부분으로 들어가서 출력함.
//            System.out.println("등록된 이름이 없습니다.");
//        } else {
//            for (int i = 0; i < names.length; i++) {
//                System.out.println("이름(" + i + "): " + names[i]);
//            }
//        }

        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);

    }
}
/*
기존의 배열에 있는 걸 옮긴다.
함수 하나하나가 컴포넌트 기능... (아토믹 패턴)
원자 단위로 잘게잘게 만든다는...
초반엔 큰 기능부터 만든다고 함.

함수를 잘 한다는 건 흐름을 빨리 잘 읽고 이해하는 능력이 필요
함수의 순서는 딱히 상관이 없음.
파이썬은 순서가 매우 중요함
자바 스크립트는 순서 호이스팅이 가능함.

 */

/**
 * 함수로 만들어서... 중복 코드를 줄이자.
 * 함수, 반복문, 배열, 조건을 다져놔야....................
 * 앞으로의 그게 쉽다... 공부합시더
 */