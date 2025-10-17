package com.korit.study.ch21;

import java.util.Objects;

// volatile 은 휘발되는 녀석. 캐시는 특정 시간동안 계속 기억하는데 저건
// 최신 정보로 싱크로나이즈드에 대한 데이터 상태가 날아가면서 계속 최신 상태가 됨.
// 특정 기간동안 옛날 데이터를 가지고 있는 게 아니라 최신 데이터로 변경이 됨.

public class Singleton {
    private volatile static Singleton instance; // 여기에 넣고 공유하면 됨. 맨 처음 정의될 때는 null

    private String data;

    private Singleton(String data) { // 다른 바깥에서는 생성자 호출이 안 되도록 생성자를 private 로 바꾸는 행위.
        this.data = data;
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) { // 여기서 조건을 줌. null 일 때만 instance 를 null 로 바꿔주는 조건
            instance = new Singleton("Class Data");
        }
        instance = new Singleton("Class Data"); // 한번이라도 호출되면 instance 에... 호출될 때마다 새로 생기는 문제점이 있으니 위처럼 조건을 걸어준다.
        return instance;
    }

    // 이 클래스 다른 사람이 작업중인지 확인해보라 하고 만약 작업 중이라면 뛰어넘으라는.
    // 하지만 작업중이지 않으면 안에서 혹시나 다시 재검사 돌리고
    // 진짜 없을 때 생성하겠다는 의미.
    public static Singleton getSynchronizedInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton("Class Data");
                }
            }
        }
        return instance;
    }

    public void changeData() {
        System.out.println("데이터 변경: " + data);
    }

    public void deleteData() {
        System.out.println("데이터 삭제: " + data);
    }
}



// 클래스 안에서 변수는 무조건 private 다.
// 해결은 getter 를 또 생성
// 변수 이름 또한 instance 로 고정하고 getter 를 불러서 같은 패키지 안에 있는 것만 부르기 가능하게 만듦
// 쓸 일이 있을 때만 힙 메모리에다 메모리 할당하면 됨.

// 쓰레드에서 싱글톤 사용 시 문제가 생김. 동시성이라는 걸 명확히 해결하려고 하면
// 작업을 하는 동안에는 그 다음 사람이 와도 전 사람이 작업을 안 끝낸 걸
// 넘겨버리게 만들어야 함. 점유를 해서 남이 손을 대지 못하게 함. 이를 싱크를 맞춘다고 함.
// 싱크로나이즈. 동기화 한다. 이걸 걸면 작업을 누군가 하고 있으면 다음 사람이 그걸 해야 될 때 하지 않고 전 사람이 다끝낼때까지...
// 작업을 멈춤. 하지마만 이 또한 문제도 멈춰있으라고 수다른 쓰레드가 시도를 하게 되면 작업중입니다 하고
// 쓰레드 잇셉션이 터져서 예외가 터지면 작업이 끝나버림. 강제종료
// 예외가 터졌을 때 wait() 을 걸어주면 멈춰서 다시 쭉 이어서 가능함.
// 동시성까지 해결을 해줘야 완전한 싱글톤이라고 할 수 있는데. 지금은 싱글 쓰레드.
// 쓰레드가 여러개가 생길 수 있는데 싱글 쓰레드 일 때는 굳이 동시성 해결하지 않아도 됨
// 동기화 작업이 무조건 들어가는데 비용 낭비가 심함. 그러니까 여러개가 아닌 이상 싱글 쓰레드일 시 그러지 않아도 됨.

//

