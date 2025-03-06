package oop;

/* 
 private : 외부 클래스에서 접근 불가 => 그래서 초기화를 생성자를 or setter,getter 이용함
 ㄴ 인스턴스(멤버) 변수에 사용
 public : 외부 클래스에 접근 제한 없음(private 반대)
 ㄴ 생성자, 메서드에 사용
*/
public class Tv3 {

    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자
    public Tv3() {
    } // => size, color 변경에 관한 메서드가 없으면 변경이 불가함

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // setter : 인스턴스 변수(멤버 변수) 값 변경시 사용
    // getter : 인스턴스 변수 사용하고 싶을 때
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() { // => 불린 타입이라 isPower
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    // 메서드 제공
    // 기능 : 전원 켜기/끄기, 채널 변경, 볼륨 변경
    void channelup() {
        channel++;
    }

    void channeldown() {
        channel--;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
