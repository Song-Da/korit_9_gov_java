package com.korit.study.ch02;

public class ComplexSalaryCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int baseSalary = 4000000;
        int workYears = 12;
        int position = 3;
        int overtimeHours = 15;

        // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
        // 직급 수당 계산
        int positionAllowance = position == 1 ? 0 :
                position == 2 ? 500000 :
                position == 3 ? 1000000 :
                position == 4 ? 2000000 : 0;
        // 포지션은 정해준 대로 1 ~ 4 까지만 쓸 수 있고 참일 때 이거 참일 때 이거 모두가 거짓일 때 0 으로 리턴하느 것.
        // 수당에서는 마이너스가 없다.
        System.out.println(positionAllowance);

        double yearRate = workYears < 3 ? 0.0 : workYears < 7 ? 0.05 :
                        workYears < 15 ? 0.1 : 0.2;
//        이 변수는 추가적인 건데 요율만 나누어서 적어준다.

        // 연차 수당 계산 (기본급 기준 %)
        int yearAllowance = (int) (baseSalary * yearRate);
//         0% 를 적용시킨다. 기본급에다가 곱해야 함. 그래야 연차 수당이 따로 나옴
//         3년보다 작은 건 성립되었으니까 남은 것들 중에서는 7년보다 작으면 앞에 굳이 범위를 줄 필요가 없다. (workYears > 2 && )
//         이 결과의 자료형은 double, int 로 되어 있기 때문에 int 로 다운 캐스팅을 해야 한다.
//         바꾸어야 하는 곳 괄호를 꼭 묶어야 모두 적용이 된다.
//        변수를 하나 추가해서 중복 코드를 제거하면 보기가 쉽다 (workYears < 3 ? baseSalary * 0 :
//                workYears < 7 ? baseSalary * 0.05 :
//                workYears < 15 ? baseSalary * 0.1 : baseSalary * 0.2)


        // 야근 수당 계산
        boolean isOverTime = overtimeHours  - 10 > 0;
        int baseOvertime = isOverTime ? 10 : overtimeHours;
//        10 을 뺏는데 0 보다 크면 초과인 것
        int overTime = isOverTime ? overtimeHours - 10 : 0;
        int overtimePayment = isOverTime ? ((overtimeHours - 10) * 15000) + (10 * 10000) :
                overtimeHours * 10000;
//        이건 조건에 근무 시간을 봐야 한다. 해당 근무시간이 10시간 이하이면 11시간 미만으로 고쳐주면 된다.
//        10시간 까지라는 근무 조건이 있으므로 따로 지급이 되어야 한다.

        // 특별 보너스 계산
        int specialBonus = position == 4 && workYears > 14 ? 500000 : 0;
//        15년 이상 근무했더라도 과장이면 안 됨. (14년 초과로 박아주면 됨)
//        50만원을 주고 안 주고니까 조건을 하나만 걸면 된다.

        // 총 지급액 계산
        int totalSalary = baseSalary + positionAllowance +
                yearAllowance + overtimePayment + specialBonus;
//        세금을 떼서

        double taxRate = totalSalary <= 5000000 ? 0.1 : 0.15;

        // 세금 계산
        int tax = (int) (totalSalary * taxRate);
//        이것도 int 로 계산해줘야 하니까 전체를 감싸준다.
//        여기서 이하를 쓰는 건 소수점이 너무 길어져서 보기 쉽게 이하로 표기하는 게 나음. 가능한 초과 미만을
//        쓰는 게 낫지만 그게 아니라면 이상 이하를 쓴다. 상황에 따라 선택해서 쓰기
//        이걸 (totalSalary <= 5000000 ? 0.1 * totalSalary : 0.15 * totalSalary) 변수를 추가해서
//        코드를 줄일 수가 있고

        // 실수령액 계산
        int finalSalary = totalSalary - tax;

        // 직급명 출력용
        String positionName = position == 1 ? "사원" :
                position == 2 ? "대리" :
                position == 3 ? "과장" :
                position == 4 ? "부장" : "미지정";
//        포지션이 1 이면 사원이지만 아니고 2이면 대리이고 아니고 3이면 과장이고 아니고 4이면 부장이고 아니면 미지정


        // 결과 출력
        System.out.println("=== 급여 명세서 ===");
        System.out.println("기본급: " + String.format("%,d", baseSalary) + "원");
        System.out.println("직급: " + positionName);
        System.out.println("직급수당: " + String.format("%,d", positionAllowance) + "원");
        System.out.println(String.format("연차수당 : %,d", yearAllowance));
        System.out.printf("야근수당: %,d원 (기본 %d시간 + 초과 %d시간)\n", overtimePayment, baseOvertime, overTime);
        System.out.println("특별보너스: " + String.format("%,d", specialBonus) + "원");

//        String.format 은 조합을 하는 것. 포멧팅을 하는 거라면 세자리씩 알아서 쉼표를 끊어준다.
//        String.format("%,d --> %d", baseSalary, baseSalary) + "원")
//        %d 가 늘어나면 옆의 변수도 같이 늘어나야 한다. 클래스, 스태틱을 배우면 이해할 수 있다.

//        문자열을 합쳐주는 방법을 썼고 String... 응용을 많이 해봐야 한다.
//        printf 를 쓸 때 주의할 게 줄바꿈이 되지 않으므로 \n 을 붙여서 줄바꿈을 일으켜야 자연스럽다.
        // 나머지 출력

    }
}

//        삼항연산자를 많이 쓰기 때문에 자유자재로 쓸 수 있어야 한다. 연습이 많이 필요함.
//        집에 가고 싶다 와. 진짜 에바야
//        노션에 있는 나머지 문제 꼭 풀어야 한다. 많이 해야 늘어나고 안 해보면 감이 안 잡힘
//        처음엔 잘 안 되는 게 맞기 때문에..........
