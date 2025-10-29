//package com.korit.study.ch24;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BoardMain2 {
//    public static void main(String[] args) {
//
//        Writer writer1 = new Writer("김준일", 32);
//
//        Comment comment1_1 = new Comment("김준이", "댓글 내용1");
//        Comment comment1_2 = new Comment("김준삼", "댓글 내용2");
//        List<Comment> comments1 = new ArrayList<>();
//        comments1.add(comment1_1);
//        comments1.add(comment1_2); // 기본적인 방법?
//
//        Board post1 = new Board("게시판 제목1", writer1, "게시판 내용1", comments1);
//
//
//        Writer writer2 = new Writer("김준사", 34);
//
//        Comment comment2_1 = new Comment("김준오", "댓글 내용11");
//        Comment comment2_2 = new Comment("김준육", "댓글 내용22");
//        List<Comment> comments2 = new ArrayList<>();
//        comments2.add(comment2_1);
//        comments2.add(comment2_2);
//
//        Board post2 = new Board("게시판 제목2", writer2, "게시판 내용2", comments2);
//
//        List<Board> boardList = new ArrayList<>(); // ㅈㄴ 뭘까...
//        boardList.add(post1);
//        boardList.add(post2);
//
//        System.out.println(boardList);
//
//
//    }
//}
