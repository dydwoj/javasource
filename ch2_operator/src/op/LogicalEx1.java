package op;

// 논리연산자 : 비교연산자 여러개 연결 => true, false
// ex) x가 4보다 작거나 10보다 크다
// &&(and), ||(or), !(not)

// y는 2의 배수 또는 3의 배수이다
// y % 2 == 0 || y % 3 == 0

// 주의 !!! : y % 2 == 0 || y % 3 == 0 && y % 6 != 0 => 이건 섞이면 우선순위가 &&가 높아서 결과값이 달라진다

public class LogicalEx1 {
    public static void main(String[] args) {
        int x = 0;
        char ch = ' ';

        x = 15;
        // x는 10보다 크고, 20보다 작다
        // x > 10 && x <20
        System.out.printf("x=%2d, 10 < x && x < 20 = %b\n", x, 10 < x && x < 20);

        x = 6;
        // x는 2의 배수 또는 3의 배수이지만, 6의 배수는 아니다
        // (x % 2 == 0 || x % 3 == 0) && x % 6 != 0
        System.out.printf("x=%2d, x && 2 == 0 || x%%3==0 && x%%6 !=0 %b\n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);

        ch = '1';
        // '0' ~ '9' 사이 숫자 확인하는 코드
        //'0' <= ch && ch <= '9'
        System.out.printf("ch=%c, '0' <= ch && ch <= '9' = %b\n", ch, '0' <= ch && ch <= '9');

        ch = 'a';
        // 소문자인지 확인하는 코드
        // 'a' <= ch && ch <= 'z'
        System.out.printf("ch=%c, 'a' <= ch && ch <= 'z' = %b\n", ch, 'a' <= ch && ch <= 'z');

        ch = 'A';
        // 대문자인지 확인하는 코드
        // 'A' <= ch && ch <= 'Z'
        System.out.printf("ch=%c, 'A' <= ch && ch <= 'Z' = %b\n", ch, 'A' <= ch && ch <= 'Z');

        ch = 'q';
        // 소문자 q 이거나 대문자 q 인지 확인
        // ch=='q' || ch == 'Q'
        System.out.printf("ch=%c, ch=='q' || ch == 'Q' = %b\n", ch, ch=='q' || ch == 'Q');

        System.out.printf("ch=%c, !(ch=='q' || ch == 'Q') = %b\n", ch, !(ch=='q' || ch == 'Q')); // !( )괄호안에 확인 후 반대로 결과값 바꾸기

    }
}
