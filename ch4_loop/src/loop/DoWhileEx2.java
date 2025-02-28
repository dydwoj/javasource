package loop;

import java.util.Scanner;

// for, while과 do while의 차이 : do while 은 무조건 1번은 실행 = 조건검사가 후순위

// 문자 입력받은 후 출력
// q 문자 입력시 반복문 종료

public class DoWhileEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력하세요");

        String input;

        do {
            System.out.println("종료를 원하면 q 입력");
            System.out.print(">> ");
            input = scanner.nextLine();
            System.out.println(input);
        } while (!input.equalsIgnoreCase("q"));

        System.out.println("프로그램을 종료합니다");

        scanner.close();

    }
}
