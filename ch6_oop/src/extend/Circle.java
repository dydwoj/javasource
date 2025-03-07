package extend;

/* 관계 결정하기
    1. extends(isa) 관계일 시
        publicc class Circle extends Point{}
        원(Circle)은 점(Point) 이다 : circle is a point
    2. 포함(hasa)관계일 시
        원(Circle)은 점(Point)을 가지고 있다 : circle has a point => 이게 맞는 말임 그래서 hasa로 함
    ex. Car 와 SportsCar의 관계
        1. SportsCar는 Car 이다
        2. SportsCar는 Car를 가지고 있다
        = 1. 이 맞는 방법
*/
public class Circle extends Shape {

    Point point; // => int x, y 를 대신하는 것(포함관계)
    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    // 부모인 shape의 void draw를 내려줬지만 아래에 또 한 이유 : 오버라이딩
    void draw() {
        System.out.printf("[center = (%d,%d), r = %d, color = %s]\n",
                point.x, point.y, r, color);
    }

}
