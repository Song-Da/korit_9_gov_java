package com.korit.study.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Input03 {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader br = new BufferedReader(inputStreamReader);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
        String[] datas = line.split(" ");
        Arrays.stream(datas).forEach(System.out::println);;

    }
}

/**
 * IOException
 * 인풋 예외 발생. 프로그램이 정상 동작하지 않고 종료될 수 있으니 예외처리 해야 한다.
 * 무조건 이 예외 처리 하지 않으면 못쓰게 하겠다는 의미?
 *
 * 코테 문제 입력 받을 때 Buffered 를 쓰는 게 좋다. 아예 한 줄을 입력 받는 거고 int 로 쓰려면 parseInt 로 변환 해야 함.
 *
 * split 으로 자르는 것.
 */