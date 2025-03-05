package oop;

public class CalcEx {
    public static void main(String[] args) {

        Calc calc = new Calc();

        /*
         * +
         * return 타입이 있다면(void 제외)
         * 1) 변수에 담기 => 이 변수를 추가적으로 이용하기 편함
         * 2) 출력문 사용
         */
        int num1 = 45, num2 = 15; // => 자동 형변환
        // 1)
        long result = calc.add(num1, num2);
        System.out.println(result);
        // 2)
        System.out.printf("%d + %d = %d\n", num1, num2, calc.add(num1, num2));
        System.out.printf("%d - %d = %d\n", num1, num2, calc.subtract(num1, num2));
        System.out.printf("%d * %d = %d\n", num1, num2, calc.multiply(num1, num2));
        System.out.printf("%d / %d = %.2f\n", num1, num2, calc.divide(num1, num2));

        double d1 = 35.5, d2 = 10.5;
        System.out.println(calc.divide(35.5, 10.5));
        System.out.printf("%f / %f = %.2f\n", d1, d2, calc.divide(d1, d2));

        // long 타입의 입력 값 2개
        // 출력 : 큰 숫자
        System.out.printf("%d, %d 중 큰수 : %d\n", num1, num2, calc.max(45, 15));
        System.out.printf("%d, %d 중 작은 수 : %d\n", num1, num2, calc.min(num1, num2));

    }
}
