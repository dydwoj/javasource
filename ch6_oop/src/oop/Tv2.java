package oop;

// private : 외부 클래스에서 접근 불가 => 그래서 초기화를 생성자를 이용함
// 기본적으로 멤버 변수의 값(기능/특성)에는 private를 붙여서 사용하긴 함 => 멤버 변수 값의 변경은 생성자(초기화) or 메서드 이용

public class Tv2 {

    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자 => 멤버 변수 값 변경 1)
    public Tv2() {
    } // => size, color 변경에 관한 메서드가 없으면 변경이 불가함

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // 메서드 제공 => 멤버 변수 값 변경 2)

    void channelChange(int channel) {
        this.channel = channel;
    }

    // 기능 : 전원 켜기/끄기, 채널 변경, 볼륨 변경
    void channelup() {
        channel++;
    }

    void channeldown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
