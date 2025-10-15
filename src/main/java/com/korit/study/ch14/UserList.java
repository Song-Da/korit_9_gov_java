package com.korit.study.ch14;

public class UserList {
    User[] users;

    UserList() {
        this.users = new User[0];
        // 깡통 변수지만 null 은 참조가 불가하고 0이라도 넣어줘서 변수의 기능을 할 수 있게 함.
    }

    int generateUserId() {
        int newId = 1;
        if (users.length == 0) {
            return newId;
        }
        return users[users.length - 1].id + 1;
    }

    void add(User user) {
        User[] temp = new User[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            temp[i] = users[i];
        }
        temp[temp.length - 1] = user;
        users = temp;
    }

    User findByUsername(String username) {
        for (User user : users) {
            if (user.username.equals(username)) {
                return user;
            }
        }
        return null;
    }
}
