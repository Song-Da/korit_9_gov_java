package com.korit.study.ch13;

public class 클라이언에서받은객체 {
    String username;
    String password;
    String fullName;
    String email;

    // 메소드명이 to 인 것
    데이터베이스에보낼객체 to() {
        데이터베이스에보낼객체 a = new 데이터베이스에보낼객체();
        a.username = username; // a 유저네임에 대입을 해주겠다.
        a.password = password;
        a.name = fullName;
        a.email = email;
        return a;
    }

    데이터베이스에보낼객체 to2() {// 객체를 생성하자마자 리턴...?
        return new 데이터베이스에보낼객체(username, password, fullName, email);
    }
}
