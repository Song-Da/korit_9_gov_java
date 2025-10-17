package com.korit.study.ch22.service;

// 패키지 선택 잘 해야 함. import 잘못해서 다른 패키지의 내용 가져오면 오류 남.
import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SignupService {
    // 1. instance static 변수 정의
    private static SignupService instance; // 싱글톤 첫도입
    private UserRepository userRepository;
    
    private SignupService(UserRepository userRepository) { // 생성자를 private 를 걸어준다. 다른 곳에서는 언급이 불가능.
        this.userRepository = userRepository;
    }

    public static SignupService getInstance() { // 외부에서 접근이 가능하게 만들어둠.
        if (Objects.isNull(instance)) { // instance 의 값이 null 이니?
            instance = new SignupService(UserRepository.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) { // 유효성 검사
        User foundUser = userRepository.findByUsername(username);
        if (Objects.isNull(foundUser)) {
            return true;
        }
        return false;
    }

    public boolean isValidPassword(String password) {
        return !Objects.isNull(password) && !password.isBlank();
        // trim 은 문자열 양쪽의 공백을 무조건 제거함. isBlank() 는 공백이냐고 묻는 것. unll 도 아니고 공백도 없어야 한다는 뜻.
    }

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        // 여기는 공백 검사를 할 필요가 없음!
        if (Objects.isNull(password) || Objects.isNull(confirmPassword)) {
            return false;
        }
        return password.equals(confirmPassword);
    }

    public void signup(SignupDto signupDto) {
        User newUser = new User(0, signupDto.getUsername(), PasswordEncoder.encode(signupDto.getPassword()));
        userRepository.insert(newUser); // 새로운 유저를 추가하는 일
    }
}

/**
 * 컴파일: 컴파일이 되어질 때 처음부터 끝까지 만들어주는 딱 하나의 공간
 * 변수명은 instance 로 고정하기로 약속.
 * 서비스는 유일하게 하나만 있어도 되므로 싱글톤으로 만든다.
 * 여러개 만들 필요가 X
 *
 * isEmpty 는 trim 과 꼭 같이 써야 함. 블랭크는 트림의 엠프티와 같음.
 * 엠프티는 공백을 포함해도 문제 제기를 안 하는 타입인듯?? 그러므로 블랭크를 쓸 때는 트림을 굳이 붙일 필요가 없다.
 */