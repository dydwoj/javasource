package ch1;

// byte : 8비트 = (1)
// 숫자 표현 : 2의8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 표현 가능
// 클래스명은 대문자로

public class VarByteEx1 {
    public static void main(String[] args) {
        // 변수
        // 기본타입 : 정수형, 문자형, 실수형, 불린형(참, 거짓)
        // 정수형 : byte(1), short(2), int(4), long(8)
        // 문자형 : char(2)
        // 실수형 : float(4), double(8)
        // 불린형 : boolean(1)

        // 상수 : 값을 한번만 저장
        // 타입 상수명 = 값; final int MAX_VALUE = 100; => 주로 상수는 대문자로 표현

        // 변수선언 방식 : 타입 변수명 = 값;
        // 변수명 : 단어 2개 조합이 되는 경우, 뒷 단어의 시작은 대문자로 한다 (자바에서)
        // max-spped 도 가능 = 스네이크 방식 : 데이터베이스 필드명
        byte age = 15, maxSpeed = 100;
        // byte max = 256; => 불가! (why? : 127까지 표현이 안되서)

        // System.out.println(age);
        // System.out.println(maxSpeed);

        // + : 산술연산
        // + : 연결(문자) -> 중간에 문자가 들어가야 함
        System.out.println("나이 : " + age + ", 최고속도 : " + maxSpeed);
        System.out.printf("나이 : %d, 최고속도 : %d\n" ,age,maxSpeed);
        System.out.println(age + maxSpeed);

    }
}
