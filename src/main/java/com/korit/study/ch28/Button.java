package com.korit.study.ch28;

class Button implements ClickListener {
    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
/**
 * 왜 null 을 체크해야 하나?
 * null 인셉션을 막기 위해서? 언제 어느 상황에서 쓰일까?
 * set 을 안 쓸 때??
 * 저 객체를 넘겨주지 않으면 set 을 listener 을
 * 클릭은 호출이 됨 하지만 리스너 안에 든 온클릭을 가져와야 하는 거고 지금 setter 을 써서
 * 얘가 존재할 텐데 그 객체 안에 든 온클릭을 호출해라. 그러니까 버튼만 생성해서 클릭을
 * 호출할 수 있음. 버튼 객체만 생성해서 호출하게 되면
 * 리스너 안에 온클릭이 없음 그래서 우리가 저 리스너 객체를 하나 생성해줘야 하고 그게
 * 인터페이스다. 인터페이스를 임플리먼츠한 클래스를 만들어서 ClickListener 을 만들어주는 거임.
 * 얘가 동작을 해주나? 여기서 생성을 하는 거다.
 * 업 캐스팅 가능... 클릭 리스너로 구현된 객체이기 때문에...
 * 또 클래스를 정의함.
 *
 */
            listener.onClick();
        }
    }

    @Override
    public void onClick() {
        System.out.println("전원이 켜졌습니다.");
    }
}

/**
 * 만약에 버튼이 30개가 있으면 하나하나마다 클래스 임플리먼츠를 해서 여러개를
 * 싹 클래스를 만들어줘야 함.
 * 그런데 회원가입 버튼을 만든다고 하면
 *
 * 흐름을 이해하는 걸 노력하자...
 * 익명 클래스를 사용할 때는 람다를 배우고 나면 두가지가 구분되고
 * 둘 다 ㅈㄴ 필요함
 * 조건이 충족되면 람다를 사용할 수 있고 그러지 아니하면 익명 클래스를 사용해야 함.
 */