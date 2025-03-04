package array;

import java.util.Arrays;

// numArr의 값 변경하기

public class ArrayEx9 {
    public static void main(String[] args) {

        int numArr[] = new int[10];

        // numArr 0~9 초기화하기
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr)); // => [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        // 배열안의 요소들의 위치 바꾸기 : 새로운 임시 공간을 만들어서 이동
        // int a = 10, b = 15;
        // int temp = a;
        // a = b;
        // b = temp;

        for (int i = 0; i < 100; i++) {
            // 교환위치 임의 생성 : 0~9
            int pos = (int) (Math.random() * (int) numArr.length);

            int temp = numArr[0];
            numArr[0] = numArr[pos];
            numArr[pos] = temp;
        }
        System.out.println(Arrays.toString(numArr));

    }
}
