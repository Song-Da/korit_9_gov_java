package com.korit.study.ch31;

import java.io.IOException;
import java.util.List;

/**
 *  예외처리 (Exception or Error)
 *  Throwable -> Error(오류), Exception(예외)
 *  오류 (사용자 제어 불가) -> OutOfMemoryError (메모리 공간 부족), StackOverFlowError()
 *  예외 (사용자 제어 가능) -> Exception
 *      1. IOException (checked Exception)
 *      2. SQLException (checked Exception)
 *      3. RuntimeException (unchecked Exception)
 *
 *  Checked Exception -> 컴파일 타임 예외
 *  1. 컴파일 시점에 확인되는 예외
 *  2. 반드시 처리해야 하는 예외
 *  3. 파일, 네트워크, 데이터베이스 연결
 *
 *  Unchecked Exception -> 런타임 예외
 *  1. 실행 중 발생하는 예외
 *  2. 처리를 선택적으로 해줄 수 있음
 *  3. 주소 참조, 실행 도중 자원(쓰레드, 인스턴스)의 부재
 *  4. RunTimeException 을 상속받음
 *
 */

public class ExceptionMain {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            String name = "김준일";
            if (count == 10) {
                name = null;
            }
            try {
                System.out.println(name.startsWith("김"));
            } catch (NullPointerException e) {
                e.printStackTrace();
                break;
            }
            count++;
        }
        System.out.println("프로그램 정상 종료");

        try {
            printAll(List.of(10, 20, 30, 40), 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            String[] names = {"김준일", "김준이"};
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");

        try {
            printAll2(List.of(10, 20, 30, 40), 5);
        } catch (IOException e) {
            // 여긴 굳이 안 적어도 됨. 오류가 나면 이쪽으로 옮겨지는 거라.
        }

        try {
            printAll3(List.of(10, 20, 30, 40), 5);
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        try {
            printAll(List.of(10, 20, 30, 40), 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printAll(List<Integer> nums, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(nums.get(i));
        }
    }

    public static void printAll2(List<Integer> nums, int size) throws IOException {
        for (int i = 0; i < size; i++) {
            System.out.println(nums.get(i));
        }
    }

    public static void printAll3(List<Integer> nums, int size) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < size; i++) {
            System.out.println(nums.get(i));
        }
    }
}

/**
 * 오류를 잡아내려면 실행이 모두 되기 전에... 오휴를 잡아내는 것.
 * Runtime 이 실행중을 나타내고
 *
 * 어떤 예외들이 터진 건지 쭉 나열해주면 됨.
 * try 로 묶고 catch 러 풀력
 *
 *
 * throw -> 호출할 때에는 이걸 꼭 예외처리 해줘
 * 체크드와 언체크드도 꼭 체크해달라는 그거
 *
 * 오류가 났을 때 프로그램이 강제종료가 되지 ㅇ낳도록 예외처리를 해주어야 한다.
 * 예외가 터지면
 *
 */