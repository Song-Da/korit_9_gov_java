package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.List;

public class BoardMain4 {
    public static void main(String[] args) {
        List<Board> boards = new ArrayList<>();
        boards.add(new Board()); // 매개변수를 꼭 넣어야 그게 되는 건 아님. 깡통 코드를 하나 만들면 이렇게도 됨.
        boards.get(0).setTitle("게시판 제목1"); // get 과 set 이 왜 있지?
        boards.get(0).setWriter(new Writer("김준일", 32));
        boards.get(0).setContent("게시판 내용1");
        boards.get(0).setComments(new ArrayList<>());
        // 왜 여기는 명시를 안 하지? setComments 안에 이미 인스턴스 변수에 코멘트라 되어 있기 때문에.
        // 타고 들어가면 그렇게 되어 있음. 코멘트를 담을 수 있는 상자.
        boards.get(0).getComments().add(new Comment(new Writer("김준이", 31), "댓글 내용1"));
        boards.get(0).getComments().add(new Comment(new Writer("김준삼", 31), "댓글 내용2"));
        // 이따가 읽어보기... get...
        // ======= 여기까지가 보드 객체 1 완성 =======
        // 이 아래로는 get 없이 사용하는... 변수에다가 넣으면 딱히?
        
        Board board = new Board();
        board.setTitle("게시판 제목2");
        board.setWriter(new Writer("김준사", 34));
        board.setContent("게시판 내용2");
        // 앞에 보드라고 쓰여있고 심지어 여기 보드도 new 할 때 생성자로 넣을 수 있나....... 오알규그거
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(new Writer("김준오", 35), "댓글 내용1")); // 왜케 신기하게 짜는 거지?
        comments.add(new Comment(new Writer("김준육", 36), "댓글 내용2"));
        board.setComments(comments); // 이렇게 보드 객체가 완성되고
        boards.add(board);

        /// ///////////////////////////////////////////////////////////////

        List<Comment> comments2 = new ArrayList<>();
        comments2.add(new Comment(new Writer("김준오", 35), "댓글 내용1"));
        comments2.add(new Comment(new Writer("김준육", 36), "댓글 내용2"));

        Board board2 = new Board("게시판 제목2",
                new Writer("김준사", 34),
                "게시판 내용2", comments2);

        boards.add(board2);

        System.out.println(boards);

    }
}


/**
 * 사용법을 익히고 코드 계속 쳐보기
 * 깊이 들어가지 말기 (깨달음이나 얻기)
 * 
 * 변수의 이름이 낭비될 수 있다.
 *
 * 1번째 보드는 깡통 보드를 만들어서 인덱스 위치를 정해주고 set 해서 값을 집어넣는 것.
 * 2번째 보드는
 * 3번째 보드는 그 뭐냐...
 *
 * 간단한 정보를 넘길 때는 Map 을 쓰고 자주 쓰고 뭐가 좀 많을 때는 객체를 생성해서 쓰는 게 낫는 듯.
 * set 같은 건 중복 제거하는 용도로 사용하는 것. 잘 쓰일 일이 없음.
 */