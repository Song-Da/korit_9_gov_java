package com.korit.study.ch19;

import java.util.Scanner;

public class 최상위클래스 {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // double 이 int 의 상위이고 업캐스팅이 가능함
        Object c = a;
        Object d = b;
        Object e = "test";
        String f = "abc";
        // Object 는 모든 자료형의 최상위이기 때문에 다 가능함.
        // 하지만 더하기와 같은 자료형은 명확히 숫자여야 하기 때문에 업캐스팅이 된 Object 는 연산은 불가함. (추상화 된 것)
        Car car = new Car("k3", "화이트");
        Car car2 = new Car("k3", "화이트"); // 위와 여기는 같지 않다. 주소값이 다르기 때문
        Object g = car;
        String h = car.toString();
        System.out.println(car); // 오브젝트의 toString
//        System.out.println(c + d);

        String name1 = "김준일";
        String name2 = "김준일";
        boolean result1 = name1 == name2;
        System.out.println(result1);
        String name3 = new String("김준일");
        System.out.println(name3 + " 입니다.");
        Scanner scanner = new Scanner(System.in);
        String name4 = scanner.nextLine();
        System.out.println(name4);
        boolean result2 = name1.equals(name3); // 객체이기 때문에 주소값을 비교한 거고 그래서 false 가 나왔다.
        System.out.println(result2);
        boolean result3 = name2 == name4; // 또 다른 주소를 대입해서 새로운 문자열 객체가 생성됨.
        System.out.println(result3);

        // 문자열 비교시에는 equals 를 사용해야 함. == 같은 걸로는 X
        
    }
}
