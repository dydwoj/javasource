package inter;

/* 인터페이스클래스 (interface) : 부모 역할
    = 추상클래스 (단, 추상화의 정도가 높다)
    class 앞에 interface 키워드 사용
    일반 멤버변수, 메서드를 가질 수 없음 => 추상클래스보다 추상화의 정도가 높은 이유
    자식 클래스에서 추상메서드에 관한 재정의를 강제한다!
    상수를 가짐
    <장점>
        1. 표준화가 가능하다
        2. 관계가 없는 클래스들에게 관계를 맺어 줄 수도 있다
        3. 의존성 약화 => 어떤 객체를 매개변수로서 호출하던지 인터페이스의 내용만을 보고 쉽게 변경 가능
            ㄴ 다른 클래스에 대한 민감도를 낮춤

    Movable, Attakable, Unit, Fightable 묶음 = interface의 "다중상속"
        클래스는 단일상속만 가능 (ex. class A extends B{} + 여러개 불가!)
*/
public interface PlayingCard {

    // 일반 멤버변수 선언 불가! (The blank final field pause may not have been initialized)
    // boolean pause;

    // 상수(이름을 대문자로 선언)인 멤버변수로 선언 가능
    public static final int SPADE = 4;
    // public static final 생략가능!
    int CLOVER = 1; // => 그냥 int CLOVER는 안되지만 이 변수를 1로 정했기에 가능!

    // 일반 메서드 선언불가 ! (Abstract methods do not specify a body)
    // void pause() {}

    // 추상메서드 선언 가능! => public abstract 생략가능!
    void pause();

    // {} 를 가지고 있는 메서드를 만들 수 있음! => 단! static, default가 붙는다면
    static void display() {
    }

    default void print() {
    }

}
