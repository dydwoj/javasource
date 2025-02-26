package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// \t = tab
// 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교

public class CompareEx1 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f \t %b\n", (10==10.0f)); // int 10과 float(실수) 비교
        System.out.printf("'0' == 0 \t %b\n", ('0' == 0)); // 문자 0과 숫자 0 비교
        System.out.printf("'A' == 65 \t %b\n", ('A' == 65)); // A(유니코드:65)랑 65 비교
        System.out.printf("'A' > 'B' \t %b\n", ('A' > 'B')); // A(65)랑 B(66) 비교
        System.out.printf("'A'+1 != 'B' \t %b\n", ('A'+1 != 'B')); // A(65) + 1과 B(66) 비교


    }
}
