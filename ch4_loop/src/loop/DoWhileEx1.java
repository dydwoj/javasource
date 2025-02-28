package loop;

import java.util.Scanner;

// for, while과 do while의 차이 : do while 은 무조건 1번은 실행 = 조건검사가 후순위

// 생성된 숫자 맞추기

public class DoWhileEx1 {
    public static void main(String[] args) {

        // 컴퓨터가 1 ~ 100 사이의 임의의 수를 생성 /

        // 1~100 사이의 정수를 입력받아서 컴퓨터 숫자 비교 후
        // ex) 더 큰수를 입력 or 더 작은 수 입력 or 정답

        Scanner scanner = new Scanner(System.in);

        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // 사용자 답변 저장

        do {
            System.out.print("1~100사이의 정수를 입력 : ");
            input = scanner.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수 입력");
            } else {
                System.out.println("더 큰 수 입력");
            }
        } while (input != answer);

        System.out.println("정답입니다, 프로그램을 종료합니다.");

        scanner.close();

    }
}
