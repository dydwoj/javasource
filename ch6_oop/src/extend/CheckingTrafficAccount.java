package extend;

public class CheckingTrafficAccount extends CheckingAccount {

    private boolean hasTrafficCard;

    public CheckingTrafficAccount(String ano, String oner, long balance, String cardNo, boolean hasTrafficCard) {
        super(ano, oner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() { // => getter 부를때 boolean 타입만 get이 아닌 is로 씀
        return hasTrafficCard;
    }

    // 교통비 지불
    long payTrafficCard(String cardNo, int amount) throws Exception {
        // 교통카드가 있는지
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다");
        }
        // 카드번호, 잔액 확인 후 지불
        // 방법 1)
        // long balance = pay(cardNo, amount);
        // return balance;

        // 방법 2)
        return pay(cardNo, amount);
    }

}
