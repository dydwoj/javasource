package array;

import java.util.Arrays;

// 정수 타입의 배열 선언

/*
 * 배열 요소의 값 확인
 * 1) for문 사용 : 원하는 형태로 출력 가능
 * 2) 향상된 for문 사용 : 1) 과 같음
 * 3) Arrays.toString(배열명) : [배욜요소 출력]
 */

public class ArrayEx2 {
    public static void main(String[] args) {

        int[] arr = new int[10]; // int 뒤의 "[]" 위치는 배열명 앞 or 뒤 둘 다 가능

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;
        }
        System.out.println(Arrays.toString(arr)); // => [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // 향상된 for문 : index 사용 X (대신 int idx = 0; 해주고 print내용에 ++idx 추가해서 가능)
        int idx = 0;
        for (int i : arr) { // for (int i : arr) => arr에 담긴 변수를 알아서 차례대로 가져온다는 뜻
            System.out.print(++idx + " : " + i + "\t");
        }
        System.out.println();

        // 일반 for문 : index 붙이기에는 훨씬 용이함
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " : " + arr[i] + "\t");
        }

    }
}
