package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SignupDto;

public interface SigninService {
    void signin(SignupDto signupDto);
    boolean isEmpty(String str);    // 공백을 포함하면 안 됨 = isblank 를 써서 사용
}
