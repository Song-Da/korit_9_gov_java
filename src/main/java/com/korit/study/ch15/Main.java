package com.korit.study.ch15;

public class Main {
    public static void main(String[] args) {
        푸들 a = new 푸들("뽀삐");
        a.먹다();
        산책 b = new 말티즈();
    }
}

// 인터페이스는 생성할 수 없다. 안에 추상적인 게 들어있기 때문에... 추상 메서드.
// 클래스는 그냥 찍어내면 됨. 안에 다 구현이 되어있으니까.
// 오버라이드 = 재정의
