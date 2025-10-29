package com.korit.study.ch29;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaInterface {
    public static void main(String[] args) {

        // 1. 매개변수 x, 리턴 x
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 인터페이스");
            }
        };
        runnable.run();

        Runnable runnable2 = () -> {
            System.out.println("runnable 인터페이스");
        };
        runnable2.run();

        // 2. 매개변수 o, 리턴 x
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("consumer 인터페이스");
                System.out.println("매개변수 s: " + s);
            }
        };
        stringConsumer.accept("consumer");

        Consumer<String> stringConsumer2 = s -> {
            System.out.println("consumer 인터페이스");
            System.out.println("매개변수 s: " + s);
        };
        stringConsumer2.accept("consumer");

        Consumer<Integer> andThenStudy = num -> {
            System.out.println("1");
            System.out.println(num);
        };
        Consumer<Integer> andThenStudy2 = andThenStudy.andThen(num2 -> {
            System.out.println("2");
            System.out.println(num2);
        });

        andThenStudy.accept(10);
        andThenStudy2.accept(20);

        Consumer<Double> doubleConsumer = d -> {
            System.out.println("1");
            System.out.println("숫자: " + d);
        };
        doubleConsumer.andThen(d -> {
            System.out.println("2");
            System.out.println("숫자: " + d);
        }).andThen(d -> {
            System.out.println("3");
            System.out.println("숫자: " + d);
        }).andThen(d -> {
            System.out.println("4");
            System.out.println("숫자: " + d);
        }).accept(3.14);

        // forEach()
        List<String> nameList = List.of("김준일", "김준이");
        nameList.forEach(n -> System.out.println(n)); // 객체 생성과 동시에 출력
        nameList.forEach(System.out::println); // 더블 콜론, 람다 메서드 참조
        /**
         * 메서드 정의가 넘어온 게 아니라 객체가 생성돼서 들어감. 액션이 객체이기 때문에 메서드를 호출할 수 있음.
         * 액션이 객체니까 . 을 써서 참조가 됨. 그런데 75번 줄이 들어와서 익명 클래스도 결국은 컨슈머 생성 그리고 구현이 들어가서
         * 75번줄처럼 줄인 거고 오버라이드한 객체를 넘겨준 것이다. 이 객체를 받아다가 반복을 돌릴 때 엑셉트를 계속 호출하는 것.
         * this 는 nameList 가 되는 것임. T 라는 변수에 계속 넘어갈 것이고 계속 75번줄의 n 부터 출력까지 하는 것.
         */


        // 3. 매개변수 x, 리턴 o
        String str = null;
        Supplier<Boolean> booleanSupplier = () -> Objects.isNull(str);
        System.out.println(booleanSupplier.get());

        // 4. 매개변수 o, 리턴 o
        Function<Integer, String> function = num -> {
            System.out.println("정수 받아서 문자열정수로 리턴");
            return Integer.toString(num);
        };

        String functionResult = function.apply(10);
        System.out.println(functionResult);

        Integer functionResult2 = function
                .andThen(s -> {
                    System.out.println("문자열정수 받아서 실수자료형으로 리턴");
                    return Double.parseDouble(s);
                })
                .andThen(d -> {
                    System.out.println("실수자료형 받아서 정수로 리턴");
                    return d.intValue();
                })
                .apply(20);

        System.out.println(functionResult2);

        String functionResult3 = function
                .compose(d -> {
                    System.out.println("실수자료형을 정수로 리턴");
                    return ((Double) d).intValue();
                })
                .apply(20.5);

        System.out.println(functionResult3);

        // 4. 매개변수 o, 리턴 Boolean
        String searchUsername = "test1234";

        Predicate<List<Map<String, String>>> listPredicate = list -> {
            AtomicBoolean isFound = new AtomicBoolean(false);
            list.forEach(map -> {
                if (map.get("username").equals(searchUsername)) {
                    isFound.set(true);
                }
            });
            return isFound.get();
        };

        List<Map<String, String>> userList = List.of(
                Map.of("username", "test1", "password", "1111"),
                Map.of("username", "test12", "password", "2222"),
                Map.of("username", "test123", "password", "3333"),
                Map.of("username", "test1234", "password", "4444")
        );
        System.out.println(listPredicate.test(userList));

        List<String> names = List.of("김준일", "김준이", "이준일", "이준이");
        String startedLastName = "이";
        List<String> filteringNames = names.stream()
                .filter(name -> name.startsWith(startedLastName))
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(filteringNames);

        String foundName = names.stream()
                .filter(name -> name.equals("김준이"))
                .collect(Collectors.toList())
                .getFirst();
        System.out.println(foundName);

        // 매개변수 o, 리턴 o, 둘의 자료형이 동일하면
        UnaryOperator<String> f1 = s -> s + "문자열";
        Function<String, String> f2 = s -> s + "문자열";
        // 둘 다 똑같은 의미.
        BiFunction<String, String, String> f3 = (s1, s2) -> s1 + s2;
        BinaryOperator<String> f4 = (s1, s2) -> s1 + s2;
    }
}

/**
 * 람다는 추상 메서드 무조건 하나만 있어야 하고
 * 이걸 오버라이드 하겠구나 하고 유추가 될 수 있는 환경을 만들어서 코드를 줄여
 * 사용할 수 있음. 대상이 인터페이스에 존재하는 유일한 메서드여야만 한다.
 *
 * FunctionalInterface 를 쓰면 함수용 프로그램 인터페이스임 무조건 이건
 * 람다로 쓰겠다는... 람다 전용으로 인터페이스를 쓸 때 함수를 1개 더 (2개이상이되면) 못만들도록 막아주는 역할을 함.
 * 하지만 안 써도 되기는 함. 람다 전용으로 명시해두는 걸로만 생각하면 됨.
 * runnable 쪽을 보면 하나만 쓰는 겁니다 하고 명시해둔 게 보일 것. 꼭 붙이는 필수 요소는 아니다.
 *
 * 그러면 매개변수 없고 그냥 리턴도 없는 어느 코드던지 간에 이걸 람다로 형성해서 이런 형태의 인터페이스. 비슷한 형태가 나오면
 * 람다 쓸 때 메서드명을 재정의 하지는 않으니까 물론 호출 때는 사용이 되어지지만 매개변수 없고 함수 없을 때 사용하는 것
 *
 *
 * Consumer 는 소비자. 소비자는 받아서 쓰고 돌려주지 않는 것. 소비만 하는 것 . 매개변수로 받는 건 있지만 리턴으로
 * 값을 돌려주는 건 없다. 매개변수의 타입을 제네릭으로 선택해준다.
 * 하나의 값만 받아서 사용하는 거고 대표적인 예는 for each 메서드를 가지고 씀. List 에서 for each 는 반복을 돌려라는 메서드인데 리스트에서
 * 하나의 값을 꺼내라 -> 꺼내고 컨슈머한테 매개변수를 주는 것. 그럼 컨슈머는 엑센트를 호출을 해서 실행시키는 용도이다.
 *
 * for each 라는 펑션안으로 들어오면 컨슈머가 있음. 컨슈머의 타입은 폴이취를 사용하는 제네릭 타입일 것이고...
 * 향상된 for문을 돌려서 계속 값이 바뀌어짐. 음...
 *
 */