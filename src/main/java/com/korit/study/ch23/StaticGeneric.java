package com.korit.study.ch23;

public class StaticGeneric<T> {

    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T extends String> void print(T data) {
        System.out.println(data);
    }
}

/**
 * 여기서 왜 빨간줄이 뜰까? static 의 특성을 잘 알아야 함.
 * instance 생성. new 가 될 때!
 * static 은 new 가 안 돼도 존재해야 함.
 * 그러니 이걸 어떻게 정해놓으냐. 정해놓을 수가 없음. 하지만 static 뒤에 <T> 를 붙이면 빨간줄이 사라짐.
 * 호출 될 때마다 캡처를 함. 문자열이 들어왔다면 String 으로 자동 변환!
 * 데이터 자료형이 이미 정해져 있으므로 메인에서는 굳이 기재할 필요가 없는 듯??
 *
 * 2 의 상한선은 스트링까지이고 super 가 되면 스트링이 하한선이고 그 위로 있는 것.
 *
 */