package abstractclass;

/* 추상클래스(abstract) : 부모 역할
    추상화 : 클래스간의 공통점을 찾아내서 공통의 조상을 만드는 작업
        class 앞에 abstract 키워드 사용
        추상메서드 사용 : 타입 변수명 ();
        => 추상 메서드를 하나라도 가지고 있으면 무조건 추상클래스가 된다!
        자식 클래스에서 추상메서드에 관한 재정의를 강제한다! => 일반클래스에서의 오버라이딩은 선택사항
            ㄴ 부모는 그저 틀만 제공(템플릿같은 느낌) => 자손이 재정의 해서 사용
        일반적인 멤버변수, 생성자, 메서드 구현 가능
        인스턴스 생성 불가(new 불가) => 부모 역할을 위해서 존재
    구체화 : 상속을 통해 클래스를 구현, 확장하는 작업
*/
public abstract class Player {

    boolean pause;
    int currentPos;

    Player() { // => 자손의 생성자에 super 되기 위해
        pause = false;
        currentPos = 0;
    }

    // 추상메서드
    abstract void play();

    // 일반메서드
    void pause() {

    }

}

class CDPlayer extends Player {

    // 추상메서드인 void play(){} 를 재정의
    @Override
    void play() {
        System.out.println("CD플레이어");
    }

}

class AudioPlayer extends Player {

    // 추상메서드인 void play(){} 를 재정의
    @Override
    void play() {
        System.out.println("Audio플레이어");
    }

}
