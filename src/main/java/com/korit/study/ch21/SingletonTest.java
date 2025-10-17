package com.korit.study.ch21;

public class SingletonTest {
    public static void main(String[] args) {
        // 테스트 1: 싱글톤 인스턴스 확인
        GameConfigManager config1 = GameConfigManager.getInstance();
        GameConfigManager config2 = GameConfigManager.getInstance();

        System.out.println("같은 인스턴스인가? " + (config1 == config2)); // true여야 함

        // 테스트 2: 설정 변경 및 공유 확인
        config1.setSoundVolume(80);
        config1.setResolution("1920x1080");

        System.out.println("config1 설정: " + config1.getConfigInfo());
        System.out.println("config2 설정: " + config2.getConfigInfo());
        // 두 출력이 동일해야 함

        // 테스트 3: 다른 곳에서 접근
        testFromAnotherMethod();
    }

    public static void testFromAnotherMethod() {
        GameConfigManager config = GameConfigManager.getInstance();
        System.out.println("다른 메서드에서 접근: " + config.getConfigInfo());
        // 위에서 설정한 값들이 그대로 유지되어야 함
    }
}

/**
 * 클래스를 정의하는 이유?
 * 틀. 계속 찍어내기 위해 틀을 만듦.
 *
 * no-arg constructor 이유
 *
 *
 * o arg constructor 이유
 * 내가 생성될 때 안에 들어가는 변수의 값이 여러 경우의 수가 있어서
 *
 *
 *
 */