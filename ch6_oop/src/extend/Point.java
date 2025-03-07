package extend;

// 좌표상의 한 점을 다루기 위한 클래스

public class Point {

    int x;
    int y;

    // 생성자 안에서 다른 생성자를 호출 가능
    // 다른 클래스에서 new Point(); 를 호출하면 public Point() 생성자 호출
    public Point() {
        this(0, 0);
    } // => public Point(int x, int y) 생성자를 호출하고 있음

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getXY() {
        return "(" + x + "," + y + ")";
    }

}
