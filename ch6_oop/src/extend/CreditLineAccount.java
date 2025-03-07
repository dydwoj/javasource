package extend;

// 부모의 기본 생성자가 없으면 바로 사용이 안됨 => 다른 생성자를 호출하면 됨

public class CreditLineAccount extends Account {

    private int creditLine; // 마이너스한도

    // CreditLineAccount(){
    // super();
    // }

    public CreditLineAccount(String ano, String oner, long balance, int creditLine) {
        super(ano, oner, balance);
        this.creditLine = creditLine;
    }

    // 오버라이딩
    // 잔액 + 마이너스한도 - 사용액

    @Override
    void withdraw(long amount) throws Exception {
        if (super.getBalance() + this.creditLine < amount) {
            throw new Exception("한도 범위를 초과합니다");
        }
        // 잔액 = 잔액 - 사용액
        super.setBalance(super.getBalance() - amount);
    }

}
