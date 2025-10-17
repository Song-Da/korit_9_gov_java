package com.korit.study.ch22.util;

import java.util.Objects;

public class PasswordEncoder {

    private static final String secrete = "암호화 비밀번호";
    
    public static String encode(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        long hash = Integer.toUnsignedLong(Objects.hash(str));
        long encodedHash = hash + Objects.hash(secrete);
        return Long.toHexString(encodedHash);
    }

    // encodedStr 은 암호문 str 은 평문으로 비교할 수가 없음. 평문을 암호문하고 암호문이랑 같은지 비교하면 됨
    public static boolean match(String str, String encodedStr) { // str 은 일반 문자로... encodedStr 은 메모리에 저장된...
        if (Objects.isNull(str) || Objects.isNull(encodedStr)) {
            return false;
        }
        return encode(str).equals(encodedStr);
    } // 에바죠
}

/**
 * 문제 못들었다ㅋㅋ;
 */