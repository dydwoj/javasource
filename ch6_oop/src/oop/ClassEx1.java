package oop;

/* OOP(Object Oriented Programming = 객체지향)
    재사용성 높음
    코드의 관리가 용이함
    신뢰성 높은 프로그램 작성


    클래스 : 객체 정의, 설계도, 틀
    클래스 용도 : 객체 생성

    객체 : 사물(책상, 의자, 자동차, TV), 개념(수학공식)

    붕어빵 기계(클래스) - 붕어빵(객체)

    객체와 인스턴스
    인스턴스 : 어떤 클래스로부터 만들어진 객체
    ex) 책상은 책상 클래스의 인스턴스다
    (특정 클래스에서 만들어진게 객체(=인스턴스) but 객체는 하나의 클래스에 한정되지 않음)

    메소드 : () <-괄호
*/

public class ClassEx1 {
    public static void main(String[] args) {

        // 인스턴스 생성 : 클래스명 변수명 = new 클래스명();
        Tv tv = new Tv(); // 그냥 TV tv에서 = new Tv()를 하는 순간 Tv.java의 클래스에 관한 heap을 생성함
        Tv tv2 = new Tv();
        // Tv 클래스(Tv.java)를 heap이란 공간에 생성

        // 속성 확인
        System.out.println(tv); // => oop.Tv@24d46ca6 => 메소드 설정 후 : Tv [size=0, color=null, channel=0, volume=0,
                                // power=false]
        System.out.println(tv2); // => oop.Tv@4517d9a3 => 메소드 설정 후 : Tv [size=0, color=null, channel=0, volume=0,
                                 // power=false]

        // 인스턴스의 사용
        tv.color = "black";
        tv.channelup();
        System.out.println("tv 현재채널 : " + tv.channel);
        System.out.println("tv 색상 : " + tv.color);

        tv2.power(); // => 메소드 호출(메소드 실행)
        tv2.channel = 8;
        tv2.volume = 22;
        System.out.println(tv2);

    }
}
