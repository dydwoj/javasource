package oop;

public class GoodsStock {
    // 속성 : code(상품코드), stockNum(재고수량)
    String code;
    int stockNum;

    // 생성자
    // public GoodsStock() { => default 생성자(구분은 괄호'()'안에 아무것도 없어야 함) = 선택사항
    // }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    // 기능 : 재고를 추가한다, 재고를 감소한다
    void subStock(int num) {
        this.stockNum -= num;
    }

    void addStock(int num) {
        this.stockNum += num;
    }

    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

    void adStock() {

    }

    // 내가 짠 코드
    int stockup(int num1) {
        this.stockNum = stockNum + num1;
        return stockNum;
    }

    int stockdown(int num2) {
        this.stockNum = stockNum - num2;
        return stockNum;
    }

}
