package oop;

public class AccountEx {
    public static void main(String[] args) {

        Account account = new Account("110-10-0100", "Jeong", 1000000);

        // 200000원 입금
        account.deposit(200000);

        System.out.printf("현재 잔액 = %d\n", account.getBalance());

        // 150000원 출금
        account.withdraw(150000);
        System.out.printf("현재 잔액 = %d\n", account.getBalance());

    }
}
