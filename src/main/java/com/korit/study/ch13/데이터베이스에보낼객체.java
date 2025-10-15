package com.korit.study.ch13;

public class 데이터베이스에보낼객체 {
    String username;
    String password;
    String name;
    String email;

    데이터베이스에보낼객체() {} // 오버로딩...? 생성자를 만들어둬야 호풀 가능

    데이터베이스에보낼객체(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
}
