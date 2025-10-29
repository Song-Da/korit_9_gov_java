package com.korit.study.ch27;

public class BuilderStudy {
    private String value1;
    private Integer value2;

    public BuilderStudy() {
    }

    public BuilderStudy(String value1, Integer value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "BuilderStudy{" +
                "value1='" + value1 + '\'' +
                ", value2=" + value2 +
                '}';
    }

    public static BuilderStudyBuilder builder() {
        return new BuilderStudyBuilder();
    }

    public static class BuilderStudyBuilder { // 위와 똑같은 변수들을 가져야 함.
        private String value1;
        private Integer value2;

        public BuilderStudyBuilder value1(String value1) {
            this.value1 = value1;
            return this;
        }

        public BuilderStudyBuilder value2(Integer value2) {
            this.value2 = value2;
            return this;
        }

        public BuilderStudy build() {
            return new BuilderStudy(value1, value2);
        }
    }
}

/**
 * 빌더스터디 안에 빌더스터디빌더
 * 자기 바깥의 빌더스터디를 대신 생성해줌.
 *
 *
 *
 */