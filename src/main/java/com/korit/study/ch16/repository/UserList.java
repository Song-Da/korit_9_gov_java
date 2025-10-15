package com.korit.study.ch16.repository;

import com.korit.study.ch16.entity.User;

public class UserList {
    private User[] users;

    public UserList() {
        this.users = new User[0];
        // 깡통 변수지만 null 은 참조가 불가하고 0이라도 넣어줘서 변수의 기능을 할 수 있게 함.
    }

    public int generateUserId() {
        int newId = 1;
        if (users.length == 0) {
            return newId;
        }
        return users[users.length - 1].getId() + 1;
    }

    public User[] findAll() {
        return users;
    }

    public void add(User user) {
        User[] temp = new User[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            temp[i] = users[i];
        }
        temp[temp.length - 1] = user;
        users = temp;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
