package com.korit.study.ch21;

import java.time.Instant;
import java.util.Objects;

public class GameConfigManager {
    // TODO: 싱글톤 구현을 위한 필드들
    private static GameConfigManager instance;

    // 설정 정보 필드들
    private int soundVolume = 50;           // 기본값 50
    private String resolution = "1280x720"; // 기본 해상도

    // TODO: 생성자 구현
    private GameConfigManager() {

    }


    // TODO: 싱글톤 인스턴스 반환 메서드 구현
    public static GameConfigManager getInstance() {
        if (Objects.isNull(instance)) {
            instance = new GameConfigManager();
        }
        return instance;
    }


    // Getter/Setter 메서드들
    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) { // 만약에 볼륨이 0보다 크거나 같고 100보다 작거나 같을 때
            this.soundVolume = volume; // 사운드 볼륨에 볼륨을 반환한다.
        }
    }

    public int getSoundVolume() {
        return soundVolume; // getter 로 꺼내오는 사운드볼륨에 int 사운드 볼륨을 반환한다.
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public String getConfigInfo() {
        return String.format("Sound: %d, Resolution: %s",
                soundVolume, resolution);
    }
}
