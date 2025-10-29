package com.korit.study.ch28;

class ButtonMain {
    public static void main(String[] args) {
        Button button = new Button();
        button.click();

        // TODO : 여기에 익명 클래스를 사용하여 ClickListener 구현
        // 힌트 : setClickListener() 메서드에 익명 클래스로 구현한 객체를 전달
        ClickListener clickListener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼을 클릭하였습니다.");
            }
        };
        button.setClickListener(clickListener);

        button.click();
    }
}

/**
 * 객체 생성과 호출을 잘 구분해야 함.
 * setListener
 */