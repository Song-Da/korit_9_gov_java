package com.korit.study.ch02;

public class Operator02 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        i++;
        System.out.println(i);
        System.out.println(++i); // 선증가, 명령이 끝나기 전에 수를 더함
        System.out.println(i++ + 10); // 후증가, 명령이 끝난 후에 수를 더함
        System.out.println(i);
//      선증가 보다는 후증가를 많이 씀.

    }
}
