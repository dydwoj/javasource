package op;

import java.util.Scanner;

// 키보드로 입력 받기
// System.in : 키보드(입력), System.out : 화면(출력)

public class ScannerEx1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // 키보드로 무언가 받고 싶을 때 코드

        System.out.println("두자리 정수 입력"); 
        // 사용자가 입력한 값을 input 변수에 담기

        String input = scanner.nextLine(); // "두자리 정수" <= 쌍따옴표를 받은 정수 두자리를 받은 것
        // nextLine() : 문자열로 받아옴

        int num = Integer.parseInt(input);
        // "45" ==> 45 (정수로 받고 싶을 때)
        // Integer.parseInt => '문자열 숫자'를 '일반 숫자'로 변환해주는 코드

        System.out.println("입력값 : " + num);

        scanner.close();
    }
}