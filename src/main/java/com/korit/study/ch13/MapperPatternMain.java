package com.korit.study.ch13;

public class MapperPatternMain {
    public static void main(String[] args) {

        // Mapper Pattern
        
        클라이언에서받은객체 a = new 클라이언에서받은객체();
        a.username = "test1234"; // id 대신 username
        a.password = "1q2w3e4r";
        a.fullName = "김준일"; // 회원 성명
        a.email = "test@gmail.com";
        // id 는 개발자들끼리 키값으로 불리고 있고 회원들 아이디는 username 으로 통일. (이건 카멜표기X)

//        데이터베이스에보낼객체 b = new 데이터베이스에보낼객체();
//        b.username = a.username; // 매핑
//        b.password = a.password;
//        b.name = a.fullName;
//        b.email = a.email;
//        // a 에 든 정보가 b 에게 들어가는 형태...

        데이터베이스에보낼객체 c = a.to();
        // a 안에


    }
}
