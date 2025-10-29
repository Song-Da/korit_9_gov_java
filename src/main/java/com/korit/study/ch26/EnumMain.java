package com.korit.study.ch26;

enum Name { // 오ㅋㅋ
    준일, 준이, 준삼
}

enum Name2 {
    N1("준일"), N2("준이"), N3("준삼"); // <<< 이런 식으로 사용해도 ㄱㅊ음

    private final String value; // 고정값을 쓰는... 상수니까 final 을 붙여줘야 함.

    Name2(String value) {
        this.value = value;
    }

    public String Value() { // getter 가 있어야 변수에 있는 name 을 가져다 쓰니까.
        return value;
    }
}

enum Writer {
    W1("김준일", 32), W2("김준이", 33), W3("김준삼", 34);

    private final String fullName;
    private final Integer age;

    Writer(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }
}

// enumerated -> 열거, 나열
public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Name.준일);
        System.out.println(Name.준이);
        System.out.println(Name.준삼);
        System.out.println(Name2.N1.Value()); // getter 처럼 변수 값을 가지고 옴
        // name 은 N1 에 든 이름을 말하는 것
        System.out.println(Name2.N2);
        System.out.println(Name2.N3);

        System.out.println(Writer.W1.getFullName()); // W1 까지는 W1 출력, fullName 을 가져오면 김준일이 나옴
        System.out.println(Writer.W1.getAge());
        Writer writer = Writer.W1; // 이렇게도 쓸 수 있다. W1 자체에 고정된 값으로 생성이 되는 중

    }
}
/**
 * 열거형도 자료형 중에 하나
 * 좀 희안하게 생긴듯ㅋ;
 *
 * 그런데 생성자 앞에 왜 public 을 못쓰는 거지???
 * new 해서 생성해서 쓰는 게 아니고 상수라서
 * Name.준일 <<< 이런 식으로 사용하고 있는데 N1 이라면 그냥 정해져있는 거고 우리가 생성해서 쓰는 게 아니라
 * 선택하는 것이라서. 저 안에서만 자동으로 생성되는 구조임
 *
 * 이 또한 싱글톤처럼... enum 으로도 만들어낼 수 있음.
 * 준일 준이 준삼이 변할 일 없고 상수처럼 값이 변하지 않게 고정시키고 가져다쓰는 것
 * 이넘은 똑같은 값을 가진 것을 생성한다? 싱글톤처럼 하나 만들어지고 정해두는 것
 *
 * 이넘은 값이 변할 일 없고 고정된 걸 만들 때 상황에 따라서 만드는 편이 좋다.
 *
 *
 *
 */