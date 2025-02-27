package loop;

import java.util.Scanner;

// 팩토리얼 구하기
// 입력받은 숫자의 팩토리얼 구하기
// ex) 4 입력 => 4 * 3 * 2 * 1 = 24

public class ForEx6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 숫자 입력");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(num + "의 팩토리얼은 " + fact + "입니다");
    }
}
