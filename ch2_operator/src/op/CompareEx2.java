package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// \t = tab
// 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교

public class CompareEx2 {
    public static void main(String[] args) {
        float f1 = 0.1f;
        double d1 = 0.1;
        double d2 = (double)f1;

        // %19.17f : 19자리로 표현해주되, 소수점(.)17자리까지 나오게
        // 그냥 0.1 => double로 인식

        System.out.printf("10.0 == 10.0f %b\n", 10.0==10.0f); // true
        System.out.printf("0.1 == 0.1f %b\n", 0.1==0.1f); // false
        System.out.printf("f = %19.17f\n", f1); // 0.10000000149011612
        System.out.printf("d1 = %19.17f\n", d1); // 0.10000000000000000
        System.out.printf("d2 = %19.17f\n", d2); // 0.10000000149011612 => float를 double로 타입 형변환을 한다고 해도 float 숫자 그대로 가져감
        System.out.printf("f1 = d1 %b\n", f1 == d1); // false
        System.out.printf("d1 = d2 %b\n", d1 == d2); // false
        System.out.printf("d2 = f1 %b\n", d2 == f1); // true
        System.out.printf("(float)d1 = f1 %b\n", (float)d1 == f1); // true


    }
}
