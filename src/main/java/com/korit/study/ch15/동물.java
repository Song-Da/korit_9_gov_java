package com.korit.study.ch15;

public class 동물 {
    String 이름;

    동물() {}

    동물(String 이름) {
        System.out.println("동물 생성자: " + 이름);
        this.이름 = 이름;
    }

    void 먹다() {
        System.out.println(이름 + "이(가) 밥을 먹는다."); // 먹는다는 기능만 추상화 시켜놓고 안에 어떻게 먹는지는 구현하는 쪽에서 추상화시키겠다. (인터페이스)
    }
}
