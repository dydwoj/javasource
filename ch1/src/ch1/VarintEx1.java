package ch1;

// byte : 8비트 = (1)
// 숫자 표현 : 2의8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 표현 가능

public class VarintEx1 {
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
        int age = 15, maxSpeed = 100;
        int max = 256;

        // 변수값 변경 : 변수명만 작성, 타입은 미작성
        // 코드는 위에서 아래로 실행 : 즉 age가 15 -> 30으로 바뀌는 거임 : why? 위에서 아래로 내려오니까
        age = 30;

        // + : 산술연산
        // + : 연결(문자) -> 중간에 문자가 들어가야 함
        System.out.println("나이 : " + age + ", 최고속도 : " + maxSpeed + ", max : " + max);
        System.out.println(age + maxSpeed + max);

        // 형식화된 출력(엔터는 안들어가 있음)
        // %b : boolean, %d : 정수, %f : 실수, %s : 문자열, %c : 문자
        System.out.printf("나이 : %d , 최고속도 : %d , max : %d\n",age,maxSpeed,max);
        // %와 d 사이에 숫자를 쓰면 숫자만큼 공백 들어감
        System.out.printf("나이 : %10d , 최고속도 : %d , max : %d\n",age,maxSpeed,max);
    }
}
