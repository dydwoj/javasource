package array;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        System.out.println(Arrays.toString(ball));

        // 원본 배열에서 0~5번 배열 위치의 숫자만 교환하는 방법
        for (int i = 0; i < 6; i++) {
            int pos = (int) (Math.random() * 45);

            int temp = ball[i];
            ball[i] = ball[pos];
            ball[pos] = temp;
        }
        System.out.println(Arrays.toString(ball));

    }
}
