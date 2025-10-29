package com.korit.study.ch30;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private int price;
    // constructor, getters

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Person {
    private String name;
    private int age;
    // constructor, getters

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Item {
    private String name;
    private int stock;
    private boolean onSale;
    private int price;
    // constructor, getters


    public Item(String name, int stock, boolean onSale, int price) {
        this.name = name;
        this.stock = stock;
        this.onSale = onSale;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", onSale=" + onSale +
                ", price=" + price +
                '}';
    }
}


public class StreamEx02 {
    public static void main(String[] args) {
        // 1. 짝수만 필터링
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // 문제
        List<Integer> evenNumbers = numbers.stream() // 문제에 대한 결과를 담을 변수와 문제와 똑같은 제네릭 선언, 그리고 동시에 새로운 결과를 담을 상자와 문제의 상자를 stream 으로 변경해주고 filter 안에서
                // 문제보다 더 작은 단위의 상자를 동시에 선언하고 계산할 식을 세워준 뒤에
                .filter(number -> number % 2 == 0) // 중간 계산
                .toList(); // 마지막 마침표를 찍어줘야 중간 계산 식이 가동되어 담을 상자 안에 답이 들어감.

        System.out.println(evenNumbers);

        /**
         * 위에 제시된 문제를 건드리지 않고 새로 위 문제를 풀어줄 중간 계산기를 새 List<Integer>로 새 선언을 해줘서 (한 토막일 수도 있음)
         * 총합 계산기 즉, evenNumbers 에 다 계산된 numbers 를 넣을 테니 numbers 를 스트림으로 만들어주고 필터를 걸어줌
         * numbers 보다 작은 단위인 number 을 자연스럽게 이어서 Integer 로 선언되게 만들고 여기서 계산을 시작함.
         * number % 2 == 0 <<< number 과 2를 나누어서 나머지가 0으로 같게 되면 나누어떨어지는 것이니 짝수를 구하는 식이다.
         *
         * toList 를 왜 끝에서 마침표처럼 찍어뒀을까?
         * 중간 처리 메서드들은 (map, filter) 는 설계? 준비만 해두고 아직 시동이 걸리지 않은 상태. 여기서 toList 로 마침표를 찍어주면
         * 버튼이 눌리듯 가동을 시작해 식을 계산하고 계산한 답이 담긴 변수를 호출하면 끝.
         * 결론, toList 가 호출되는 순간 작업이 실행되고 toList 는 최종 처리에 해당한다. 끝
         */

        // 2. 특정 길이 이상인 문자열 필터링
        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");
        List<String> wordsBox = words.stream()
                .filter(word -> word.length() >= 5)
                .toList();

        System.out.println(wordsBox);

        /**
         * 제시된 문제와 똑같이 제네릭을 걸어주고 답을 새로 담을 박스를 만들어준 뒤 문제가 담겨진 박스를 들고와 스트림으로 만들어준다
         * 이후 필터를 걸어서 문제보다 더 작은 단위의 박스를 괄호 안에 선언을 해주고 Integer 로 걸려있었다면 그냥 등호를 사용해서
         * 식 비교를 세울 수도 있었지만 String. 즉, 문자열을 비교하는 문제이기에 문자열을 세는 메서드를 불러와 그 뒤에 식을
         * 세워줘야 비교가 가능한 것이다?
         * 이후 toList 를 마침표처럼 쓴 뒤 답을 출력한다.
         */

        // 3. 특정 문자로 시작하는 이름 필터링
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");
        List<String> nameBox = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println(nameBox);

        /**
         * equals 는 문자열이 완전 같은지 아닌지를 묻는 거고 모두 그러면 false 를 반환하기 때문에
         * 아무것도 출력이 되지 않는 것. startsWith 을 쓰면 괄호 안에 든 시작 부분을 비교하는 메서드이기에
         * A 를 쓰고 넣는다면 이 맨 앞 글자가 이것과 같으냐고 묻는 것이기 때문에 A 를 포함한 글자가 출력된다.
         */

        // 4. 음수 제거
        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);
        List<Integer> mixedNumberBox = mixedNumbers.stream()
                .filter(mixedNumber -> mixedNumber.intValue() >= 1) // ( -> mixedNumber >= 1) <<< 간결하게 하는 게 낫긴 함. 저건 옛날 방식
                .toList();
        System.out.println(mixedNumberBox);

        /**
         * intValue() 는 옛날 자바 방식에서 사용되는 것이고. 현재는 간결하게 자바가 자동으로
         * 해결을 해주는 방식으로 바뀌었다고 함.
         */

        // 5. 가격 범위로 상품 필터링
        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );
        List<String> productList = products.stream() // String 으로 주소값을 변경함. 왜?
                .filter(product -> product.getPrice() >= 50000 && product.getPrice() <= 500000)
                .map(product -> product.getName())
                .toList();

        System.out.println(productList);

        /**
         * 왜 new Product 괄호 안에 든 문자열에 빨간줄이 뜨는 걸까?
         * Product 는 클래스 객체 전체임.
         * 객체에는 크기라는 개념이 없는데 어떻게 숫자와 크기를 비교하느냐고 [타입 불일치 오류]가 생김
         * 객체 전체를 가져오려는 게 아니라 이 Product 객체 안에 든 price 라는 숫자 속성을 써야 함.
         * 그럼? getPrice() 메서드를 호출해서 숫자만 꺼내 비교해야 한다.
         *
         * 먼저 필터를 걸어주고 getPrice 를 가져와서 수를 비교한 뒤에
         * map 을 사용해서 product 안에 든 이름을 가져온다.
         * 여기서 컴파일 오류가 뜨는데 이유는 List 의 제네릭이 Product 객체가 들어가서 반환되는 값과
         * 자료형?이 맞지가 않는 이유로 오류가 뜨는 것이니 계산과 Stream 변환을 위해 다시 세운
         * List 의 <> <<< 안에 꺼내고 싶은 값의 자료형에 알맞게 고쳐준다.
         * 여기서는 이름을 꺼내고 싶으니 문자열 String 으로 수정해준다.
         *
         * 생성자를 만들어주지 않으면 공간이 없고 객체를 쓸 수가 없음. toString 또한 개발자가 재정의
         * 해주지 않으면 Object 클래스의 toString 을 자동 출력하여 원치 않은 것을 출력하게 됨. (어느 메모리에 저장되어 있는지. 장소를 알려줌)
         *
         */


        // 6. 이메일 도메인으로 필터링
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.com",
                "support@gmail.com",
                "info@naver.com",
                "hello@gmail.com",
                "test@daum.net"
        );
        List<String> emailsBox = emails.stream()
                .filter(email -> email.contains("@gmail.com"))
                .toList();
        System.out.println(emailsBox);

        /**
         * 여기서는 왜 startsWith 을 쓸 수 없을까?
         * 이건 첫글자 시작 부분이 제시한 것과 맞는 걸 구하는 기능을 가진 메서드이기 때문.
         * 그러므로 중간 부분에 있는 걸 비교할 수 없다.
         * contains() 메서드는 현재 문자열 안에 특정 문자열이 포함되어 있는지를 확인하는 메서드이라서
         * 원하는 부분이 들어있는 걸 뽑고 비교해서 그 값만 출력할 수 있도록 도와줌.
         *
         * 이 문제는 도메인만 필터링해서 제시한 것과 동일한 것만 뽑아내는 코드이기에
         */


        // 7. 성인만 필터링

        List<Person> people = Arrays.asList(
                new Person("김철수", 25),
                new Person("이영희", 17),
                new Person("박민수", 30),
                new Person("정지원", 16),
                new Person("최수현", 22)
        );
        List<String> peopleBox = people.stream()
                .filter(human -> human.getAge() >= 19)
                .map(person -> person.getName())
                .toList();

        System.out.println(peopleBox);

        /**
         * 일단 생성자를 통해 클래스의 객체를 생성하고 getter 를 생성하여 값을 가져올 수 있게 만들어줌
         * 기본적으로 다른 곳에서 사용할 수 없도록 private 를 필수적으로 걸어준다. 문제는 나이(수)를 비교해서
         * 이름(문자열)을 출력하는 것.
         *
         * 문제와 똑같이 List에 제네릭은 스트링을 걸어준다 왜?
         * 원하는 출력값이 이름(문자열)을 반환하는 것이기 때문에!
         * 출력하고 싶은 값을 담을 큰 박스를 만들어주고 문제의 변수를 넣어서 스트림으로 만들어준다. 왜?
         * 중간 계산을 하기 위해서 바꿔주는 것.
         *
         *
         */


        // 10. 재고가 있고 할인 중인 상품 필터링

        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );
        List<String> itemBox = items.stream()
                .filter(item -> item.getStock() >= 1 && item.isOnSale())
                .map(item -> item.getName())
                .toList();

        System.out.println(itemBox);

        /**
         * 스트림으로 바꾸는 이유는 중간연산을 할 수 있도록 (map, sum 같은) 하게 만들기 위해서...
         *
         * 참/거짓을 출력할 때는 굳이 비교식을 세울 필요가 없음.
         * 왜? 이미 item.inOnSale() 에서 결과로 참/거짓을 반환하게 되어 있으니까 굳이 만들 필요가 없다.
         * 쓸데없는 코드량을 늘릴 뿐이고 꼬이기 때문.
         *
         * true 를 반환하고 싶을 때에는 그저 변수명을 적어주면 되고 false 를 반환하고 싶을 때는
         * 변수명 앞에 부정 느낌표 ! 를 붙여서 부정을 반환할 수 있게 함.
         */


        // 보너스 2. 중복되지 않은 숫자 필터링

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> filteringNumbers = numbers1.stream().filter(num ->
            numbers1.stream()
                    .filter(num2 -> num2 == num).count() == 1)
                .toList();
        System.out.println(filteringNumbers);

        // 일반 for 문으로도 알아야 함.
        List<Integer> filteringNumber2 = new ArrayList<>();
        for (Integer num1 : numbers1) {
            int count = 0;
            for (Integer num2 : numbers1) {
                if (num2 == num1) {
                    count++;
                }
            }
            if (count == 1) {
                filteringNumber2.add(num1);
            }
        }
        System.out.println(filteringNumber2);

        /**
         * 똑같이 List 를 걸어주고 반환할 값이 수 이기 때문에 Integer 로 제네릭을 채운 뒤
         * 새 박스를 만들고 문제의 변수를 스트림을 만들어준다 왜?
         * 중간 계산을 할 수 있게끔 만들어주는 부분임.
         *
         * 여기서 필터를 걸어주고 그 안에 작은 박스를 만들어 문제의 변수를 다시 스트림을 걸어 중간 계산식을
         * 한 번 더 할 수 있게. 즉 공식을 한 번 더 세울 수 있게 만들어줌.
         * 다시 필터를 걸어 그 안에서 식을 세워준다. 그러니까 num 와 num2 를 만들어준 덕분에 이를
         * 중복인 걸 비교할 수 있게 해주고  count 를 사용해 1번
         * 1번만 등장하는 수를 num2 와 num 으로 같은지 비교를 해서 겹치지 않는 수를 반환하는 것
         */


        // 보너스 3. 주말 날짜만 필터링
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );

        System.out.println(LocalDate.of(2024, 1, 1).getDayOfWeek());

        List<LocalDate> filteringDates = dates.stream()
                .filter(localDate ->
                        localDate.getDayOfWeek().name().equals("SATURDAY")
                            || localDate.getDayOfWeek().name().equals("SUNDAY"))
                .toList();
        System.out.println(filteringDates);
    }
}


/*
 * contains() 는 부분적으로 문자열을 비교할 수 있고 (그래서 중간 부분 비교가 가능함)
 * startsWith() 은 시작 부분의 한 문자만 적어서 비교하는 메서드.
 *
 *
 */
