package io;

import java.util.Scanner;

/* 키보드 입력
 1) InputStream
 2) Scanner
*/

public class ScannerEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력"); // 엔터
        int num1 = sc.nextInt();
        System.out.println("연산자 입력 (+, -, *, /)");
        // String op = sc.nextLine(); // 줄단위
        String op = sc.next();
        System.out.println("숫자 입력");
        int num2 = sc.nextInt();

        System.out.println(num1 + op + num2);

        // 숫자 입력
        // 5
        // 연산자 입력 (+, -, *, /)
        // 숫자 입력
        // => 1번째 숫자 입력 받기 => 연산자 입력, 숫자 입력이 같이 나옴

        sc.close();

    }
}
