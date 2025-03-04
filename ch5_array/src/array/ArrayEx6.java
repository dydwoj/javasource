package array;

import java.util.Arrays;

// 배열 : 한번 생성하면 길이 변경 불가

public class ArrayEx6 {
    public static void main(String[] args) {

        int arr[] = { 78, 99, 52, 35, 14 };

        // 추가로 5명의 점수를 추가해야 할때 => 위의 배열을 버리고 새로운 배열을 생성해야 한다.
        int tmp[] = new int[10];

        // 방법 1) 그 이후 기존 배열 값 복사해서 새로운 배열에 붙여넣기
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));

        // 방법 2) System.arraycopy() 사용 = 범위를 지정해서 한번에 복사 가능
        int tmp2[] = new int[10];
        System.arraycopy(arr, 0, tmp2, 1, arr.length);

        System.out.println(Arrays.toString(tmp2)); // => [0, 78, 99, 52, 35, 14, 0, 0, 0, 0]

        /*
         * System.arraycopy(Object src, int srcPos, Object dest, int destPos, int
         * length)
         * System.arraycopy(원본배열, 원본배열에서 복사할 시작 위치, 새로운 배열 지정, 새 배열의 복사 위치, 원본배열에서
         * 몇개복사할건지(원본배열 길이만큼 : 배열명.length))
         */

    }
}
