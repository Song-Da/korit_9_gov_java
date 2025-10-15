package com.korit.study.ch14;

import java.time.LocalDateTime;

public class Todo {
    int id;
    String contents;
    User user;
    LocalDateTime createdAt; // 날짜 시간까지 포함된 데이터는 LocalDateTime 을 씀.

    public Todo(int id, String contents, User user, LocalDateTime createdAt) {
        this.id = id;
        this.contents = contents;
        this.user = user;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", user=" + user +
                ", createdAt=" + createdAt +
                '}';
    }


}
