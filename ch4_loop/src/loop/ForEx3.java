package loop;

// 1 ~ 10 까지의 합 구하기

public class ForEx3 {
    public static void main(String[] args) {
                
        // int sum = 0;

        // for (int i = 1; i < 11; i++) {          
        //     sum += i; // sum = sum + i;
        // }
        // System.out.println("1 ~ 10 까지의 합은 " + sum + "입니다");

        // 1 ~ 100 까지의 수 중에서 3의 배수 출력
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "\t");
            }
        }
        
    }
}
