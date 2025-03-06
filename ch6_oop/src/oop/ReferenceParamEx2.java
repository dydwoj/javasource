package oop;

import java.util.Arrays;

// 배열명에 변수를 담으면 {배열명(클래스명)-주소} 같이 담김 but 담겨있는 변수들은 다른 공간에 저장
// main 에서 쭉 값 변경들을 안 넣고 따로 값을 호출하는 이유 : 1. 재사용성   2. 구조화
// 일일히 하면 너무 길어지고 기시성도 너무 떨어짐!!

public class ReferenceParamEx2 {
    public static void main(String[] args) {

        int[] arr = { 3, 2, 1, 6, 5, 4 };

        printArr(arr); // => 먼저 원본을 가지고 실행
        // --------------------------------
        sortArr(arr);
        // 오름차순 정렬 후 결과 => 위에서 아래로 내려오므로 위의 값을 가지고 들어가서 원본 변경
        printArr(arr);
        // --------------------------------
        // 총합 결과
        System.out.println("sum = " + sumArr(arr));

    }

    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    } // 자기일 println 출력이 끝나면 스택 종료(제거)

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        // 버블정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
