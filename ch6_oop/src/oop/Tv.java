package oop;

// 여기는 틀

/* Tv 클래스를 이용해서 Tv(인스턴스) 생성
    객체 구성요소
    1. 속성(특성) => 멤버변수(클래스내에 선언한 것들)
        (ex. 아래의 size, color 같은 거 but 평소 하던 main 안의 변수는 그냥 변수)
    2. 기능(동작) => 멤버메소드
*/

public class Tv {
    // 크기(int), 색상(String), 채널(int), 볼륨(int) 등 : 속성
    int size;
    String color;
    int channel;
    int volume;
    boolean power;

    // 전원 켜기/끄기, 채널 변경, 볼륨 변경 : 기능
    void channelup() {
        channel++;
    }

    void channeldown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    // 주소가 나오게 하는거 대신 toString을 만들어주면 멤버 변수들을 불러갈 수 있게 해줌
    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
