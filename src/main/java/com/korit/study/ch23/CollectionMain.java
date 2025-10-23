package com.korit.study.ch23;

import java.util.ArrayList;

public class CollectionMain {
    public static void main(String[] args) {
        // 컬렉션이라느 것들은 제네릭을 자연스럽게 도입할 수밖에 없게 됨.
        ArrayList list = new ArrayList<>(); // 대문자로 시작함. 클래스임. 그럼 객체!
        list.add(10); // 0
        list.add("20"); // 1
        list.add(30.5); // 2
        list.add(true); // 3
        System.out.println(list);
        System.out.println(list.get(0));
        ArrayList<String> strList = new ArrayList<>(); // 뒤에는 자료형을 생략 가능.
//        new ArrayList<>(); // 독립적으로 세워줄 수도 있음. 하지만 String 이라 기재되어 있지 않기 때문에!
        strList.add("문자열"); // 이미 String 으로 해뒀기 때문에 문자열만 드렁감.
        System.out.println(strList.get(0)); // String 값
//        String[] 을 쓴 것과 동일하다는 뜻.

        test(new ArrayList<>());
        // 이 자료형은 String 이다 왜냐하면 아래의 String 으로 매개변수에 기재를 해뒀기 때문.
    }

    public static void test(ArrayList<String> strList) {

    }
}

/**
 * 배열 자료형 대신 자주 쓰게 될 배열 형태의 리스트
 * 어떤 자료형이든 다 들어가는데 이걸 보고 알 수 있어야 하는게 오브젝트.
 * 자료형 상관없이 들어가는 건 모두 오브젝트라고 보면 됨.
 * 값을 집어넣을 때 메서드를 사용했고 빼낼 때도 메서드를 사용해야 함.
 *
 * 이를 꺼내서 쓰면 오브젝트 형태로 나옴. 즉 업캐스팅 되어 있는 형태로 나오니 다운캐스팅을 해줘야 한다.
 * 오브젝트를 쓰는 게 나쁜 것이 아니라 어쩔 수 없이 쓰게 되는 상황이 자주 나옴.
 * Array 리스트
 * 제네릭 타입을 명시하지 않으면 오브젝트. 명시한다면 해당 타입대로 생성이 됨.
 * 자료형이 유동적일 필요가 없다면 쓰지 않아도 되지만, 자료형이 유동적이길 바란다면 제네릭 형태로 써야 함.
 * 제네릭 자체가 타입의 추상화. 변수도 어떻게 보면 어떠한 값들을 추상화하는... 추상화라는 개념이 중요함.
 * 추상화가 되어있어야 유연성을 가짐.
 *
 * 와일드 카드 개념 이해. 와일드 카드에서 타입이 올라가고 내려가는 것 이해.
 */