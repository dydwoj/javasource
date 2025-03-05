package oop;

// 정사각형 구하기

public class Square {

    // 속성 : 길이(sideLength)
    int sideLength;

    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    // 기능 : 면적을 구한다
    int getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + "]";
    }

}
