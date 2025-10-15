package com.korit.study.ch03;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        클래스 명과 동일하게 쓰는데 소문자로 씀. Ctrl+spece 하면 바로 자동완성이 가능함.
        System.out.println("1번 주소와 2번 주소를 입력하세요: ");
        String address1 = scanner.next();
        String address2 = scanner.next();
        System.out.println("주소1: " + address1);
        System.out.println("주소2: " + address2);

        int num1 = Integer.parseInt(scanner.next()); // 입력된 문자열을 숫자로 바꿔라는 뜻
        int num2 = Integer.parseInt(scanner.next());
        System.out.println("num1 + num2 = " + (num1 + num2)); // 괄호를 쳐서 감싸서 정확하게 해야 한다.

        int num3 = scanner.nextInt(); // nextint 는 라인이 아니기 때문에 띄어쓰기와 엔터를 구분함.
        int num4 = scanner.nextInt(); // 이거 다음 문자열 입력이 일어나야 한다면 Line 으로 한 번 버퍼를 덜어내야 함.
        System.out.println("num3 + num4 = " + (num3 + num4));
        scanner.nextLine(); // 여기서 엔터가 날아가고 새 입력이 가능하다.
        String addressAll = scanner.nextLine();
        System.out.println("전체 주소: " + addressAll);

    }
}
