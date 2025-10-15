package com.korit.study.ch18;

public abstract class 전자기기 implements 전원 {
    private int 전압;


    public 전자기기(int 전압) {
        this.전압 = 전압;
    }

    public int get전압() {
        return 전압;
    }
}
