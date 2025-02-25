package ch1;

// byte : 8비트 = (1)
// 숫자 표현 : 2의8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 표현 가능

public class VarLongEx1 {
    public static void main(String[] args) {
        // 변수
        // 기본타입 : 정수형, 문자형, 실수형, 불린형(참, 거짓)
        // 정수형 : byte(1), short(2), int(4), long(8)
        // 문자형 : char(2)
        // 실수형 : float(4), double(8)
        // 불린형 : boolean(1)

        // 변수선언 방식 : 타입 변수명 = 값;
        // 변수명 : 단어 2개 조합이 되는 경우, 뒷 단어의 시작은 대문자로 한다 (자바에서)
        // max-spped 도 가능 = 스네이크 방식 : 데이터베이스 필드명
        // long : L, l 붙인다
        long age = 15, maxSpeed = 100;
        long max = 256;


        long money = 1000000000000L;

        // 변수값 변경 : 변수명만 작성, 타입은 미작성
        // 코드는 위에서 아래로 실행 : 즉 age가 15 -> 30으로 바뀌는 거임 : why? 위에서 아래로 내려오니까
        age = 30;

        // + : 산술연산
        // + : 연결(문자) -> 중간에 문자가 들어가야 함
        
        System.out.println(money);
        System.out.println("나이 : " + age + ", 최고속도 : " + maxSpeed + ", max : " + max);
        System.out.println(age + maxSpeed + max);

    }
}
