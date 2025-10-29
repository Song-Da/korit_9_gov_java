package com.korit.study.ch27;

public class BuilderMain {
    public static void main(String[] args) {
        BuilderStudy builderStudy  = new BuilderStudy("김준일", 32); // 이렇게 값을 추가해서 생성하는데
        BuilderStudy builderStudy1 = BuilderStudy.builder()
                .value1("김준일")
                .value2(32)
                .build();

        // 앞으로 빌더 패턴을 사용할 때는 위처럼 사용할 터라 훨씬 더 좋을 것...
        // Computer.builder() <<< 이게 주소라서 딱 한 번은 호출이 가능함
        ComputerBuilder computerBuilder = Computer.builder();
        computerBuilder.setCpu("i7");
        computerBuilder.setRam(8);
        Computer computer = Computer.builder().build();
        // 컴퓨터 빌더가 한명 생성되고 11 줄처럼도 가능함.
        // 컴퓨터를 빌드해주는 것. 빌더는 스태틱으로 생성되고 시작과 끝이 이것.
        // 컴퓨터 빌더라는 변수가 필요하고 계속 넣어야 set 호출이 가능하지 않냐
        // 변수에다가 담음 이 바로 뒤에다가 set 이 불가함

        ComputerBuilder computerBuilder2 = Computer.builder().cpu("i5").ram(16);
        Computer computer2 = computerBuilder2.build(); // 이 값을 가지고 컴퓨터를 생성해준다.
        // 결국에는 computerBuilder2 의 변수명이 필요없어진다.

        Computer computer3 = Computer.builder().cpu("i5").ram(16).build(); // 서서히 발전하는 모습 1, 2, 3
        // 컴퓨터 객체가 현재 3개 만들어진 상태이고...



        // 여기에 빌더를 어떻게 끼워맞출 수 있을지 고민하는 것.
//        Product product = Product.builder().name("상품1").price(1000).size("L").build();
//        System.out.println(product);



        // 순서와 개수 상관이 없음
        // 김준일 지워도 오류 안 남.
    }
}

/**
 * 만약에 밸류1, 밸류2 밖에 없는데 인스턴스 변수가 10개가 있으면??
 * 넣고 싶은 건 한 두개라면 나머지는 그냥 기본값을 쓰면 된다.
 *
 * 이러한 형태의 패턴을
 * . 을 찍는다는 건 참조하는 뜻인데 빌더 스터디 점 빌더는 스태틱이기 때문에 호출이 가능하고
 * 얘를 호출하면 빌더스터디빌더 객체를 "생성해서" 리턴해줌
 * 빌더스터디 빌더 객체 그 안에서 얘가 메서드를 가지고 있으니까 호출할 수 있다
 * 매개변수로 받은 밸류 값을 자기 자신한테 넣어줌
 *
 * 리턴은 void 임
 * 점을 찍을 수도 없고 동일한 주소에다가 밸류2 값을 넣어야 한다면 빌더스터디빌러의 주소값을 알아야 함.
 * 본인 객체 주소... 리턴이 본인 객체니까... 다시 메뉴로 갔을 때
 * 밸류2도 자기자신의 객체 주소
 * 빌드라는 메서드를 만들어둠
 * 얘가 호출이 되면 빌더스터디를 생성함
 * 스트링부트로 가면 계속 빌더패턴이 나오니까 중요함
 *
 *
 * 원리는 나중에 꺠우치고 사용법만 먼저 익히기
 * 
 * 
 * 놓친 부분은 그냥 코드 싹 긁어서 지피티한테
 * 오늘은 무슨 수업을 했을까? 설명해달라고 물어보기
 *
 */