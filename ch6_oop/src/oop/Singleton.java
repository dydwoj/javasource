package oop;

// singleton : 공통된 하나의 객체를 공유하는 것

public class Singleton {

    private static Singleton singleton = new Singleton();

    // 생성자
    private Singleton() {
    }

    static Singleton getInstance() {
        return singleton;
    }

}
