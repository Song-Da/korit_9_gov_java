package com.korit.study.ch23;

public class Generic<T, T2> { // 만약 제네릭 타입을 따로 분리해서 사용하고 싶다면 이렇게 여러개 사용이 가능함.
    private T data; // <= 여기가 오브젝트, 유저, 스트링 등 각 다르게 바뀌었으면 좋겠다는 의미.
    private T data2;
    private Double data3;
    private T2 data4;
//    private T[] arr;

//    public Generic(T data) { // 여길 보면 매개변수로 T가 들어가 있다.
//        this.data = data;
//    }
//
//    public T getData() { // 여기도 리턴 타입이 T 로 되어 있음.
//        return data;
//    }

    public Generic(T data, T data2, Double data3, T2 data4) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
//        arr = new T[10]; // 여기서 잘못 된 없는데 빨간줄이 뜸. 제네릭으로 하려니 선언은 되지만 생성이 불가.

    }

}

/**
 * 변수를 쓰는 게 10이 들어갈 수도 20이 들어갈 수도 유동적인데 Generic 은 자료형 자체를 변수처럼 바꿔서
 * 쓰고 싶다는 생각으로 만들어진 방법이다. 변수 앞에 꺽쇠<>에 기본은 T(type) 이지만 다른 이름을 넣어도 되긴 한다.
 * 하지만 꼭 제네릭은 대문자에 딱 한 글자만 쓰기로 약속을 한다.
 *
 * 모든 일반적인 제네릭은 T 로 타입이 계속해서 바뀔 거라는 의미로 T 를 적고
 * R 도 적을 수 있다. return type 이라는 의미. E 는 element 라는 요소. 객체를 요소라고도 부름.
 * 제일 중요한 건 변수명을 선언하는 것처럼 해줘야 Generic 사용이 가능하다는 것
 *
 * 제네릭 타입으로는 배열이 생성이 불가함.
 *
 *
 *
 */