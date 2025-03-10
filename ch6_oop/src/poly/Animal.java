package poly;

/* 다형성 (polymorphism)
    상속과 관련이 있음
    여러가지 형태를 가질 수 있는 능력 (동일한 메서드를 실행하지만 다양한 결과물이 나옴 (Employee 참고) - 오버라이딩)
    한 타입의 참조변수로 여러 타입의 객체를 참조한다 (Employee 참고)
    조상 타입의 참조 변수로 자손 클래스의 인스터스를 참조한다
    참조 변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다
        (부모에 선언된 멤버만 접근 가능 - 단, 오버라이딩 된 메서드가 있다면
        자손 클래스의 메서드가 실행됨)
*/
public class Animal {
    Animal() {
        System.out.println("Animal 생성자");
    }
}

class Canine extends Animal {
    Canine() {
        // super(); 먼저 나옴
        System.out.println("Canine 생성자");
    }
}

class Feline extends Animal {
    Feline() {
        System.out.println("Feline 생성자");
    }
}

class Dog extends Canine {
    Dog() {
        System.out.println("Dog 생성자");
    }
}

class Cat extends Feline {
    Cat() {
        System.out.println("Cat 생성자");
    }
}
