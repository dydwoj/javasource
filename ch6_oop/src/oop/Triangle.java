package oop;

public class Triangle {

    // 속성 : 밑변, 높이
    int baseLine;
    int height;

    // 생성자
    public Triangle() {
    }

    /*
     * 생성자의 목적
     * 1) 인스턴스 변수 초기화
     */
    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    // 기능 : 면적을 구한다 (getArea)
    double getArea() {
        return baseLine * height / 2.0;
    }

}
