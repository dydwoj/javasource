package inter;

/* 의존성
    코드를 하나 고치면 또 고쳐야 하는 것 (1:1 이 아닌 차후에 수천개:수천개가 될 수 있음)
     ㄴ 해결을 인터페이스로 할 수 있음
*/
class A {
    public void methodA(B b) { // => 관계는 없어도 불러다 쓸수는 있음
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}

public class InterfaceTest1 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.methodA(new B());
    }
}
