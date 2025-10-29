package com.korit.study.ch26;

import java.util.List;

public class RoleMain {
    public static void main(String[] args) {
        Role admin = Role.ADMIN;
        Role user = Role.USER;
        Role manager = Role.MANAGER;

        System.out.println(admin);
        System.out.println(user);
        System.out.println(manager);

        /// ////////////////////////////////////////

        Role admin2 = Role.valueOf("ADMIN");
        Role user2 = Role.valueOf("USER");
        Role manager2 = Role.valueOf("MANAGER");

        System.out.println(admin2);
        System.out.println(user2);
        System.out.println(manager2);

        /// ////////////////////////////////////////

        List<String> roles = List.of("ADMIN", "USER");
        List<String> roles2 = List.of("ADMIN", "MANAGER");

        for (String roleName : roles) {
            System.out.println(Role.valueOf(roleName));
        }
    }
}

/**
 * 이넘은 그냥 정해진 값으로만 생성된 객체라고 생각하면 됨.
 * 밸류오브를 쓰면 객체를 뭘 생성할 건지 선택할 수 있음.
 * 코드에 ADMIN 으로 기재를 해둬야 하는데 밸류오브를 쓰면 문자열로 변수화가 가능함.
 *
 * new 해서 쓰는 게 아니라 정해진 값을 가져오는 것.
 *
 */