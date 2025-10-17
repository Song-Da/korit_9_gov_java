package com.korit.study.ch19;

import java.util.Objects;

public class Book {
    private String model;
    private String color;

    public Book(String model, String color) {
        this.model = model;
        this.color = color;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (o.getClass() != Car.class) {
//            return false;
//        }
//        Car car = (Car) o;
//        if (Objects.isNull(car));
//        return Objects.equals(model, car.model) && Objects.equals(color, car.color);

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/**
 * toString 을 꼭 쓰거나 값으로 쓰지는 않고 이 객체 안에 어떤 값이 들어있는지
 * 확인하기 위해 사용을 함.
 * 오버라이드를 했다는 건 부모 객체로부터 받아온 거고 Object 는 기재하지 않아도 기본적으로
 * 되어있는...
 *
 * Car1.equals(10); << 는 오휴가 나지 않는다.
 * 왜? 오브젝트니까... 문자열을 넣어도 오브젝트이기 때문에 오류가 나지 않음.
 * 파이썬은 타입을 확인하는 작업이 없고 알아서 타입 변환을 함.
 * 어떤 값이 들어올지, 모든 값을 받아야 될 때
 *
 * 오브젝트는 어떤 자료형이 들어와도 다 허용을 하지만 문제가 하나 있다.
 *
 * null +safe 늘 ㅏㅁ모고 머군 개
 */