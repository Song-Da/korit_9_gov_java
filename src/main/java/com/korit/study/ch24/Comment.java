package com.korit.study.ch24;

import java.util.Objects;

public class Comment {
//    private String writer;
    private Writer writer; // Writer 객체가 들어옴
    private String content;

//    public Comment(String writer, String content) {
//        this.writer = writer;
//        this.content = content;
//    }
//
//    public String getWriter() {
//        return writer;
//    }
//
//    public void setWriter(String writer) {
//        this.writer = writer;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {
//        return "Comment{" +
//                "writer='" + writer + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }

    public Comment(Writer writer, String content) {
        this.writer = writer;
        this.content = content;
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

    @Override
    public String toString() {
        return "Comment{" +
                "writer=" + writer +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Comment comment)) return false;
        return Objects.equals(writer, comment.writer) && Objects.equals(content, comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writer, content);
    }
}

/**
 * 저장소의 기능? 언제든지 공유해서 이 기능을 유틸 같은... 그런 식으로
 * 나뉘어질 수도 있고 그런 기능을 분류해둔 게 어떤 건지만 익히고 있으면 됨
 * 유틸 형식, 레포지토리 형식, 서비스 형식 등 코드를 짜다보면 분류하고 묶는 걸(응집도를 높였다.)
 * 조립을 할 때 언제든지 부품을 갈아끼울 수 있게끔 결합도를 낮추는 것에 익숙해지기.
 */