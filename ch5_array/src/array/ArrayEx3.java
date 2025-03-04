package array;

import java.util.Arrays;
import java.util.Scanner;

// 5명 학생의 수학점수를 입력받아서 평균, 총합 구하기

public class ArrayEx3 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        // System.out.print("첫번째 학생 점수 입력 >> ");
        // arr[0] = sc.nextInt();

        // System.out.print("두번째 학생 점수 입력 >> ");
        // arr[1] = sc.nextInt();

        // System.out.print("세번째 학생 점수 입력 >> ");
        // arr[2] = sc.nextInt();

        // System.out.print("네번째 학생 점수 입력 >> ");
        // arr[3] = sc.nextInt();

        // System.out.print("다섯번째 학생 점수 입력 >> ");
        // arr[4] = sc.nextInt();

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
