package condition;

import java.util.Scanner;

// 스위치 코드의 case : 이후에 담지 않은 이유는 반복이기에

// 연산자, 피연산자 입력받은 후 계산해서 결과 출력
// +, -, *, /, % = 연산자(op)

// 출력문의 형태 : 5 - 3 = 2
public class SwitchTest6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산자 입력");
        String op = scanner.nextLine();

        System.out.println("첫번째 피연산자 입력");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("두번째 피연산자 입력");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        int result = 0; // 값을 담아주기 위해서 쓴 빈 공간 코드

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("입력값을 확인해 주세요");
                System.exit(0); // case.1 아래 추가 안하게 하고 막는 코드 : 여기서 "프로그램 종료"의 의미
                // break; => default의 break는 없어도 무관
        }

        // 여기서 끝나면 default 값과 아래 값이 같이 나옴 so! => case1, 2의 방법으로 구현
        System.out.printf("%d %s %d = %d", num1, op, num2, result);

        // case.2 : if (result !=0) {
        //     System.out.printf("%d %s %d = %d", num1, op, num2, result);
        // }

        scanner.close();
    }
}
