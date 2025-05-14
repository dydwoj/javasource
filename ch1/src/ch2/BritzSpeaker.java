package ch2;

public class BritzSpeaker implements Speaker {

    @Override
    public void volumnUp() {
        System.out.println("BritzSpeaker volumnUp");
    }

    @Override
    public void volumnDown() {
        System.out.println("BritzSpeaker volumnDown");
    }

}
