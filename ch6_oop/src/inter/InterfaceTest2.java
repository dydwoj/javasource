package inter;

interface I {
    void methodB();
}

class AA {
    public void methodA(I i) { // => 관계는 없어도 불러다 쓸수는 있음
        i.methodB();
    }
}

class BB implements I {
    @Override
    public void methodB() {
        System.out.println("methodB()");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        AA obj1 = new AA();
        obj1.methodA(new BB());
    }
}
