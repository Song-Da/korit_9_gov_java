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
        Book book = new Book("K3", "화이트");
        System.out.println(car.equals(book)); // 자료형이 다르기 때문에 비교가 되지 않음.
        System.out.println(car.hashCode() == book.hashCode()); 
        // 위는 같다. 안에 들어있는 해시 값으로 비교하는 것이기 때문에...
        // 소유하고 있는 값에 의해서 비교를 함 이퀄스는 자료형까지 확인하고 해시는 안에 든 값만 비교를 함

        System.out.println(car.equals(car2));
        Object g = car;
        String h = car.toString();
        System.out.println(car); // 오브젝트의 toString
//        System.out.println(c + d);

        String name1 = "김준일";
        String name2 = "김준일";
        boolean result1 = name1 == name2; // == 은 주소값을 비교함. 리터럴 주소가 동일하여 true 가 나옴
        System.out.println(result1);
        String name3 = new String("김준일"); // new 는 새로운 객체가 생겨나면서 리터럴 주소가 생김
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
/**
 * equals 는 오브젝트에 들어가 있음.
 * 이퀄스는 객체 참조해서 하나하나 이게 맞는지 비교
 * 해시 코드는 시간 복잡도가 제일 짧고 한번만에 찾음. 해시 코드로 비교를 하는 게 컴퓨터도 베스트
 *
 * 1차적 해시코드 비교, 2차적으로는 이퀄스로 2차 검증을 한다.
 *
 *
 *
 */