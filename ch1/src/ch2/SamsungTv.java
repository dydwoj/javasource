package ch2;

public class SamsungTv implements Tv {

    @Override
    public void powerOn() {
        System.out.println("SamsungTv - 파워 On");
    }

    @Override
    public void powerOff() {
        System.out.println("SamsungTv - 파워 Off");
    }

    @Override
    public void volumnUp() {
        System.out.println("SamsungTv - 볼륨 Up");
    }

    @Override
    public void volumnDown() {
        System.out.println("SamsungTv - 볼륨 Down");
    }

}
