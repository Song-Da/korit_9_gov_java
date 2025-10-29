//package com.korit.study.ch24;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class BoardMain3 {
//    public static void main(String[] args) {
//        String title1 = "게시판 제목1"; // String 으로 게시판 제목을 선언
//
//        HashMap<String, Object> writer1 = new HashMap<String, Object>();
//        // HashMap 은 Key 와 Value 의 쌍
//        // Key : 데이터를 찾기 위한 이름표(index??) || Value : 실제 데이터 값.
//        // String 은 문자열, Object 는 클래스의 최상위인데 진짜 아래에 있는 기능을 쓰기 위해서는 다운 캐스팅을 꼭 해야 함.
//        // 일단 집에 가면 컴퓨터랑 따로 화면 그거 하기... 어렵다...
//
//        writer1.put("name", "김준일"); //writer1 는 현재 String 과 Object 로... 넣을 때 쌍으로 넣어줘야 함.
//        writer1.put("age", 32); // Object 를 사용했기 때문에 숫자를 넣어도 컴파일 오류가 안 뜨는 것.
//
//        String content1 = "게시판 내용1";
//
//        HashMap<String, String> m2 = new HashMap<String, String>();
//        m2.put("writer", "김준이");
//        m2.put("content", "댓글 내용1");
//
//        HashMap<String, String> m3 = new HashMap<String, String>();
//        m3.put("writer", "김준삼");
//        m3.put("content", "댓글 내용2");
//
//        ArrayList<HashMap<String, String>> comments1 = new ArrayList<HashMap<String, String>>();
//        comments1.add(m2);
//        comments1.add(m3);
//
//        HashMap<String, Object> board1 = new HashMap<>()
//    }
//}
//
///**
// * HashMap 은 뭐에 쓰는 거지? 이건 순서가 정해져있지 않음.
// * List 는 key 하나, value 하나를 두는 것 같고 Map 은 다른 거랑 달리 그 아무튼 표 보니까 따로 떨어져있던데
// * 얘는 그거인가봄 key 하나에 여러개 넣는 거 가능한 듯??
// *
// * 아...시발....
// *
// * 아...시발뭐지.....? 파일이 겹치나?
// *
// *
// */