package com.korit.study.ch27;

public class Computer {
    private String cpu;
    private int ram;

    public Computer(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }
}

/**
 * static 으로 빌더를 호출함녀 빌더가 새로 만들어져서 리턴 즉, 반환되어 옴
 * 클래스 파일을 더 만들기 싫을 때 내부 클래스를 사용함. Map.entry 가 그 역할을 함.
 * Key 와 Value 의 한쌍...
 */