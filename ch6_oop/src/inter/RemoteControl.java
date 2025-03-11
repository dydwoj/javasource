package inter;

public interface RemoteControl {

    /*
     * 상수(public final static : 안붙여도 됨), 추상메서드(public abstract : 안붙여도 됨), default,
     * static 메서드
     */
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVoulme(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }

}
