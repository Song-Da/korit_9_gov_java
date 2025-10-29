//package com.korit.study.ch30;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//class Person {
//    private String name;
//    private int age;
//    // constructor, getters
//}
//
//class Employee {
//    private String name;
//    private double salary;
//    // constructor, getters
//}
//
//class EmployeeDTO {
//    String displayName;
//    String salaryInfo;
//    // constructor, getters
//}
//
//
//class Item {
//    String name;
//    int price;
//    // constructor, getters
//}
//
//class Student {
//    String name;
//    int score;
//    // constructor, getters
//}
//
//
//public class StreamTest {
//    public static void main(String[] args) {
//        // 1. 문자열 대문자 변환
//        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
//        List<String> upperCaseName = names.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println("문자열 대문자 변환 : " + upperCaseName);
//
//
//        // 2. 숫자 제곱 계산
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> squaredNumbers = numbers.stream()
//                .map(n -> n * n)
//                .collect(Collectors.toList());
//        System.out.println("숫자 제곱 계산 : " + squaredNumbers);
//
//
//        // 3. 문자열 길이 추출
//        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
//        words.stream()
//                .mapToInt(String::length)
//                .forEach(System.out::println);
//
//        int sumOfLengths = words.stream()
//                .mapToInt(String::length)
//                .sum();
//        System.out.println("문자열 길이 총합 : " + sumOfLengths);
//
//
//        // 4. 가격에 세금 추가
//        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
//        final double TAX_RATE = 0.1;
//
//        List<Double> finalPrices = prices.stream()
//                .map(price -> {
//                            double finalPrice = price * (1 + TAX_RATE);
//                            return finalPrice;
//                        })
//                .collect(Collectors.toList());
//        System.out.println("본래 금액 : " + prices);
//        System.out.println("환율 적용 금액 : " + finalPrices);
//
//
////        // 5. 객체에서 특정 필드 추출
////        List<Person> people = Arrays.asList(
////                new Person("Alice", 25),
////                new Person("Bob", 30),
////                new Person("Charlie", 35)
////        );
////
//
//        // 6. 문자열 포맷팅
//        List<String> usernames = Arrays.asList("john", "mary", "steve");
//        List<String> formattingGreeting = usernames.stream()
//                .map(name -> {
////                    return
////                })
//
//        // 7. 여러 필드를 조합한 새 객체 생성
//        List<Employee> employees = Arrays.asList(
//                new Employee("Kim", 50000),
//                new Employee("Lee", 60000)
//        );
//
//                    /// ///////////////////////////////////////////////////////
//
//
//                    // 1. 문자열 첫 글자 추출
//                    List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");
//                    List<String> firstCities = cities.stream()
//                            .map(s -> s.substring(0, 1))
//                            .collect(Collectors.toList());
//                    System.out.println("문자열 첫 글자 : " + firstCities);
//
//
//                    // 2. 불린 값 반전
//                    List<Boolean> flags = Arrays.asList(true, false, true, true, false);
//                    List<Boolean> flages2 = flags.stream()
//                            .map(b -> !b) // Boolean 의 앞글자를 하나 떼고 ! 부정을 붙여서 아니게 만들고 반대를 출력하게 됨,
//                            .collect(Collectors.toList());
//
//                    System.out.println("원본 : " + flags);
//                    System.out.println("반전된 문자열 : " + flages2);
//
//
//                    // 3. 온도 단위 변환 (섭씨 -> 화씨)
//                    List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);
//
//
//                    // 4. 문자열 앞뒤 공백 제거
//                    List<String> messyData = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");
//
//
//                    // 5. 이메일 도메인 추출
//                    List<String> emails = Arrays.asList(
//                            "user1@gmail.com",
//                            "admin@company.co.kr",
//                            "support@naver.com",
//                            "info@daum.net"
//                    );
//
//                    List<String> domains = emails.stream()
//                            .map(email -> email.substring(email.indexOf("@") + 1))
//                            .toList();
//                    System.out.println(domains);
//
//                    // 흠ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
//
//                    // 6. 나이를 출생연도로 변환
//                    List<Integer> ages = Arrays.asList(25, 30, 35, 20, 45);
//                    int currentYear = 2024;
//
//
////        // 7. 상품명과 가격 결합
////        List<Item> items = Arrays.asList(
////                new Item("사과", 3000),
////                new Item("바나나", 2000),
////                new Item("오렌지", 5000)
////        );
////
////
////        // 8. 학생 성적 등급 변환
////        List<Student> students = Arrays.asList(
////                new Student("김철수", 95),
////                new Student("이영희", 82),
////                new Student("박민수", 76),
////                new Student("정지원", 68)
////        );
//
//
//                    // 9. 파일 경로에서 파일명 추출
////                    List<String> filePaths = Arrays.asList(
////                            "/home/user/documents/report.pdf",
////                            "/var/log/system.log",
////                            "C:\\Users\\Admin\\Desktop\\image.jpg",
////                            "/downloads/music.mp3"
////                    );
////
////
////                    // 10. 전화번호 포맷팅
////                    List<String> phoneNumbers = Arrays.asList(
////                            "01012345678",
////                            "01098765432",
////                            "01055556666",
////                            "01011112222"
////                    );
//
//                }
//    }
//
