package oop;

public class GoodsStockEx {
    public static void main(String[] args) {

        // new GoodsStock(); : default 생성자를 호출하면서 인스턴스 생성
        // GoodsStock goodsStock = new GoodsStock();

        // 아래 코드들이 필수 코드라면 => 생성자
        // goodsStock.code = "p1013";
        // goodsStock.stockNum = 50;
        GoodsStock goodsStock = new GoodsStock("p1013", 50);

        System.out.println(goodsStock);

        // 판매 -5
        goodsStock.subStock(5);
        // 현재 재고수량 확인
        System.out.println(goodsStock);

        // 제품 입고 + 10
        goodsStock.addStock(10);
        System.out.println(goodsStock);

    }
}
