package oop;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.size = 50;
        tv.color = "black";

        Tv2 tv2 = new Tv2(60, "white");
        // tv2.size = 60; => The field Tv2.size is not visible(접근 불가)
        // tv 켜기
        tv2.power();
        // 채널 변경
        tv2.channelChange(7);

        Tv2 tv3 = new Tv2();
        tv3.power();
        tv3.channelChange(11);

        Tv3 obj1 = new Tv3();
        System.out.println("처음 상태");
        System.out.println(obj1.toString()); // [size=0, color=null, channel=0, volume=0, power=false]

        // 생성자가 아니어도 값을 변경하는 방식 : setter, getter
        obj1.setSize(60);
        obj1.setColor("green");
        // 확인 방법
        System.out.println("색상 " + obj1.getColor());
        System.out.println("사이즈 " + obj1.getSize());

    }
}
