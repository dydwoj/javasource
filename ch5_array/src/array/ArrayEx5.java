package array;

import java.util.Arrays;

// char값 5개 담기 (a, b, c, d, e)

public class ArrayEx5 {
    public static void main(String[] args) {

        // 배열 선언, 생성
        char chArr[] = { 'a', 'b', 'c', 'd', 'e' };

        // 배열 길이
        System.out.println("길이 : " + chArr.length);

        // 배열 요소 확인
        System.out.println(chArr); // => abcde
        System.out.println(Arrays.toString(chArr)); // => [a, b, c, d, e]

        // 배열 요소 변경
        chArr[2] = 'f';
        System.out.println(Arrays.toString(chArr));

        // double 배열 선언, 생성 (5)
        double dblArr[] = { 1.1, 1.2, 1.3, 1.4, 1.5 };

        System.out.println(dblArr); // => [D@6b884d57(stack 주소 / 각 배열에 맞는 수 X) : char형을 제외하면 모두 이렇게 나옴
        System.out.println(Arrays.toString(dblArr)); // => Arrays.toString : 배열명이 가리키는 곳의 실제 값을 출력해주는 코드

    }
}
