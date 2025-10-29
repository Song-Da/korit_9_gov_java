package com.korit.study.ch30;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream (흐름) -> 한번 쓰면 다시 못씀
 * 1. 생성        - 스트림 객체 생성
 * 2. 중간 연산     - 변환, 필터링 (반복)
 * 3. 최종 연산     - 결과 도출 (반복) forEach(), collect(), count()
 *
 * collect 대신 toList 를 사용해도 됨. 사유, 옛날 버젼에는 없었음.
 */

public class StreamMain {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);
        strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        // 스트림 객체 생성
        // 1. Stream 인터페이스의 static 메서드를 통해 생성
        Stream<String> stream = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();
        Stream<String> stream2 = Stream.of("a", "b", "c");

        // 2. 배열 또는 컬렉션을 Stream으로 변환하여 생성
        Stream<String> stream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> stream4 = List.of("a", "b", "c").stream();
        Stream<String> stream5 = Set.of("a", "b", "c").stream();
        Stream<String> stream6 = Map.of("a", "1", "b", "2", "c", "3").keySet().stream();
        Stream<String> stream7 = Map.of("a", "1", "b", "2", "c", "3").values().stream();
        Stream<Map.Entry<String, String>> stream8 = Map.of("a", "1", "b", "2", "c", "3").entrySet().stream();

        List<String> names = List.of("김준일", "김준이");

        // 여기서부터
        List<String> lastNames = new ArrayList<>();
        for (String name : names) {
            String lastName = name.substring(0, 1); // 문자열을 자르는 행위
            char lastName2 = name.charAt(0);
            lastNames.add(lastName);
        } // 새로운 리스트에 성만 떼서 추가하는 작업
        lastNames.forEach(System.out::println); // << 이렇게 해주면 바로 성만 쭉 출력이 됨
        // 여기까지가 한토막

        names.stream()
                .map(name -> name.substring(0, 1))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        /**
         * 리턴되는 값들을 스트림에 추가하는 것.
         * 그러면은 성만 자른 이 값이 새로운 스트림에 담기고
         * 그 담긴 값을 콜렉트 반복하면서 리스트로 변환을 해주는 것.
         *
         * 그리고 리스트에서 forEach 를 하도록 하라는...
         */

        // 중간 연산 map(), filter()
        // 1. map() 변환, 치환
        List<String> strNums = List.of("11", "20", "31"); // 100, 200, 300 으로 만들고 싶음.
        List<Integer> nums = StreamMap.map(strNums, strNum -> {
            int n = Integer.parseInt(strNum);
            if (n % 2 == 0) {
                return n * 10;
            }
            return n;
        });

        // 2. filter() 분류
        /**
         * 짝수인 녀석들만 뽑거나 홀수인 녀석들만 뽑고 싶다.
         */

        List<Integer> odds = nums.stream()
                .filter(num -> num % 2 != 0)
                .toList(); // 스트림을 리스트로 바꿀 것이다.
        System.out.println(odds);
    }

    class StreamMap {
        public static <T, R> List<R> map(List<T> list, Function<T, R> action) {
            Objects.requireNonNull(list);
            Objects.requireNonNull(action); // 알아서 null 체크를 해주는 것. null 이 아닌 것이 필수라는 뜻

//            if (Objects.isNull(list)) {
//                return null;
//            }
//            if (list.isEmpty()) {
//                return null;
//            }
            List<R> rList = new ArrayList<>();
            for (T t : list) {
                rList.add(action.apply(t));
            }
            return rList;
        }
    }
}

/**
 * 스트림은 인터페이스이기 때문에 생성이 (new) 불가함
 * 중간 연산은 필수까지는 아님 스트림을 흘러가야하는 것이기 때문에...
 * S.--.--.-- << 이렇게 흘러가기 때문에 스트림이 스트림으로 리턴되고 최좆ㅇ적으로 마지막을 영ㄴ산함
 * 중간 연산은 스트림이 리턴됨 특정 자료혀
 *
 * 스트림을 컬렉스 해라 투 리스트로 변환해서... 그럼 컬렉트르 썼을 때 리턴되는 값을 리스트.
 * 이런 게 스트림이라고 일단 그거다
 *
 * 복제가 아니라 진짜 꺼내쓰는 것이기 때문에 그 다음번째때는 아예 열리지가 않음. 스트림이 바로 닫혀버림.
 * 그래서 다시 반복을 하고 싶다면?
 * 다시 넣어주면 쓸 수 있음 왜? 거기에 값이 비어있을 테니까 다시 넣어줘야 빈 곳이 차서 사용할 수 있게 됨,
 *
 * 반복처리 하는 것들을 모두 구현해두었다.
 * 최종 연산으로는 콜렉트?
 *
 * 스트림은 2개만 알면 됨.
 * 중간 연산은 Map 과 필터라는 것을 잘 쓰기만 해도 웬만한 건 다 할 수 있게 됨.
 *
 * to메서드를 쓰는게 좋다. .map(메서드::변수명) << 이런 식인듯??
 */