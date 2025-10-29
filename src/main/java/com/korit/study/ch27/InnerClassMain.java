package com.korit.study.ch27;

public class InnerClassMain {
    public static void main(String[] args) {
        User user = new User("test1", "1234");
        System.out.println(user);

        User.UserPrinter userPrinter = user.new UserPrinter(user.toString());
        userPrinter.print();

        User.UserPrinter2 userPrinter2 = new User.UserPrinter2(user.toString());
        // static 이니까 이걸 아예 한쌍? 자체로 보는...
        userPrinter2.print();
    }
}

/**
 * 생성된 객체 안에서 생성자를 호출할 수 있다
 * 애초에 정의 했을 때 생성자 정의가 안 되어 있고
 * 생성을 해야 그 안에 든 생성자를 호출할 수 있다.
 *
 * 이너를 쓸 때 new 위치를 잘 봐야 함.
 */