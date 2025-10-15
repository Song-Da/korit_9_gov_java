package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {
        // Board 배열 - boards -> 게시글 2개

        // Board - id(정수), title(문자열), contents(문자열, writer(Writer), comments(Comment[])

        // Writer - id(정수), name(문자열)

        // Comment - id(정수), contents(문자열), writer(Writer)

        // 1. Board 배열 2개의 공간 생성
        // 2. Writer 3명 생성
        // 3. Comment 4개 생성
        // 4. Board 2개 생성 -> 게시글 작성자와 댓글 작성자는 원하는 작성자를 주입한다.


//        Writer writer1 = new Writer(1, "김준일");
//        Writer writer2 = new Writer(2, "김준이");
//        Writer writer3 = new Writer(3, "김준삼");
        // 똑같은 자료형이면 배열로 묶고 싶음.
        // 정보를 저장하기 위해 사용하는 것... 객체로 한개를 만들 수도 배열을 써서 한묶음으로 만들 수도
        
        
        Writer[] writers = new Writer[3];
        writers[0] = new Writer(1, "김준일");
        writers[1] = new Writer(2, "김준이");
        writers[2] = new Writer(3, "김준삼");

//        Comment[][] comments = new Comment[2][]; // 왼쪽은 바깥에 있는 배얄의 크기, 오른쪽은 안쪽.
        // 코멘트 배열을 묶는 배열이 존재할 수 있다. 왜? 자료형이 같으니까.

        Comment[][] comments = new Comment[2][]; // 코멘트 뒤의 1, 2, 3 같은 아이디는 같으면 안됨. 해당 댓글을 고르기가 어려워지기 때문에... = 모든 데이터를 분류해주는 기본 키값.
        comments[0] = new Comment[3];
        comments[1] = new Comment[3]; // 값을 저장할 수 있는 코멘트 수를 정해놔야 하니까... 3개씩 댓글...
        comments[0][0] = new Comment(1, "게시글1의 댓글1", writers[0]);
        comments[0][1] = new Comment(2, "게시글1의 댓글2", writers[0]);
        comments[0][2] = new Comment(3, "게시글1의 댓글3", writers[2]);
        comments[1][0] = new Comment(4, "게시글2의 댓글1", writers[1]);
        comments[1][1] = new Comment(5, "게시글2의 댓글2", writers[0]);
        comments[1][2] = new Comment(6, "게시글2의 댓글3", writers[2]);


        Board[] boards = new Board[2];
        boards[0] = new Board(1, "테스트 게시글1", "테스트 게시글 내용1", writers[1], comments[0]);
        boards[1] = new Board(2, "테스트 게시글2", "테스트 게시글 내용2", writers[0], comments[1]);
        // 게시글 객체가 1개 만들어짐

        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.printAll(boards);


    }
}

/**
 * 객체를 만드는 이유
 * 1. 정보를 저장
 * 2. 기능을 정의, 분리
 *
 * 값 -> 리터럴 = 상수 || 0~9 (숫자들), a,b,c (문자들)
 * 이미 존재하고 바꿀 수 없는 값을 리터럴이라고 한다.
 * 공간을 만들어야 값을 저장할 수 있다. 공간을 만드는 건 컴퓨터에서 메모리 할당이라고 함.
 *
 * 객체 -> 관련있는 정보들을 하나로 묶어서 저장, 값을 저장할 수 있는 걸 할당. 이걸 정의하는 건 클래스.
 * 복사 붙여넣기 하는 행위가 생성. 생성자에게 맡기는...
 * 객체 안에 또 다른 객체가 들어
 *
 * 응집도가 높아야 함. 관련있는 것들끼리 묶어놔야 함. 근데 관련이 없으면 따로 분리를 해서
 * 응집도를 올려야 한다. 결합도는 낮아야 한다.객체 안의 객체가 따로 관리가 되지 않음.
 * 좋은 프로그램이라는 건 결합도를 낮추고 응집도를 높여야 한다.
 * 1객체와 2객체가 따로 만들어져서 독립적이어야 함. 큰 기능이 꼭 1객체가 필요한데 그럼?
 * 2 가 1 을 의존해서 기능이 실행되는... 의존성을 분리시키고 주입시키는 게 디펜더시 인젝션 D.I
 * 의존성 주입. 스프링부트가면 이거 무조건 함.
 *
 * 추상화 (중요함)
 *
 */