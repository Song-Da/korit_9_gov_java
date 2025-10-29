package com.korit.study.ch27;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public class UserPrinter {
        private String printValue;

        public UserPrinter(String printValue) {
            this.printValue = printValue;
        }

        public void print() {
            System.out.println(printValue);
        }
    }

    public static class UserPrinter2 { // 스태틱은 생성(new) 안 해도 쓸 수 있다.
        private String printValue;

        public UserPrinter2(String printValue) {
            this.printValue = printValue;
        }

        public void print() {
            System.out.println(printValue);
        }
    }
}
