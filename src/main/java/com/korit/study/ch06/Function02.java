package com.korit.study.ch06;

public class Function02 {
    public static void main(String[] args) {
        fx1(); // 여기서 아래에 만든 걸 호출할 수 있음
        fx1(); // 한 번 더 중복을 원한다면 또 복사를 하면 됨
        fx2("김준일", 22); // 리턴 자료형이 없는 void 니까 돌려주는 건 없다.
        fx3("김준이", 23); // 리턴 자료형이 없는 void 니까 돌려주는 건 없다.
        int[] arr1 = fx4(); // 리턴 자료형이 int[] 이니까... 1부터 10까지 묶여져있는 배열을 한번에 들고옴
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        printIntArray(arr1);
        int[] arr2 = fx5(5); // 위와 다르게 여기는 사이즈를 5라고 줌. 위엔 이미 10 이라는 사이즈를 준 상태인 걸 들고왔고
        // fx5 는 사이즈가 정해지지 않아 호출하면 개발자가 사이즈 값을 넣어줘야 함.
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
        printIntArray(arr2);
    }


    static void fx1() { // 매개변수 자리에 아무것도 없고 받는 것도 돌려주는 것도 없는 것.
        int num1 = 10;
        int num2 = 20;
        int result = 0;
        for (int i = 0; i < 5; i++) { // i 는 0 이고 5 번 반복시키며 i 를 증감시켜라
            result += num1;
            result += num2;
        }
        System.out.println(result);
    }

    static void fx2(String name, int age) { // 매개변수가 2개 존재한다. String, int type 의...
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    } // 코드를 하나의 블럭으로 만든 것

    static void fx3(String a, int b) { // 함수명은 겹칠 수 없고 위의 매개변수 명만 달라짐
        System.out.println("이름: " + a);
        System.out.println("나이: " + b);
    }

    static int[] fx4() { // 리턴 자료형이 있는 것. 정수가 들어있는 배열!!을 리턴해줄 거다.
        int[] result = new int[0]; // 원래는 result 가 비어있는 것.
        int size = 10;
        for (int i = 0; i < size; i++) { // 반복 횟수 10번. temp 가 늘어나면서 result 의 원래 있던 값보다 1 크게
            int[] temp = new int[result.length + 1];
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j];
            }
            temp[temp.length - 1] = i + 1; // 이번에 새로 만든 해당 인덱스 + 1 의 값 대기 시킴.
            result = temp;
        }
        return result;
    }


    static int[] fx5(int size) { // 함수 호출할 때 내가 정해야 함.
        int[] result = new int[0];
        for (int i = 0; i < size; i++) {
            int[] temp = new int[result.length + 1];
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j];
            }
            temp[temp.length - 1] = i + 1;
            result = temp;
        }
        return result;
    }

    static void printIntArray(int[] arr) { // 매개변수로 넘어온 정수를 반복해라...? f4 f5 출력의 반복되는 코드를 이 메소드로 함축시켜서 바로 코드 가독성을 높임.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

/**
 * void 는 리턴하는 값이 없는 함수
 *
 * 아 집 가고 싶다 진짜 어떡하냐 진짜 아 졸려
 *
 */