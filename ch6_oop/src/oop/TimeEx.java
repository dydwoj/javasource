package oop;

public class TimeEx {
    public static void main(String[] args) {

        Time time = new Time();

        // 시 설정
        time.setHour(11);
        // 분 설정
        time.setMinute(13);
        // 초 설정
        time.setSecond(13.2f);

        System.out.printf("%d시 %d분 %.1f초", time.getHour(), time.getMinute(), time.getSecond());

    }
}
