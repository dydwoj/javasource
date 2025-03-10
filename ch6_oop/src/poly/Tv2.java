package poly;

public class Tv2 {

    int channel;
    boolean power;

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
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
