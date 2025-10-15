package com.korit.study.ch12;

// 이차원 배열은 행과 열이 아니라 콤마로 생각하면 됨...
public class BoardPrintService {

    void printAll(Board[] boards) {
        System.out.println("게시글 정보 전체 출력");
        for (int i = 0; i < boards.length; i++) {
            Board board = boards[i];
            System.out.println("게시글 ID: " + board.id);
            System.out.println("게시글 제목: " + board.title);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);
            System.out.println("게시글 작성자 이름: " + board.writer.name);
            for (int j = 0; j < board.comments.length; j++) {
                Comment comment = board.comments[j];
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.contents);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.name);
            }
            System.out.println();

//            System.out.println("댓글 ID: " + board.comments[0].id);
        }

        for (Board board : boards) { // index 가 필요하지 않으면 for each 를 쓰면 됨.
            System.out.println("게시글 ID: " + board.id);
            System.out.println("게시글 제목: " + board.title);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);
            System.out.println("게시글 작성자 이름: " + board.writer.name);
            for (Comment comment : board.comments) {
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.contents);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.name);
            }
            System.out.println();
        }
    }
}
