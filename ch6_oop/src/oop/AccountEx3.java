package oop;

import java.util.Scanner;

public class AccountEx3 {

    private static Account account[] = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 인스턴스 생성
        // AccountEx2 obj = new AccountEx2();

        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("------------------------------------------------------");

            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("번호 확인");
                    break;
            }
        }

    }

    private static void createAccount() {
        // 계좌번호
        System.out.print("계좌번호 입력 : ");
        String ano = sc.nextLine();
        // 계좌주
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine();
        // 잔액
        System.out.print("금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < account.length; i++) {
            // for : account[i] 첫번째 만나는 null 이면 아래 실행
            if (account[i] == null) {
                account[i] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다");
                // 루프 종료
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("------------------------------------");
        System.out.println("계좌 목록");
        System.out.println("------------------------------------");

        // 배열 출력
        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null) {
        // System.out.printf("%s\t%s\t%d\n", account[i].getAno(), account[i].getOner(),
        // account[i].getBalance());
        // }
        // }
        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOner(), acc.getBalance());
            }
        }

    }

    private static void deposit() {
        // 예금하다 => 계좌번호 입력받기 => 사용자의 계좌번호와 account의 계좌번호 일치 여부 확인
        System.out.print("입금 계좌번호 입력 : ");
        String ano = sc.nextLine();

        Account findAcc = findAccount(ano);
        // findAcc 가 null일 때, 메서드에 접근하면 NullPointerException 발생
        if (findAcc != null) {
            System.out.print("예금액 : ");
            int balance = Integer.parseInt(sc.nextLine());
            findAcc.deposit(balance);
        } else if (findAcc == null) {
            System.out.println("없는 계좌입니다");
            return;
        }

    }

    private static void withdraw() {
        System.out.print("출금 계좌번호 입력 : ");
        String ano = sc.nextLine();

        Account findAcc = findAccount(ano);
        // findAcc 가 null일 때, 메서드에 접근하면 NullPointerException 발생
        if (findAcc != null) {
            System.out.print("출금액 : ");
            int balance = Integer.parseInt(sc.nextLine());
            findAcc.withdraw(balance);
        } else if (findAcc == null) {
            System.out.println("없는 계좌입니다");
            return;
        }

    }

    private static Account findAccount(String ano) {
        // 입력값 ano와 account 배열 계좌 중에서 일치하는 계좌 찾기
        Account acc = null;
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null) {
                // if (account[i].getAno().equals(ano)) {
                // return account[i];
                // }
                if (account[i].getAno().equals(ano)) {
                    acc = account[i];
                    break;
                }
            }
            // 찾으면 return account[i]
        }
        return acc; // 못 찾으면 null
    }

}
