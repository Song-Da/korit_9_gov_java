package com.korit.study.ch29;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

// 람다 메서드 참조 -
// 람다식을 간결하게 표현하는 방법 (:: 더블콜론)
// 호출 구조가 기존의 메서드와 완전히 동일하면 가능
// (매개변수) -> 메서드(매개변수)
class StrPrinter { // 스태틱 메서드를 가진 str 클래스
    public static void print(String str) {
        System.out.println(str);
    }
}

/**
 * 참조가 일어날 수 있을 때만 사용 가능함. 메서드 참조라고 하는 건 메서드에다만 쓸 수 있고
 * 객체에다가도 쓸 수 있다. 왜? 참조가 일어나니까.
 */

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class LambdaMethodReference {
    public static void main(String[] args) {
        Consumer<String> stringConsumer1 = (s) -> System.out.println(s);
        stringConsumer1.accept("람다 메서드 참조"); // 이 값을 위의 s 에 대입하 것.
        System.out.println("람다 메서드 참조"); // <<< 이것과 다름이 없다. 그냥 엑셉트를 호출하는 것과 sout 을 호출하는 게 지금은 동일한 동작을 하고 있음.
        // 이때 어느 메서드를 참조하는 지만 알면 어디에서 무엇을 호출하는지만 명시하면 된다.

        Consumer<String> stringConsumer2 = (s) -> StrPrinter.print(s);
        stringConsumer2.accept("람다 메서드 참조");

        Consumer<String> stringConsumer3 = System.out :: println; // 컨슈머인데 println 이라는 것을 호출해라
        stringConsumer3.accept("람다 메서드 참조");
        // 어셉트에 든 람다 메서드를 프린트엘엔에 바로 넣어버려라 라는 뜻

        Consumer<String> stringConsumer4 = StrPrinter :: print; // 여기 이 클래스 안에 들어있는 프린트 메서드를 호출해라 하는데
        stringConsumer4.accept("람다 메서드 참조"); // 그때 이 매개변수를 프린트로 대입을 해서 호출해라.

        // 람다 생성자 참고
        Supplier<List<String>> listSupplier = ArrayList::new;
        // listSupplier = () -> new ArrayList<>();
        List<String> stringList = listSupplier.get(); // 생성된 리스트 객체를 불러와서 먹음

        Supplier<List<String>> listSupplier2 = ArrayList::new;
        List<String> stringList2 = listSupplier2.get();

        BiFunction<String, Integer, Student> biFunction1 = (name, age) -> new Student(name, age);
        Student student1 = biFunction1.apply("김준일", 32);

        BiFunction<String, Integer, Student> biFunction2 = Student::new;
        Student student2 = biFunction1.apply("김준일", 32);

        System.out.println(student1);
        System.out.println(student2);

        Function<String, Integer> strToInt = Integer::parseInt;
        Integer num = strToInt.apply("100");
        System.out.println(num);
        // 문자열 100 을 숫자로 변환하는 것. 이건 람다 때만 쓸 수 있는 것. 다른 때에서는 불가.

        Integer num2 = Integer.parseInt("100"); // 람다가 아닌 상황에선 이렇게 사용해야 함.

        List<String> strNums = List.of("10", "20", "30");
        Integer sumResult = 0;
        for (String str : strNums) {
            sumResult += Integer.parseInt(str);
        }
        System.out.println(sumResult);
        AtomicInteger atomicSumResult = new AtomicInteger(0);
        strNums.forEach(str -> atomicSumResult.set(atomicSumResult.get() + Integer.parseInt(str)));
        System.out.println(atomicSumResult.get());

        atomicSumResult.set(0);
        strNums.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(atomicSumResult::set);
        System.out.println(atomicSumResult.get());

    }
}

/**
 * Bi = 바이너리 코드 즉, 2진 코드
 * 매개변수 2개, 소비자도 매개변수 2개일 수 있고 펑션에 넣으면 매개벼수 2개짜리인 세가ㅣㅈ
 */