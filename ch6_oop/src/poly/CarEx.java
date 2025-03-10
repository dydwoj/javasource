package poly;

public class CarEx {
    public static void main(String[] args) {

        Car car = new FireEngine();

        car.drive();
        car.stop();
        // car.water(); => X

        // 자손 인스턴스로 캐스팅
        FireEngine fe = (FireEngine) car;
        fe.water();

        // => 더 간단하게 캐스팅
        ((FireEngine) car).water();

        // instance of : 실행 가능한지 여부 확인용
        // ㄴ 참조변수가 참조하고 있는 실제 인스턴스의 타입 알아보기
        if (car instanceof FireEngine) {
            System.out.println("FireEngine의 instance 임");
        }

        if (car instanceof Car) {
            System.out.println("Car의 instance 임");
        }

        Car car2 = new Car();

        if (car2 instanceof FireEngine) {
            // => (FireEngine) car2; => 안된다는 뜻
            System.out.println("car2 - FireEngine의 instance 임");
        }

        if (car2 instanceof Car) {
            System.out.println("car2 - Car의 instance 임");
        }

    }
}
