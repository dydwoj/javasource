package oop;

import java.util.Arrays;

public class SquareEx {
    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println("면적 : " + square.getArea());

        // 타입 배열명[] = new 타입[5];
        // 타입 배열명[] = {};

        // 객체 배열
        // 객체(클래스)명 배열명[] = new 객체(클래스)명[]

        // => 기초값 : 객체값=null, 기본형은=그 값
        // 정수형 - 0 / 실수형 - 0.0 / 불린형 - false / 문자형 - null

        Square squareArr[] = new Square[5];
        System.out.println(Arrays.toString(squareArr)); // => [null, null, null, null, null]

        squareArr[0] = new Square(15);
        // System.out.println(squareArr[0].getArea());
        squareArr[1] = new Square(16);
        // System.out.println(squareArr[1].getArea());
        squareArr[2] = new Square(17);
        // System.out.println(squareArr[2].getArea());
        squareArr[3] = new Square(18);
        // System.out.println(squareArr[3].getArea());
        squareArr[4] = new Square(19);
        // System.out.println(squareArr[4].getArea());
        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d번째 면적 : %d\n", (i + 1), squareArr[i].getArea());
        }

        // 배열 기본타입으로 생성
        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr)); // => [0, 0, 0, 0, 0]
        arr[0] = 15;
        arr[1] = 16;
        arr[2] = 17;
        arr[3] = 18;
        arr[4] = 19;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
