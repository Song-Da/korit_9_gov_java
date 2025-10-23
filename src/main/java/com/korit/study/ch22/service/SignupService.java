package com.korit.study.ch22.service;

// 패키지 선택 잘 해야 함. import 잘못해서 다른 패키지의 내용 가져오면 오류 남.
import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepositoryImpl;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SignupService { // 클래스는 틀. instance 를 정의하기 위해서 만듦
    // 1. instance static 변수 정의
    private static SignupService instance;
    // static 변수를 정의하면 static 메모리 영역에 존재하기에 다른 클래스 어느 위치든 여기 메모리 참조가 가능. 공유되어지는 거고 이 변수의 자료형이
    // 싸인업서비스... 이 인스턴스에 값은 싸인업서비스로 생성된 자료형태로 값이 아니면 대입될 수 없다.
    // 자료형에 따라 기본값이 정해져있음. instance 안에 null 이 들어있음.
    private UserRepositoryImpl userRepository; // private 로 외부 접근을 막아주고
    // 회원 가입 처리에 필요한 데이터를 담아둠
    
    private SignupService(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    } // 여기도 생성자를 private 를 걸어준다. 다른 곳에서는 언급이 불가능.
    // 레포지토리를 넘겨받고

    public static SignupService getInstance() { // 프라이빗을 걸어놨지만 다른 곳에서도 getter을 사용해서 값을 가져갈 수 있게 만듦
        if (Objects.isNull(instance)) { // instance 의 값이 null 이니?
            instance = new SignupService(UserRepositoryImpl.getInstance());
        }
        return instance;
    } // 여기는 모름


    public boolean isValidDuplicatedUsername(String username) { // 참 거짓을 나타내는 불리언
        User foundUser = userRepository.findByUsername(username);
        if (Objects.isNull(foundUser)) { // 유저레포지토리를 사용해 해당 유저 네임을 가진 데이터를 검색하고
            return true; // 만약에 찾지 못했으면 if 를 빠져나가고 false 일 시 다시 돌아감
        }
        return false;
    } // 유효성 검사, 가입 시 사용할 수 있는 아이디인지 확인. 즉 아이디 중복을 검사하는 코드

    public boolean isValidPassword(String password) { // isNull과 isBlank 을 사용해서 아예 없거나 공백이 있는지 확인함.
        return !Objects.isNull(password) && !password.isBlank();
        // trim 은 문자열 양쪽의 공백을 무조건 제거함. isBlank() 는 공백이냐고 묻는 것. unll 도 아니고 공백도 없어야 한다는 뜻.
    } // 비밀번호 유효성 검사. 사용할 수 있는 비밀번호인지 검사하는 기능... 비번이 null 도 아니고 공백도 없으면
      // true 를 반환

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (Objects.isNull(password) || Objects.isNull(confirmPassword)) {
            return false; // 함수 종료
        }
        return password.equals(confirmPassword);
    }
    // 여기는 공백 검사를 할 필요가 없고 2차로 비밀번호가 일치한지 컨펌... 검사를 하는 부분임. null 일 경우 상관없이
    // false 를 반환하게 되면 함수를 종료하고 여길 빠져나가면 두 패스워드가 동일했는지 비교 값을 반환.


    public void signup(SignupDto signupDto) { // 값을 반환하지 않음
        User newUser = new User(0, signupDto.getUsername(), PasswordEncoder.encode(signupDto.getPassword()));
        userRepository.insert(newUser);
    } // 회원가입을 처리함. 새로운 유저를 추가하는 일이고 패스워드 엔코더를 사용해서 조금 더 안전하게
    // 암호화 하는 코드. 뉴유저 객체를 유저레포지토리에 저장? 추가하도록 요청을 보냄.
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