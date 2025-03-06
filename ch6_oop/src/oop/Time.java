package oop;

public class Time {

    // 속성 : 시, 분, 초
    private int hour;
    private int minute;
    private float second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        // 입력값 hour가 1~23 사이에 있다면 변경
        // 없다면 return
        if (hour < 0 || hour > 23)
            return; // => 조건 만나면 다시 되돌아가는 의미인 return => 아래는 전부 다 안한다
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            return;
        this.minute = minute;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        if (second < 0.0f || second > 59.99f)
            return;
        this.second = second;
    }

}
