package com.korit.study.ch17;

public abstract class AbstractAuthentication implements UserDetails {
    private User user;

    public User getUser() {
        return user;
    }

    public AbstractAuthentication() {
    }

    public AbstractAuthentication(User user) {
        this.user = user;
    }

    public void auth() {
        System.out.println("인증을 합니다.");
    }

    @Override
    public String getUsername() {
        return "";
    }



    public abstract void checkAuthority();


}
