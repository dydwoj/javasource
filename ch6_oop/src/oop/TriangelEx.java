package oop;

public class TriangelEx {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        // 인스턴스 변수 초기화 (만일 생성자가 없다면)
        triangle.baseLine = 13;
        triangle.height = 9;

        System.out.printf("삼각형의 면적 : %.1f\n", triangle.getArea());

        triangle = new Triangle(19, 18);

        System.out.printf("삼각형의 면적 : %.1f", triangle.getArea());

    }
}
