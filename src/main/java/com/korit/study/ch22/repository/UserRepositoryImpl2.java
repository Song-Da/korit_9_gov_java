package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UserRepositoryImpl2 implements UserRepository {
    private static UserRepositoryImpl2 instance;
    private List<User> users;
    private int autoIncrementId;

    private UserRepositoryImpl2() {
        users = new ArrayList<>(); // 위 리스트에 유저라고 명시되어 있으므로 생략이 가능함.
        autoIncrementId = 1;
    }

    public static UserRepositoryImpl2 getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepositoryImpl2();
        }
        return instance;
    }

    public void insert(User user) { // insert 호출이 됨.
        user.setId(autoIncrementId++);
        users.add(user); // add 명령 하나면 해결됨.
    }

    public User findByUsername(String username) {
        for (User user : users) { // 반복 돌리면서 유저를 꺼냄
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override // 스트링빌더 가비지 컬렉터 왜 쓰는 건지 이유 찾아보기.
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); //
        stringBuilder.append("User 배열 : [");
        for (int i = 0; i < users.size(); i++) {
            stringBuilder.append(users.get(i)); // get 메서드를 활용해 인덱스를 옮겨준다.
            if (i != users.size() - 1) {
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