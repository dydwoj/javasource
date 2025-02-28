package loop;

import java.util.Scanner;

// *을 출력할 라인의 수 입력받기

public class ForEx9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 숫자 입력 >> ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) { // i가 값이 1 ~5 까지 바뀌니까
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();

    }
}
