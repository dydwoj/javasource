package loop;

// 1 ~ 100 사이의 숫자 중에서

// 1) 3의 배수의 총합을 구하기

// 2) 3의 배수 더하고 9의 배수는 뺀 합 출력

// 3) 3의 배수 또는 5의 배수 총합 출력

public class ForEx5 {
    public static void main(String[] args) {
        
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("1~100 사이에서 3의 배수의 총합은 " + sum);

        sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum += i;
            }          
        }
        System.out.println("1~100 사이에서 3의 배수이지만 9의 배수는 아닌 수의 총합은 " + sum);

        sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }           
        }
        System.out.println("1~100 사이에서 3의 배수 또는 5의 배수의 총합은 " + sum);

    }
}
