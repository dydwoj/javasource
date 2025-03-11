package shop;

public class MyShopEx {
    public static void main(String[] args) {

        IShop shop = new MyShop();
        // 상점이름 지정하기
        shop.setTitle("GoMulSang");

        // 고객 생성
        shop.genUser();

        // 제품 생성
        shop.genProduct();

        // 상점 시작
        shop.start();

    }
}
