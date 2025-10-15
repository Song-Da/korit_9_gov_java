package com.korit.study.ch09;

public class Product {
//    ProductMain에 쓰일 내용들
    String name;
    int price;

    int discount(){
        return (int) (price - (price * 0.2)); //20% 할인 된 가격
    }
}
