package array;

import java.util.Arrays;
import java.util.Scanner;

// 임의의 학생의 수학점수를 입력받아서 평균, 총합 구하기

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr; // 배열 선언

        System.out.print("학생 수 입력 >>");
        int num = sc.nextInt();

        arr = new int[num]; // 배열 생성

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번 학생 점수 입력 >> ", (i + 1));
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // 평균, 총합 구하기
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.printf("총합 = %d, 평균 = %d\n", sum, sum / arr.length);
        System.out.printf("총합 = %d, 평균 = %.2f", sum, (double) sum / arr.length);

        sc.close();

    }
}
