package oop;

// 카드(포커 카드)

/* 변수 종류 (변수 별 생성 시기가 다름)
 1. 지역 변수 : 메서드(main, if, for 등), 생성자, 초기화 블럭 내부에 선언한 변수 (그 지역을 벗어나면 사용 불가)
        ㄴ 변수 선언문이 실행될 때
 2. 인스턴스 변수(= 멤버 변수) : 클래스 영역 내에 선언한 변수
        ㄴ 인스턴스가 생성되었을 때 (new Card 하는 순간 올라감 ex. new Card())
 3. 클래스 변수 : 클래스 영역 내에 선언하지만 앞에 static 붙은 변수
        ㄴ 클래스가 메모리에 올라갔을 때 (작성하고 저장하는 순간 올라감 / 접근 : 클래스이름.)
    => 멤버 변수와 클래스 변수는 서로 다른 존재에 저장 됨(static변수와 매서드의 저장 공간 존재 => 매서드 안에 바로 부를 수 있음)
*/

public class Card {

       // 멤버 변수(인스턴스 변수)
       // 개별적인 특징(속성)
       String kind;
       int number;

       // 클래스 변수
       // 공통적인 특징(속성) : 변하지 않는 공통된 값 이용시 static 사용
       // 폭, 높이
       static int width = 100;
       static int height = 250;

}
