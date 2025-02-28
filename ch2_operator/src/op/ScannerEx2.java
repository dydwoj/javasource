package op;

import java.util.Scanner;

// 키보드로 입력 받기
// System.in : 키보드(입력), System.out : 화면(출력)

public class ScannerEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 >> "); // 옆으로 숫자 받으려면 ln 빼고 받을 수 있음
        int input = scanner.nextInt(); // 입력값을 숫자로 받겠다는 의미
        System.out.println(input);

        scanner.close();
    }
}