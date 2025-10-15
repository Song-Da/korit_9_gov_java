package com.korit.study.ch02;

public class Operator04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b;
        boolean f = a <= b;
        boolean g = a == b;
        boolean h = a != b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        int n = 10;
        boolean r = 5 <= n && n <= 15;// 5 ~ 15 사이면 n의 값이 true;
//      연산의 순서 때문에 따로 논리 연산자로 만들어 준다.
//      두 가지 조건을 동시에 충족할 수 있는 and 를 써야 true 가 뜸;
//      같은 자료형끼리여야 출력 가능!
        System.out.println(r);

        a = 10;
        b = 10;
        System.out.println("a" == "a");
        System.out.println("a".equals("a")); // 주소에 대한 개념.
        System.out.println(true == true);
        System.out.println(false == false); // false 와 같으니까 true
        System.out.println('a' == 'a');

        int 키 = 170;
        int 몸무게 = 65;
        System.out.println(키 / 100); // 앞에 double 을 붙여서 명시해야 한다. 안 하면 int 로 변해서 소수점 결과를 덜어낸 걸 보여줌.
        System.out.println((double) 키 / 100); // 업 캐스팅을 시키거나 100.0 으로 기입을 해야 한다.
        double BMI = 몸무게 / (((double) 키 / 100) * ((double) 키 / 100)); // 키에서 100을 나눈 결과의 제곱을 몸무게에서 나눈 결과
        System.out.println(BMI);
        boolean 저체중 = BMI < 18.5;                                       // 18.5 미만
        boolean 정상 = BMI >= 18.5 && BMI < 25;                         // 18.5 에서 24.9 사이
        boolean 과체중 = BMI >= 25 && BMI < 30;                          // 25 에서 29.9 사이
        boolean 비만 = BMI >= 30;                                         // 30 이상

        System.out.println("저체중: " + 저체중);
        System.out.println("정상: " + 정상);
        System.out.println("과체중: " + 과체중);
        System.out.println("비만: " + 비만);

//      이상, 이하 보다는 초과, 미만을 애용하는 게 좋다. 이상 이하는 애매하기 때문에 초과 미만은 1 빼거나 1 더해서 하면 됨.
//      정수끼리는 초과 미만이 좋지만 / 더블 소수점 단위는 무한대로 내려갈 수 있기 때문에 이상 이하가 낫다...
//      무조건 기준 데이터는 오른쪽, 변수는 왼쪽이어야 한다. 약속!!


//      급여 계산(근로기준법 주간 총근로시간 40시간, 나머지는 시간외 근무시간)
        int 기본급 = 2400000; // 월급
        int 근무시간 = 52 * 4;

//      시급을 먼저 구해야 한다.
        int 시급 = 2400000 / 160;
        int 시간외수당 = (int) (시급 * 1.5 * 48); // 이 계산의 결과는 자료형이 double 실수가 되기 때문에 다운캐스팅을 해주어야 한다.
        int 총급여 = (기본급 + 시간외수당); // 기본급 + (시간외 수당 * 1.5배) / 세금을 떼지 않은 금액
        int 세금 = (int) (총급여 * 0.1); // 총급여의 10%
        int 지급급여 = 총급여 - 세금; // 총급여 - 세금
        System.out.println("총급여: " + 총급여);
        System.out.println("세금: " + 세금);
        System.out.println("지급급여: " + 지급급여);
//      아ㅠㅠ 이해가 안돼.............



    }
}
