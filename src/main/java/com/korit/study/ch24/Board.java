package com.korit.study.ch24;

import java.util.List;
import java.util.Objects;

public class Board {
    private String title; // 제목
    private Writer writer; // 작성자
    private String content; // 게시글
    private List<Comment> comments; // 게시글 하나에 여러개의 댓글이 달리니까 리스트를 써야 함.
    // 이 리스트 안에 댓글 정보에 대한 묶음. 코멘트 객체가 들어가 있어야 함.
    // 이름은 복수형으로...

    public Board(String title, Writer writer, String content, List<Comment> comments) {
        // 끝에 매개변수가 List 통째로가 들어와야 함.
        // 댓글들이 들어있는 리스트를 만들고 그 안에 다 넣어줌 아니면 깡통 리스트를 만들어서
        // get 해서 가져오면 그 리스트 주소에 add 를 해서 사용할 수도 있음.
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.comments = comments;
    }

    public Board() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                ", writer=" + writer +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Board board)) return false;
        return Objects.equals(title, board.title) && Objects.equals(writer, board.writer) && Objects.equals(content, board.content) && Objects.equals(comments, board.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, writer, content, comments);
    }
}
