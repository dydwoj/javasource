package poly;

public class BuyerEx {
    public static void main(String[] args) {

        Buyer buyer = new Buyer();

        // buyer가 Tv를 산다 : Tv tv = new Tv();
        buyer.buy(new Tv());
        // buyer가 Computer를 산다 : Computer computer = new Computer();
        buyer.buy(new Computer());
        // buyer가 Audio를 산다 : Audio audio = new Audio();
        buyer.buy(new Audio());
        buyer.summary();

        // System.out.println("남은 돈 : " + buyer.money);
        // System.out.println("현재 보너스 점수 : " + buyer.bonusPoint);

        /*
         * 상속관계가 없다면
         * Computer[] computer = new Computer[3];
         * Tv[] tv = new Tv[3];
         * Audio[] audio = new Audio[3];
         * 
         * computer[0] = new Computer();
         * computer[1] = new Computer();
         * computer[2] = new Computer();
         * 
         * tv[0] = new Tv();
         * tv[1] = new Tv();
         * tv[2] = new Tv();
         * 
         * audio[0] = new Audio();
         * audio[1] = new Audio();
         * audio[2] = new Audio();
         * 
         * buyer.buy(computer);
         * buyer.buy(tv);
         * buyer.buy(audio);
         */

        // 상속관계가 있다면 => 매개변수 다형성

    }
}
