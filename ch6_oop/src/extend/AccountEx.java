package extend; // => 1번. 패키지 선언문

import java.util.Scanner; // 2번. 임포트 구문

public class AccountEx { // => 3번. 클래스
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        // CheckingAccount 의 생성자를 호출
        CheckingAccount cAccount = new CheckingAccount("110-11", "hong", 10000, "123-1232"); // => 부모의 인스턴스도 같이 생성이 된다

        System.out.println("계좌 번호 : " + cAccount.getAno()); // => null
        System.out.println("계좌주 : " + cAccount.getOner()); // => null
        System.out.println("잔액 : " + cAccount.getBalance()); // => 0
        System.out.println("체크카드 번호 : " + cAccount.getCardNo()); // => null

        try {

            System.out.println("현재 잔액 : " + cAccount.pay("123-1232", 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // CreditLineAccount
        CreditLineAccount creditLineAccount = new CreditLineAccount("110-11", "hong", 100, 300);

        try {
            // creditLineAccount.withdraw(3500);
            creditLineAccount.withdraw(250);
            System.out.println("현재잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BonusPointAccount
        BonusPointAccount bAccount = new BonusPointAccount("123", "hong", 10000, 0);

        bAccount.deposit(5000);
        System.out.println("보너스 포인트 : " + bAccount.getBonusPoint());

        // CheckingTrafficAccount
        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("123", "hong", 10000, "1112", false);
        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("123", "hong", 10000, "1112", true);

        try {
            System.out.println("교통카드 지불 후 현재 잔액 : " + checkingTrafficAccount2.payTrafficCard("1112", 100));
            System.out.println("현재 잔액 : " + checkingTrafficAccount.payTrafficCard("1112", 100));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
