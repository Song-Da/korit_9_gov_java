package com.korit.study.ch24;

public class Comment {
    private String writer;
    private String content;

    public Comment(String writer, String content) {
        this.writer = writer;
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
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
                "writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
