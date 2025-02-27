package condition;

import java.util.Scanner;

// 임금 구하기

public class IfTest8 {
    public static void main(String[] args) {

        // 시간당 임금
        int rate = 9800;
        int pay, hours;

        // 근무시간을 입력하다

        // 근무시간 8시간 까지는 시간당 임금을 지불함
        // 8시간 초과 근무시에는 시간당 임금의 1.5배 지불함
        // 임금 계산 후 pay 변수에 담기

        // 10시간 : 8 * 9800 + 2 * 9800 *1.5

        // 최종 출력
        // 받는 임금은 120000

        Scanner scanner = new Scanner(System.in);
        System.out.println("근무시간 입력");
        String input = scanner.nextLine();
        hours = Integer.parseInt(input);

        if (hours > 8) {
            pay = rate * 8 + (int)(rate * (hours - 8) * 1.5);
        } else {
            pay = rate * hours;
        }

        System.out.println("받는 임금은" + pay);

        scanner.close();
            
        



    }
}
