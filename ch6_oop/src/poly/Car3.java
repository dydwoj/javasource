package poly;

/* 멤버변수 선언 타입 : 기본, 객체
    기본 : 정수 - 0 / 실수 - 0.0 / 불린 - false...
    객체 : null
        ㄴ 대문자로 시작, 배열
*/

public class Car3 {

    // 객체 타입 변수 선언 => null
    Tier frontLeft = new HankookTire(5, "앞 왼쪽"); // 3. 멤버변수 선언하면서 초기화
    Tier frontRight;

    Tier backLeft;
    Tier backRight;

    int num;

    /*
     * NullPointerException 피하는 법 => 초기화
     * 1. 생성자
     * 2. set 메서드
     * 3. 멤버변수 선언하면서 초기화 => Tier frontLeft = new HankookTire(5, "앞 왼쪽");
     */

    // 1. 생성자
    public Car3(Tier frontLeft, Tier frontRight, Tier backLeft, Tier backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

}
