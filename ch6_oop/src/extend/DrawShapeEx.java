package extend;

public class DrawShapeEx {
    public static void main(String[] args) {

        // 삼각형 그리기

        // 방법 1.
        // Point[] p = new Point[3];
        // p[0] = new Point(100, 100);
        // p[1] = new Point(140, 50);
        // p[2] = new Point(200, 100);

        // 방법 2.
        Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };

        Triangle triangle = new Triangle(p);
        triangle.draw(); // 삼각형 그리기

        // 원 그리기

        // 방법 1.
        // Point p1 = new Point(150, 150);
        // Circle c = new Circle(p1, 50);

        // 방법 2.
        Circle c = new Circle(new Point(150, 150), 50);
        c.draw();

    }
}
