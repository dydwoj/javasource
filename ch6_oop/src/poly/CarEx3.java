package poly;

public class CarEx3 {
    public static void main(String[] args) {

        // 생성자 생성 후 초기화 방법
        HankookTire frontLeft = new HankookTire(1, "앞 왼쪽");
        HankookTire frontRight = new HankookTire(1, "앞 오른쪽");
        HankookTire backLeft = new HankookTire(1, "뒤 왼쪽");
        HankookTire backRight = new HankookTire(1, "뒤 오른쪽");

        Car3 car3 = new Car3(frontLeft, frontRight, backLeft, backRight);

        // 위에 처럼 일일히 하기 싫으면 대신 넣어줘도 됨
        car3 = new Car3(new HankookTire(1, "앞 왼쪽"), frontRight, backLeft, backRight);

        // Car3 car3 = new Car3();만 했을 시 : 0
        System.out.println(car3.num);
        // Car3 car3 = new Car3();만 했을 시 : null
        System.out.println(car3.frontLeft);
        // Car3 car3 = new Car3();만 했을 시 : NullPointerException
        System.out.println(car3.frontLeft.accumulateRotation);

    }
}
