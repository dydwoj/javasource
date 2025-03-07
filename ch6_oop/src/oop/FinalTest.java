package oop;

// 클래스 내에 여러개의 클래스 선언 가능 but public 클래스는 1개만 존재해야 함

// public final class FinalTest {}

// class Test extends FinalTest {}

class FinalTest {
    final int MAX_SIZE = 10;

    final void getMaxSize() {
        // MAX_SIZE = 20;
        final int LV = MAX_SIZE;
        // LV = 20;
        System.out.println(LV);
    }

}

class Test extends FinalTest {

}
