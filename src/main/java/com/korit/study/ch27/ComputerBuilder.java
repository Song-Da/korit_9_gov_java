package com.korit.study.ch27;

public class ComputerBuilder {
    private String cpu;
    public int ram;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public ComputerBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this; // 자기 자신을 리턴하라
    }

    public ComputerBuilder ram(int ram) {
        this.ram = ram;
        return this;
    }

    // ㅈㄴ어려운데;

    public Computer build() {
        return new Computer(cpu, ram);
    }
}

/**
 * 자기 자신의 주소를 그대로 전달할 수 있게 리턴해줄 수 있다.
 */