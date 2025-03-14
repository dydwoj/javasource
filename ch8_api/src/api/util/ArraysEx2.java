package api.util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {

        Integer[] arr = { 33, 24, 15, 66, 7 };

        // 검색
        Arrays.sort(arr);
        System.out.println("15 위치 : " + Arrays.binarySearch(arr, 33));

        Integer[] arr1 = { 33, 24, 15, 66, 7 };
        Integer[] arr2 = { 33, 24, 15, 66, 8 };
        System.out.println(Arrays.equals(arr1, arr2));

    }
}
