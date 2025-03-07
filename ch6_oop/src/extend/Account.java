package extend;

// 은행 계좌 만들기

public class Account {

    // 속성 : 계좌번호(ano[110-10-0100]), 이름(oner), 잔액(balance)-long
    private String ano;
    private String oner;
    private long balance;

    // 생성자
    // public Account() {
    // }

    public Account(String ano, String oner, long balance) {
        this.ano = ano;
        this.oner = oner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOner() {
        return oner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // 기능 : 예금하다(deposit/잔액 = 잔액 + 예금액), 출금하다(withdraw잔액 = 잔액 - 출금액)
    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) throws Exception {
        // 인출액이 잔액보다 작으면 빼고, 크면 못 빼게 하기
        if (balance < amount) {
            throw new Exception("잔액 확인");
        }
        this.balance -= amount;
    }

    // toString
    @Override
    public String toString() {
        return "Account [ano=" + ano + ", oner=" + oner + ", balance=" + balance + "]";
    }

}
