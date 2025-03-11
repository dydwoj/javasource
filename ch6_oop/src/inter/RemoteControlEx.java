package inter;

public class RemoteControlEx {
    public static void main(String[] args) {

        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVoulme(8);
        rc.setMute(true);
        rc.turnOff();

        RemoteControl.changeBattery();

        rc = new Audio();
        rc.turnOn();
        rc.setVoulme(5);
        rc.turnOff();

        // 익명 구현 클래스(클래스 이름이 없음) => 한번만 쓰고 말때
        rc = new RemoteControl() {

            private int volume;

            @Override
            public void turnOn() {
                System.out.println("라디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("라디오를 끕니다.");
            }

            @Override
            public void setVoulme(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 라디오 볼륨 : " + this.volume);
            }

        };
        rc.turnOn();
        rc.turnOff();

    }
}
