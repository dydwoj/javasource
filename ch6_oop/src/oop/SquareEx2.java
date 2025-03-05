package oop;

import java.util.Arrays;

public class SquareEx2 {
    public static void main(String[] args) {

        // 타입 배열명[] = new 타입[5];
        // 타입 배열명[] = {};

        // 객체 배열
        // 객체(클래스)명 배열명[] = new 객체(클래스)명[]

        // => 기초값 : 객체값=null, 기본형은=그 값
        // 정수형 - 0 / 실수형 - 0.0 / 불린형 - false / 문자형 - null

        Square squareArr[] = new Square[5];
        System.out.println(Arrays.toString(squareArr)); // => [null, null, null, null, null]

        // 객체 배열 초기화 => 아래는 전부 sideLength=0
        // squareArr[0] = new Square();
        // squareArr[1] = new Square();
        // squareArr[2] = new Square();
        // squareArr[3] = new Square();
        // squareArr[4] = new Square();

        // 객체배열 초기화를 한다면
        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square();
        }

        // sideLength 값 부여
        squareArr[0].sideLength = 35;
        squareArr[1].sideLength = 36;
        squareArr[2].sideLength = 37;
        squareArr[3].sideLength = 38;
        squareArr[4].sideLength = 39;

        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d번째 면적 : %d\n", (i + 1), squareArr[i].getArea());
        }

    }
}
