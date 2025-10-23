package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;

public class UserRepositoryImpl implements UserRepository {
    private static UserRepositoryImpl instance;
    private User[] users;
    private int autoIncrementId = 1;

    private UserRepositoryImpl() {
        users = new User[0];
        autoIncrementId = 1;
    };

    public static UserRepositoryImpl getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);
        user.setId(autoIncrementId++); // 1을 초기화시켜놨기 때문에 후증가
        temp[temp.length - 1] = user;
        users = temp;
    }

    public User findByUsername(String username) {
        for (User user : users) { // 반복 돌리면서 유저를 꺼냄
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    
    private int generateId() {
        return users[users.length].getId() + 1;
    }

    @Override // 스트링빌더 가비지 컬렉터 왜 쓰는 건지 이유 찾아보기.
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); //
        stringBuilder.append("User 배열 : [");
        for (int i = 0; i < users.length; i++) {
            stringBuilder.append(users[i]);
            if (i != users.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}

/**
 * repository 는 저장소이고 한군데에만 만들어둬야 한다. 그러므로 싱글톤으로 정의해야 함.
 * StringBulider 는 문자열과 다른 문자열을 연결하면 새 문자열이 생성되고 이전 문자열은 가비지 컬렉터로
 * 자동으로 사라지게 된다. 그래서 쓰는 듯?
 */