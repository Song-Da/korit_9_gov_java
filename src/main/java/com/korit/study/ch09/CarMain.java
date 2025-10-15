package com.korit.study.ch09;

class Car{
    String model;
    String color;
}

public class CarMain {
    public static void main(String[] args) {
        String model = "소나타";
        String color = "검정색";
        String model2 = "아반떼";
        String color2 = "파랑색";
        String[] models = new String[100000];
        String[] colors = new String[100000];
        models[99954] = "소나타";
        colors[99954] = "검정색";

        Car c1 = new Car();
        c1.model = "소나티";
        c1.color = "검정색";

        Car c2 = new Car();
        c2.model = "아반떼";
        c2.color = "파랑색";

//        인스턴스는 기본값으로 초기화 해준다. 그래서 따로 초기화 안해도 됨
//        class Car에서 model와 color가 초기화 안 되어 있는데 c3.model을 출력하면 null이 나옴
        Car c3 = new Car(); // new Car() => 생성
        System.out.println(c3.model);




    }
}
