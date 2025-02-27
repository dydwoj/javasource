package condition;

import java.util.Scanner;

// num1 이라는 변수 선언(임의의 값) 

// 사용자로부터 입력을 받아 num1 이라는 변수를 받는다면

// num1 이 짝수, 홀수인지 출력
// num1 % 2 == 0 => 짝수 => 나머지가 0이면 다 짝수니까, else(그외 모든것)은 당연히 홀수

public class IfTest7 {
    public static void main(String[] args) {
        
        // int num1 = 37;

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력"); 
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        if (score % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        scanner.close();


    }
}
