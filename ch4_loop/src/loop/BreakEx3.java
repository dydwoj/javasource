package loop;

import java.util.Scanner;

// 은행 거래 만들기

public class BreakEx3 {
    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        int balance = 0;

        while (run) {

            System.out.println("======================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("======================================");

            System.out.print("메뉴 번호 입력 >> ");
            int menu = sc.nextInt();

            // int amount = 0;
            // int balance = 0; // 여기서 쓰면 루프 돌면 초기화가 됨

            switch (menu) {
                case 1:
                    // 예금액 입력 받기
                    // 잔액 = 잔액 + 예금액
                    System.out.print("예금액 입력 >> ");
                    // amount = sc.nextInt();
                    // balance += amount;

                    balance += sc.nextInt();

                    break;
                case 2:
                    // 출금액 입력 받기
                    // 잔액 = 잔액 + 출금액
                    System.out.print("출금액 입력 >> ");
                    // amount = sc.nextInt(); => 아래처럼 바로 받아도 가능
                    // balance -= amount;

                    balance -= sc.nextInt();

                    break;
                case 3:
                    // 잔액 출력
                    System.out.printf("잔액 : %d\n", balance);
                    break;
                case 4:
                    run = false; // => 반복문을 종료하는 용도
                    System.out.println("종료");
                    break;
                default:
                    break;
            }
        }

    }
}
