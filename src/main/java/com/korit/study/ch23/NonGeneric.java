package com.korit.study.ch23;

public class NonGeneric {
    private Object data;
    // 변수는 값을 담는 것이라 값이 유동적일 수 있지만 자료형이 유동적일 수 있나?
    // 한 가지 방법이 있는데 최상위 클래스인 Object 로 업캐스팅 시켜줘서 다 받는 일.

    public NonGeneric(Object data) { // 못 들어오는 게 없음.
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NonGeneric{" +
                "data='" + data + '\'' +
                '}';
    }
}
