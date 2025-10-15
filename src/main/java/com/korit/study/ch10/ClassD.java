package com.korit.study.ch10;

public class ClassD {
//    상수는 최초의 초기화 해야됨 > 그 이후에 값을 바꿀 수 없음 => 변경되면 안돠는 값을 넣어야됨
//    final String name = "";
    final String name;
    int age;
    String address;

    ClassD(String name){
        this.name = name;
    }
}
