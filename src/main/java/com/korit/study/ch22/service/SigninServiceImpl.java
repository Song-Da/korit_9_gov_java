package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;
import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SigninServiceImpl implements SigninService {
    // 싱글톤으로 만들 것
    private static SigninServiceImpl instance;

    private UserRepository userRepository;


    private SigninServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SigninServiceImpl getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SigninServiceImpl(UserRepository.getInstance());
        }
        return instance;
    }

    // 앞으로 인터페이스 임플리먼트를 하면
    @Override
    public void signin(SignupDto signupDto) {
        // 로그인을 시도한 사용자 이름 확인 userRepository 에서
        // 해당 사용자 이름을 가진 User 객체가 있는지 확인
        // 객체가 null 이면 함수 탈출 (사용자 정보를 다시 확인하세요.)
        if (signupDto == null || isEmpty(signupDto.getUsername()) || isEmpty(signupDto.getPassword())) {
            System.out.println("사용자 정보를 다시 확인하세요");
            return;
        }
        System.out.println("로그인 성공");


        // 비밀번호 일치 확인
        // 비밀번호가 일치하지 않으면 함수 탈출 (사용자 정보를 다시 확인하세요.)
        // getter 가 없는 듯. 그뭐냐
        if (PasswordEncoder.match(SigninDto)) {
            System.out.println("사용자 정보를 다시 확인하세요.");
            return;
        }
        System.out.println("로그인 성공 " + User.class.toString());


        // 로그인 성공 -> 로그인 성공한 User 객체 toString 으로 출력

    }

    @Override
    public boolean isEmpty(String str) {
        // username, password 가 각각 공백이 아닌지 확인 용도
        return str == null || str.isBlank();
    }
}


//        UserRepository.insert(SignupDto.toUser());





// smithrowe-10
