package com.korit.study.ch21;

public class ClassA {

    public void run(Singleton singleton) {
//        Singleton singleton = new Singleton("ClassA 데이터");
        Singleton.getInstance().changeData();
        Singleton.getInstance().deleteData();
    }
}