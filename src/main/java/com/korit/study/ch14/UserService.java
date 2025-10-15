package com.korit.study.ch14;

public class UserService {

    UserList userList;

    UserService(UserList userList) {
        this.userList = userList;
    }

    boolean idDuplicatedUsername(String username) {
        return userList.findByUsername(username) != null;
    } // 결과 중복 확인 로직
    
    // 로그인
    User signin(SigninDto signinDto) {
        User foundUser = userList.findByUsername(signinDto.username);
        if (foundUser == null) {
            // 사용자이름(아이디)가 존재하지 않는다.
            return null;
        }
        if (!foundUser.password.equals(signinDto.password)) {
            // 가져온 사용자이름과 번호가 같지 않니?
            return null;
        }
        return foundUser;
        // 찾은 유저를 그대로 리턴해주겠다
    }

    // 회원가입
    void signup(SignupDto signupDto) {
        User user = signupDto.toUser();
        user.id = userList.generateUserId();
        userList.add(user);
    }

    void printUserListAll() {
        System.out.println("등록된 사용자 전체 조회");
        for (User user : userList.users) {
            System.out.println(user.toString());
        }
    }

}
