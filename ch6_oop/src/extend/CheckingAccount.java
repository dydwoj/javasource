package extend;

// 은행계좌 + 체크카드 추가하기

public class CheckingAccount extends Account {

    private String cardNo;

    // // 컴파일러가 자동으로 생성하는 코드
    // public CheckingAccount() {
    // super(); // => 부모의 default 생성자 호출을 의미
    // }

    // public CheckingAccount(String cardNo) {
    // this.cardNo = cardNo;
    // }

    public CheckingAccount(String ano, String oner, long balance, String cardNo) {
        super(ano, oner, balance); // => 부모의 생성자 갯수에 맞는(ano, oner, balance)를 호출 함
        this.cardNo = cardNo;
    }

    // 비용(체크카드 사용액) 지불
    // 1. 상용한 카드번호와 체크카드 번호의 일치 여부 확인
    // 2. 잔액 > 사용액
    long pay(String cardNo, int amount) throws Exception {
        if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
            // => this를 빼버리면 AccountEx에 작성한 cardNo와 CheckingAccount의 cardNo 구별이 안됨
            throw new Exception("cardNo나 잔액을 확인해 주세요");
        }
        // 비용 지불 : 잔액 = 잔액 - 사용액
        withdraw(amount);
        // 잔액 리턴
        return getBalance();
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

}
