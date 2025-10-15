package com.korit.study.ch09;

public class ProductMain {
    public static void main(String[] args) {
//        Product에 내용을 갖고 와서 쓰임
        Product p1 = new Product();
        p1.name = "아이폰17";
        p1.price = 1200000;
        int p1DdiscountPrice = p1.discount();

        System.out.println("사품명: " + p1.name);
        System.out.println("원가: " + p1.price);
        System.out.println("할인가: " + p1DdiscountPrice);
        System.out.println("할인가: " + p1.discount()); //이렇게 써도 출력이 됨
    }
}
