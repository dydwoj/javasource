package poly;

public class ChildEx {
    public static void main(String[] args) {

        Child child1 = new Child();
        Parent parent = new Child(); // => 접근범위 자체는 Parent 클래스
        // => but. 오버라이딩된 메서드가 있다면 그게 실행됨

        child1.method1();
        child1.method2();
        child1.method3();

        // parent로 접근할 수 있는 범위
        // parent.field1만 나옴 2 안나옴
        parent.method1(); // => parent.method1
        parent.method2(); // => Child.method2

        // parent.method3(); => Child 꺼라 콜이 안됨 (method method3() is undefined)

        // method3 사용
        // Child child2 = parent; => 좁은 범위의 parent 를 child에 대입이 불가!
        // 부모 = 자식 (O)
        Child child2 = (Child) parent; // 그래서 강제형변환(casting)!
        child2.method3();

        // java.lang.ClassCastException: class poly.Parent cannot be cast
        Parent parent2 = new Parent(); // => 생성된 인스턴스 자체가 틀림!
        // 자식 = 부모 (X)
        // => parent의 new는 Child 였지만 parent2의 new는 Parent 클래스 이기에 불가능!
        child2 = (Child) parent2; // => 컴파일 단계는 넘어가지만 실행단계에서는 exeption이 뜸
        child2.method3();

    }
}
