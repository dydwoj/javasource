package oop;

// 은행 계좌 만들기

public class Account {

    // 속성 : 계좌번호(ano[110-10-0100]), 이름(oner), 잔액(balance)-long
    String ano;
    String oner;
    long balance;

    // 기능 : 예금하다(deposit/잔액 = 잔액 + 예금액), 출금하다(withdraw잔액 = 잔액 - 출금액)
    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        this.balance -= amount;
    }

    // 생성자

    public Account() {
    }

    public Account(String ano, String oner, long balance) {
        this.ano = ano;
        this.oner = oner;
        this.balance = balance;
    }

    // toString
    @Override
    public String toString() {
        return "Account [ano=" + ano + ", oner=" + oner + ", balance=" + balance + "]";
    }

}
