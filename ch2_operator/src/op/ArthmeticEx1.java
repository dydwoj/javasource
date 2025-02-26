package op;

public class ArthmeticEx1 {
    public static void main(String[] args) {
        //변수 선언 - int a, b
        int a = 10, b = 4;

        // +, -, *, /
        // 자바에서의 나눗셈에 관한 정수의 값은 몫만 나온다
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        // 소수점 표현은 float, double
        // a/(float)b = 10/4.000000
        // a(int) / b(float) : 타입이 다른 경우 연산시 큰 쪽으로 변환
        System.out.printf("%d + %f = %f\n", a, (float)b, a/(float)b);
       

    }
}
