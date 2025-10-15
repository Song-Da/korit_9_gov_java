package com.korit.study.ch06;

public class 연습문제3 {
    public static void main(String[] args) {
        double celsius = 32.5;
        checkTemperatureConversion(celsius);

    }


    // 섭씨를 화씨로 변환하는 함수
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // 화씨를 섭씨로 변환하는 함수
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // 섭씨 온도를 받아서 화씨로 변환한 후, 다시 섭씨로 변환하여
    // 원래 값이 맞는지 확인하는 함수를 작성하세요
    public static void checkTemperatureConversion(double celsius) {
        // 여기에 중첩 함수 호출 코드 작성
        double fahrenheit = celsiusToFahrenheit(celsius);
        double celsius2 = fahrenheitToCelsius(fahrenheit);
        System.out.println(celsius == celsius2 ? "O" : "X");
    } // 함수명이 변환된 걸 체크하는...

    /**
     * 이게왜지
     */

}
