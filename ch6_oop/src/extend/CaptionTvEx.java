package extend;

public class CaptionTvEx {
    public static void main(String[] args) {

        // 부모 인스턴스 생성
        Tv tv = new Tv();
        tv.power = true;

        // 자식 인스턴스 생성
        CaptionTv captionTv = new CaptionTv();
        captionTv.channel = 10;
        captionTv.channelup();
        System.out.println("현재 채널 : " + captionTv.channel);
        captionTv.displayCaption("Hello Java");
        captionTv.caption = true; // 위에는 false기 때문에 안나옴
        captionTv.displayCaption("Hello Java");

    }
}
