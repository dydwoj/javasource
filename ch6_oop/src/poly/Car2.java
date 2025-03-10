package poly;

public class Car2 {

    // 자동차 바퀴 장착
    Tier frontLeft = new HankookTire(6, "앞 왼쪽");
    Tier frontRight = new HankookTire(2, "앞 오른쪽");

    Tier backLeft = new KumhoTire(3, "뒤 왼쪽");
    Tier backRight = new KumhoTire(4, "뒤 오른쪽");

    int run() {
        System.out.println("[자동차가 주행중입니다]");
        if (!frontLeft.roll()) {
            stop();
            return 1;
        } else if (!frontRight.roll()) {
            stop();
            return 2;
        } else if (!backLeft.roll()) {
            stop();
            return 3;
        } else if (!backRight.roll()) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다]");
    }

}
